package ch.heig.amt.api.endpoints;

import ch.heig.amt.api.RulesApi;
import ch.heig.amt.api.model.*;

import ch.heig.amt.entities.ApplicationEntity;
import ch.heig.amt.entities.BadgeEntity;
import ch.heig.amt.entities.PointScaleEntity;
import ch.heig.amt.entities.RuleEntity;
import ch.heig.amt.repositories.ApplicationRepository;
import ch.heig.amt.repositories.BadgeRepository;
import ch.heig.amt.repositories.PointScaleRepository;
import ch.heig.amt.repositories.RuleRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;

import javax.xml.ws.Response;
import java.util.ArrayList;
import java.util.List;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-01-17T18:45:54.991+01:00")
@Controller
public class RulesApiController implements RulesApi {

    private RuleRepository ruleRepository;
    private PointScaleRepository pointScaleRepository;
    private BadgeRepository badgeRepository;
    private ApplicationRepository applicationRepository;

    public RulesApiController(RuleRepository ruleRepository,
                              ApplicationRepository applicationRepository,
                              BadgeRepository badgeRepository,
                              PointScaleRepository pointScaleRepository) {
        this.ruleRepository = ruleRepository;
        this.applicationRepository = applicationRepository;
        this.badgeRepository = badgeRepository;
        this.pointScaleRepository = pointScaleRepository;
    }


    @Override
    public ResponseEntity<List<RuleResponseDTO>> rulesGet(@RequestHeader(value="X-Gamification-Token", required = true) String xGamificationToken) {

        // Check user is allowed to post event
        ApplicationEntity applicationEntity = this.applicationRepository.findByToken(xGamificationToken);
        if (applicationEntity == null) {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).build();
        }
        Iterable<RuleEntity> all = ruleRepository.findAllByBadgeEntity_ApplicationEntity(applicationEntity);

        List<RuleResponseDTO> ruleDTOS = new ArrayList<>();
        for (RuleEntity r: all) {
            ruleDTOS.add(toRuleResponseDTO(r));
        }

        return ResponseEntity.ok(ruleDTOS);
    }

    @Override
    public ResponseEntity<Void> rulesIdDelete(@RequestHeader(value="X-Gamification-Token", required = true) String xGamificationToken,
                                              @PathVariable("id") Integer id) {

        // Check user is allowed to post event
        ApplicationEntity applicationEntity = this.applicationRepository.findByToken(xGamificationToken);
        if (applicationEntity == null) {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).build();
        }

        RuleEntity one = ruleRepository.findAllByIdAndBadgeEntity_ApplicationEntity(id, applicationEntity);

        if (one == null) {
            return ResponseEntity.notFound().build();
        }

        ruleRepository.delete(one);

        return ResponseEntity.status(HttpStatus.OK).build();
    }

    @Override
    public ResponseEntity<RuleResponseDTO> rulesIdGet(@RequestHeader(value="X-Gamification-Token", required = true) String xGamificationToken,
                                              @PathVariable("id") Integer id) {

        // Check user is allowed to post event
        ApplicationEntity applicationEntity = this.applicationRepository.findByToken(xGamificationToken);
        if (applicationEntity == null) {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).build();
        }

        RuleEntity ruleEntity = ruleRepository.findAllByIdAndBadgeEntity_ApplicationEntity(id, applicationEntity);

        if (ruleEntity == null) {
            return ResponseEntity.notFound().build();
        }

        RuleResponseDTO ruleDTO = toRuleResponseDTO(ruleEntity);

        return ResponseEntity.ok(ruleDTO);
    }

    @Override
    public ResponseEntity<Void> rulesIdPut(@RequestHeader(value="X-Gamification-Token", required = true) String xGamificationToken,
                                           @PathVariable("id") Integer id,
                                           @RequestBody RuleDTO body) {

        // Check user is allowed to post event
        ApplicationEntity applicationEntity = this.applicationRepository.findByToken(xGamificationToken);
        if (applicationEntity == null) {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).build();
        }

        RuleEntity ruleEntity = ruleRepository.findAllByIdAndBadgeEntity_ApplicationEntity(id, applicationEntity);

        // Update DTO attributes
        ruleEntity.setName(body.getName());
        ruleEntity.setThreshold(body.getThreshold());
        this.ruleRepository.save(ruleEntity);

        return ResponseEntity.status(HttpStatus.OK).build();
    }

    @Override
    public ResponseEntity<Void> rulesPost(@RequestHeader(value="X-Gamification-Token", required = true) String xGamificationToken,
                                          @RequestBody RuleDTO body) {

        // Check app is allowed to post event
        ApplicationEntity applicationEntity = this.applicationRepository.findByToken(xGamificationToken);
        if (applicationEntity == null) {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).build();
        }

        PointScaleEntity pointScale = this.pointScaleRepository.findPointScaleEntitiesByApplicationEntityAndId(applicationEntity, body.getPointScaleId());
        BadgeEntity badge = this.badgeRepository.findByIdAndApplicationEntity(body.getBadgeId(), applicationEntity);

        if(badge == null || pointScale == null)
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();

        RuleEntity ruleEntity = toRuleEntity(body);
        ruleEntity.setBadgeEntity(badge);
        ruleEntity.setPointScaleEntity(pointScale);
        ruleRepository.save(ruleEntity);

        return ResponseEntity.status(HttpStatus.CREATED).header("newId", String.valueOf(ruleEntity.getId())).build();
    }

    public RuleEntity toRuleEntity(RuleDTO ruleDTO) {

        RuleEntity ruleEntity = new RuleEntity();

        ruleEntity.setName(ruleDTO.getName());
        ruleEntity.setThreshold(ruleDTO.getThreshold());

        return ruleEntity;
    }

    public RuleDTO toRuleDTO(RuleEntity ruleEntity) {
        RuleDTO ruleDTO = new RuleDTO();
        ruleDTO.setName(ruleEntity.getName());
        ruleDTO.setThreshold(ruleEntity.getThreshold());

        return ruleDTO;
    }

    public RuleResponseDTO toRuleResponseDTO(RuleEntity ruleEntity) {
        RuleResponseDTO ruleResponseDTO = new RuleResponseDTO();
        ruleResponseDTO.setName(ruleEntity.getName());
        ruleResponseDTO.setType(ruleEntity.getType());
        ruleResponseDTO.setQuantity(ruleEntity.getThreshold());
        ruleResponseDTO.setBadge(this.toBadgeDTO(ruleEntity.getBadgeEntity()));
        ruleResponseDTO.setPointScale(this.toPointScaleDTO(ruleEntity.getPointScaleEntity()));
        return ruleResponseDTO;
    }

    public BadgeDTO toBadgeDTO(BadgeEntity badgeEntity) {

        BadgeDTO badgeDTO = new BadgeDTO();
        badgeDTO.setName(badgeEntity.getName());

        return badgeDTO;
    }

    public PointScaleDTO toPointScaleDTO(PointScaleEntity pointScaleEntity) {
        PointScaleDTO pointScaleDTO = new PointScaleDTO();
        pointScaleDTO.setName(pointScaleEntity.getName());

        return pointScaleDTO;
    }
}
