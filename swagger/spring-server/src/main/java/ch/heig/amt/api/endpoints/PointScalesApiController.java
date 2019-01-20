package ch.heig.amt.api.endpoints;

import ch.heig.amt.api.PointScalesApi;
import ch.heig.amt.api.model.PointScaleDTO;
import ch.heig.amt.entities.ApplicationEntity;
import ch.heig.amt.entities.PointAwardEntity;
import ch.heig.amt.entities.PointScaleEntity;
import ch.heig.amt.repositories.ApplicationRepository;
import ch.heig.amt.repositories.PointScaleRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;

import java.util.ArrayList;
import java.util.List;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-01-17T18:45:54.991+01:00")
@Controller
public class PointScalesApiController implements PointScalesApi {

    private ApplicationRepository applicationRepository;
    private PointScaleRepository pointScaleRepository;

    public PointScalesApiController(ApplicationRepository applicationRepository, PointScaleRepository pointScaleRepository) {
        this.applicationRepository = applicationRepository;
        this.pointScaleRepository = pointScaleRepository;
    }

    @Override
    public ResponseEntity<List<PointScaleDTO>> pointScalesGet(@RequestHeader(value="X-Gamification-Token", required = true) String xGamificationToken) {

        // Check user is allowed to post event
        ApplicationEntity applicationEntity = this.applicationRepository.findByToken(xGamificationToken);
        if (applicationEntity == null) {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).build();
        }

        Iterable<PointScaleEntity> pointScaleRepositoryAll = pointScaleRepository.findPointScaleEntitiesByApplicationEntity(applicationEntity);
        List<PointScaleDTO> pointScaleDTOS = new ArrayList<>();
        for (PointScaleEntity pointScaleEntity : pointScaleRepositoryAll) {
            System.out.println(pointScaleEntity.toString());
            pointScaleDTOS.add(toPointScaleDTO(pointScaleEntity));
        }

        return new ResponseEntity<>(pointScaleDTOS, HttpStatus.OK);
    }

    @Override
    public ResponseEntity<Void> pointScalesIdDelete(@RequestHeader(value="X-Gamification-Token", required = true) String xGamificationToken,
                                                    @PathVariable("id") Integer id) {

        // Check user is allowed to post event
        ApplicationEntity applicationEntity = this.applicationRepository.findByToken(xGamificationToken);
        if (applicationEntity == null) {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).build();
        }

        PointScaleEntity pointScale = this.pointScaleRepository.findPointScaleEntitiesByApplicationEntityAndId(applicationEntity, id);

        if (pointScale == null)
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);

        pointScaleRepository.delete(pointScale);

        return ResponseEntity.status(HttpStatus.OK).build();
    }

    @Override
    public ResponseEntity<PointScaleDTO> pointScalesIdGet(@RequestHeader(value="X-Gamification-Token", required = true) String xGamificationToken,
                                                          @PathVariable("id") Integer id) {

        // Check user is allowed to post event
        ApplicationEntity applicationEntity = this.applicationRepository.findByToken(xGamificationToken);
        if (applicationEntity == null) {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).build();
        }

        PointScaleEntity pointScaleEntity = pointScaleRepository.findPointScaleEntitiesByApplicationEntityAndId(applicationEntity, id);

        if (pointScaleEntity == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

        PointScaleDTO pointScaleDTO = toPointScaleDTO(pointScaleEntity);

        return new ResponseEntity<>(pointScaleDTO, HttpStatus.OK);
    }


    @Override
    public ResponseEntity<Void> pointScalesIdPut(@RequestHeader(value="X-Gamification-Token", required = true) String xGamificationToken,
                                                 @PathVariable("id") Integer id,
                                                 @RequestBody PointScaleDTO body) {

        // Check app is allowed to post
        ApplicationEntity applicationEntity = this.applicationRepository.findByToken(xGamificationToken);
        if (applicationEntity == null) {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).build();
        }

        PointScaleEntity pointScaleRepositoryOne = pointScaleRepository.findPointScaleEntitiesByApplicationEntityAndId(applicationEntity, id);

        if (pointScaleRepositoryOne == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

        pointScaleRepositoryOne.setName(body.getName());
        pointScaleRepository.save(pointScaleRepositoryOne);

        return ResponseEntity.status(HttpStatus.OK).build();
    }

    @Override
    public ResponseEntity<Void> pointScalesPost(@RequestHeader(value="X-Gamification-Token", required = true) String xGamificationToken, @RequestBody PointScaleDTO body) {

        // Check app is allowed to post
        ApplicationEntity applicationEntity = this.applicationRepository.findByToken(xGamificationToken);
        if (applicationEntity == null) {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).build();
        }

        PointScaleEntity pointScaleEntity = toPointScaleEntity(body);
        pointScaleEntity.setApplicationEntity(applicationEntity);
        pointScaleRepository.save(pointScaleEntity);

        return ResponseEntity.status(HttpStatus.CREATED).header("newId", String.valueOf(pointScaleEntity.getId())).build();
    }

    public PointScaleDTO toPointScaleDTO(PointScaleEntity pointScaleEntity) {
        PointScaleDTO pointScaleDTO = new PointScaleDTO();
        pointScaleDTO.setName(pointScaleEntity.getName());

        return pointScaleDTO;
    }

    public PointScaleEntity toPointScaleEntity(PointScaleDTO pointScaleDTO) {
        PointScaleEntity pointScaleEntity = new PointScaleEntity();
        pointScaleEntity.setName(pointScaleDTO.getName());

        return pointScaleEntity;
    }
}
