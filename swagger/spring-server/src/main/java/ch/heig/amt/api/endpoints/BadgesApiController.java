package ch.heig.amt.api.endpoints;

import ch.heig.amt.api.BadgesApi;
import ch.heig.amt.api.model.BadgeDTO;
import ch.heig.amt.entities.ApplicationEntity;
import ch.heig.amt.entities.BadgeEntity;
import ch.heig.amt.repositories.ApplicationRepository;
import ch.heig.amt.repositories.BadgeRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;

import java.util.List;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-01-17T18:45:54.991+01:00")
@Controller
public class BadgesApiController implements BadgesApi {

    private BadgeRepository badgeRepository;
    private ApplicationRepository applicationRepository;

    public BadgesApiController(BadgeRepository badgeRepository, ApplicationRepository applicationRepository) {
        this.badgeRepository = badgeRepository;
        this.applicationRepository = applicationRepository;
    }

    @Override
    public ResponseEntity<Void> badgesDelete(@RequestHeader(value="X-Gamification-Token", required = true) String xGamificationToken, Integer id) {

        // Check auth is allowed to post event
        ApplicationEntity applicationEntity = this.applicationRepository.findByToken(xGamificationToken);
        if (applicationEntity == null) {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).build();
        }

        Long lid = Long.valueOf(id.longValue());

        // Find matching badge & delete it
        badgeRepository.delete(lid);

        return new ResponseEntity<>(HttpStatus.OK);
    }

    @Override
    public ResponseEntity<List<BadgeDTO>> badgesGet(@RequestHeader(value="X-Gamification-Token", required = true) String xGamificationToken) {

        // Check user is allowed to post event
        ApplicationEntity applicationEntity = this.applicationRepository.findByToken(xGamificationToken);
        if (applicationEntity == null) {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).build();
        }

        // Fetch list of badges
        Iterable<BadgeEntity> badgeEntities = this.badgeRepository.findAll();
        List<BadgeDTO> badgeDTOS = null;
        for (BadgeEntity badgeEntity: badgeEntities) {
            badgeDTOS.add(toBadgeDTO(badgeEntity));
        }

        return new ResponseEntity(badgeDTOS, HttpStatus.OK);
    }

    @Override
    public ResponseEntity<Void> badgesPost(@RequestHeader(value="X-Gamification-Token", required = true) String xGamificationToken, @RequestBody BadgeDTO body) {

        // Check user is allowed to post event
        ApplicationEntity applicationEntity = this.applicationRepository.findByToken(xGamificationToken);
        if (applicationEntity == null) {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).build();
        }

        // save new badge to database
        BadgeEntity badgeEntity = toBadgeEntity(body);
        badgeEntity.setApplicationEntity(applicationEntity);
        badgeRepository.save(badgeEntity);

        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    public BadgeEntity toBadgeEntity(BadgeDTO badgeDTO) {

        BadgeEntity badgeEntity = new BadgeEntity();
        badgeEntity.setName(badgeDTO.getName());

        return badgeEntity;
    }

    public BadgeDTO toBadgeDTO(BadgeEntity badgeEntity) {

        BadgeDTO badgeDTO = new BadgeDTO();
        badgeDTO.setName(badgeEntity.getName());

        return badgeDTO;
    }
}
