package ch.heig.amt.api.endpoints;

import ch.heig.amt.api.UsersApi;
import ch.heig.amt.api.model.ApplicationDTO;
import ch.heig.amt.api.model.BadgeDTO;
import ch.heig.amt.api.model.PointScaleDTO;
import ch.heig.amt.api.model.UserDTO;
import ch.heig.amt.entities.ApplicationEntity;
import ch.heig.amt.entities.BadgeEntity;
import ch.heig.amt.entities.PointScaleEntity;
import ch.heig.amt.entities.UserEntity;
import ch.heig.amt.repositories.ApplicationRepository;
import ch.heig.amt.repositories.EventRepository;
import ch.heig.amt.repositories.UserRepository;
import org.h2.engine.User;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestHeader;

import java.util.ArrayList;
import java.util.List;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-01-17T18:45:54.991+01:00")
@Controller
public class UsersApiController implements UsersApi {

    private UserRepository userRepository;
    private ApplicationRepository applicationRepository;

    public UsersApiController(ApplicationRepository applicationRepository, UserRepository userRepository) {
        this.userRepository = userRepository;
        this.applicationRepository = applicationRepository;
    }

    @Override
    public ResponseEntity<List<UserDTO>> usersGet(@RequestHeader(value="X-Gamification-Token", required = true) String xGamificationToken) {

        List<UserDTO> userDTOS = new ArrayList<UserDTO>();
        ApplicationEntity applicationEntity = applicationRepository.findByToken(xGamificationToken);

        if (applicationEntity == null) {
            // Application doesn't exist
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).build();
        }

        List<UserEntity> userEntities = userRepository.findAllByApplicationEntity(applicationEntity);

        if (userEntities == null) {
            // User doesn't exist
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }

        // New parameters for DTO
        UserDTO userDTO = new UserDTO();
        List<BadgeDTO> badgeDTOS = new ArrayList<BadgeDTO>();
        BadgeDTO badgeDTO = new BadgeDTO();

        for (int i = 0; i < userEntities.size(); i++) {
            // Add DTO
            userDTOS.add(this.toUserDTO(userEntities.get(i)));
        }

        return new ResponseEntity<>(userDTOS, HttpStatus.OK);
    }


    @Override
    public ResponseEntity<UserDTO> usersIdGet(@RequestHeader(value="X-Gamification-Token", required = true) String xGamificationToken, Integer id) {

        ApplicationEntity applicationEntity = applicationRepository.findByToken(xGamificationToken);

        if (applicationEntity == null) {
            // Application doesn't exist
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).build();
        }

        Long lid = Long.valueOf(id.longValue());
        UserEntity userEntity = userRepository.findUserEntityByApplicationEntityAndId(applicationEntity, lid);

        if (userEntity == null) {
            // User doesn't exist
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }

        UserDTO userDTO = toUserDTO(userEntity);

        return new ResponseEntity<>(userDTO, HttpStatus.OK);
    }


    public UserDTO toUserDTO(UserEntity userEntity) {

        UserDTO userDTO = new UserDTO();
        List<BadgeDTO> badgeDTOS = null;

        userDTO.setUsername(userEntity.getUsername());

        for (int i = 0; i < userEntity.getBadgeEntities().size(); i++) {
            BadgeDTO badgeDTO = new BadgeDTO();
            badgeDTO.setName(userEntity.getBadgeEntities().get(i).getName());
            badgeDTOS.add(badgeDTO);
        }

        userDTO.setBadges(badgeDTOS);

        return userDTO;
    }

}
