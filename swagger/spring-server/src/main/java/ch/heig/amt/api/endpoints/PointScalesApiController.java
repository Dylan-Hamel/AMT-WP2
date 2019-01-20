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
    public ResponseEntity<List<PointScaleDTO>> pointScalesGet(String xGamificationToken) {

        // Check user is allowed to post event
        ApplicationEntity applicationEntity = this.applicationRepository.findByToken(xGamificationToken);
        if (applicationEntity == null) {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).build();
        }

        Iterable<PointScaleEntity> pointScaleRepositoryAll = pointScaleRepository.findAll();
        List<PointScaleDTO> pointScaleDTOS = new ArrayList<>();
        for (PointScaleEntity pointScaleEntity : pointScaleRepositoryAll) {
            System.out.println(pointScaleEntity.toString());
            pointScaleDTOS.add(toPointScaleDTO(pointScaleEntity));
        }

        return new ResponseEntity<>(pointScaleDTOS, HttpStatus.OK);
    }

    @Override
    public ResponseEntity<Void> pointScalesIdDelete(String xGamificationToken, Integer id) {

        // Check user is allowed to post event
        ApplicationEntity applicationEntity = this.applicationRepository.findByToken(xGamificationToken);
        if (applicationEntity == null) {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).build();
        }

        Long lid = Long.valueOf(id.longValue());
        if (pointScaleRepository.exists(lid)) {
            pointScaleRepository.delete(lid);

            return new ResponseEntity<>(HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @Override
    public ResponseEntity<PointScaleDTO> pointScalesIdGet(String xGamificationToken, Integer id) {

        // Check user is allowed to post event
        ApplicationEntity applicationEntity = this.applicationRepository.findByToken(xGamificationToken);
        if (applicationEntity == null) {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).build();
        }

        Long lid = Long.valueOf(id.longValue());
        PointScaleEntity pointScaleEntity = pointScaleRepository.findOne(lid);

        if (pointScaleEntity == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

        PointScaleDTO pointScaleDTO = toPointScaleDTO(pointScaleEntity);

        return new ResponseEntity<>(pointScaleDTO, HttpStatus.OK);
    }


    @Override
    public ResponseEntity<Void> pointScalesIdPut(String xGamificationToken, Integer id, PointScaleDTO body) {

        // Check app is allowed to post
        ApplicationEntity applicationEntity = this.applicationRepository.findByToken(xGamificationToken);
        if (applicationEntity == null) {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).build();
        }

        Long lid = Long.valueOf(id.longValue());
        PointScaleEntity pointScaleRepositoryOne = pointScaleRepository.findOne(lid);

        if (pointScaleRepositoryOne == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

        pointScaleRepositoryOne.setName(body.getName());
        pointScaleRepository.save(pointScaleRepositoryOne);

        return new ResponseEntity<>(HttpStatus.OK);
    }

    @Override
    public ResponseEntity<Void> pointScalesPost(String xGamificationToken, @RequestBody PointScaleDTO body) {

        // Check app is allowed to post
        ApplicationEntity applicationEntity = this.applicationRepository.findByToken(xGamificationToken);
        if (applicationEntity == null) {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).build();
        }

        PointScaleEntity pointScaleEntity = toPointScaleEntity(body);
        pointScaleEntity.setApplicationEntity(applicationEntity);
        pointScaleRepository.save(pointScaleEntity);

        return new ResponseEntity<>(HttpStatus.CREATED);
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
