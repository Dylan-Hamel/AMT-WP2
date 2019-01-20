package ch.heig.amt.api.endpoints;

import ch.heig.amt.api.EventsApi;
import ch.heig.amt.api.model.EventDTO;
import ch.heig.amt.entities.ApplicationEntity;
import ch.heig.amt.entities.EventEntity;
import ch.heig.amt.entities.PropertyEntity;
import ch.heig.amt.entities.UserEntity;
import ch.heig.amt.repositories.ApplicationRepository;
import ch.heig.amt.repositories.EventRepository;
import ch.heig.amt.repositories.UserRepository;
import org.apache.tomcat.jni.Local;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;

import java.time.LocalDateTime;
import java.util.List;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-01-17T18:45:54.991+01:00")
@Controller
public class EventsApiController implements EventsApi {

    private EventRepository eventRepository;
    private UserRepository userRepository;
    private ApplicationRepository applicationRepository;

    public EventsApiController(EventRepository eventRepository, UserRepository userRepository, ApplicationRepository applicationRepository) {
        this.eventRepository = eventRepository;
        this.userRepository = userRepository;
        this.applicationRepository = applicationRepository;
    }

    public EventEntity toEventEntity(EventDTO eventDTO) {

        EventEntity eventEntity = new EventEntity();
        eventEntity.setType(eventDTO.getType());
        // eventEntity.setPropertyEntities(eventDTO.getProperties());
        eventEntity.setLocalDateTime(eventDTO.getTimestamp().toLocalDateTime());

        return eventEntity;
    }

    private EventDTO toEventDTO(EventEntity eventEntity) {

        EventDTO eventDTO = new EventDTO();
        eventDTO.setType(eventEntity.getType());

        return eventDTO;
    }

    @Override
    public ResponseEntity<Void> eventsPost(@RequestHeader(value="X-Gamification-Token", required = true) String xGamificationToken,
                                           @RequestBody EventDTO body) {

        // Check user is allowed to post event
        ApplicationEntity applicationEntity = this.applicationRepository.findByToken(xGamificationToken);
        if (applicationEntity == null) {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).build();
        }

        UserEntity user = this.userRepository.findByUsernameAndApplicationEntity(body.getUser(), applicationEntity);

        // Create user if not exits
        if(user == null) {
            user = new UserEntity();
            user.setUsername(body.getUser());

            // Set linked application entity
            user.setApplicationEntity(applicationEntity);
        }

        EventEntity event = toEventEntity(body);

        // Set user, event time & properties
        event.setUserEntity(user);
        event.getPropertyEntities().add((PropertyEntity) body.getProperties());
        event.setLocalDateTime(LocalDateTime.now());
        this.eventRepository.save(event);

        return ResponseEntity.ok().build();
    }
}
