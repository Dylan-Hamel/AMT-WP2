package ch.heig.amt.api.endpoints;

import ch.heig.amt.api.RulesApi;
import ch.heig.amt.api.model.RuleDTO;

import ch.heig.amt.api.model.RuleResponseDTO;
import ch.heig.amt.entities.ApplicationEntity;
import ch.heig.amt.entities.RuleEntity;
import ch.heig.amt.repositories.ApplicationRepository;
import ch.heig.amt.repositories.RuleRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.RequestHeader;

import java.util.ArrayList;
import java.util.List;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-01-17T18:45:54.991+01:00")
@Controller
public class RulesApiController implements RulesApi {

    private RuleRepository ruleRepository;
    private ApplicationRepository applicationRepository;

    public RulesApiController(RuleRepository ruleRepository, ApplicationRepository applicationRepository) {
        this.ruleRepository = ruleRepository;
        this.applicationRepository = applicationRepository;
    }


    @Override
    public ResponseEntity<List<RuleResponseDTO>> rulesGet(@RequestHeader(value="X-Gamification-Token", required = true) String xGamificationToken) {

        // Check user is allowed to post event
        ApplicationEntity applicationEntity = this.applicationRepository.findByToken(xGamificationToken);
        if (applicationEntity == null) {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).build();
        }

        Iterable<RuleEntity> all = ruleRepository.findAll();
        List<RuleDTO> ruleDTOS = new ArrayList<>();
        for (RuleEntity r: all) {
            ruleDTOS.add(toRuleDTO(r));
        }

        // return new ResponseEntity<>(ruleDTOS, HttpStatus.HTTP_VERSION_NOT_SUPPORTED)
        return null;
    }

    @Override
    public ResponseEntity<Void> rulesIdDelete(@RequestHeader(value="X-Gamification-Token", required = true) String xGamificationToken, Integer id) {

        // Check user is allowed to post event
        ApplicationEntity applicationEntity = this.applicationRepository.findByToken(xGamificationToken);
        if (applicationEntity == null) {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).build();
        }

        Long lid = Long.valueOf(id.longValue());
        RuleEntity one = ruleRepository.findOne(lid);

        if (one == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

        ruleRepository.delete(lid);

        return new ResponseEntity<>(HttpStatus.OK);
    }

    @Override
    public ResponseEntity<RuleDTO> rulesIdGet(@RequestHeader(value="X-Gamification-Token", required = true) String xGamificationToken, Integer id) {

        // Check user is allowed to post event
        ApplicationEntity applicationEntity = this.applicationRepository.findByToken(xGamificationToken);
        if (applicationEntity == null) {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).build();
        }

        Long lid = Long.valueOf(id.longValue());
        RuleEntity ruleEntity = ruleRepository.findOne(lid);

        if (ruleEntity == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

        RuleDTO ruleDTO = toRuleDTO(ruleEntity);

        return new ResponseEntity<>(ruleDTO, HttpStatus.OK);
    }

    @Override
    public ResponseEntity<Void> rulesIdPut(@RequestHeader(value="X-Gamification-Token", required = true) String xGamificationToken, Integer id, RuleDTO body) {

        // Check user is allowed to post event
        ApplicationEntity applicationEntity = this.applicationRepository.findByToken(xGamificationToken);
        if (applicationEntity == null) {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).build();
        }

        Long lid = Long.valueOf(id.longValue());
        RuleEntity ruleEntity = ruleRepository.findOne(lid);

        return new ResponseEntity<>(HttpStatus.OK);
    }

    @Override
    public ResponseEntity<Void> rulesPost(@RequestHeader(value="X-Gamification-Token", required = true) String xGamificationToken, RuleDTO body) {

        // Check user is allowed to post event
        ApplicationEntity applicationEntity = this.applicationRepository.findByToken(xGamificationToken);
        if (applicationEntity == null) {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).build();
        }

        return new ResponseEntity<>(HttpStatus.CREATED);
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
}
