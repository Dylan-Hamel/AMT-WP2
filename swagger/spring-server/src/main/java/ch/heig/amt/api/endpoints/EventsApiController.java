package ch.heig.amt.api.endpoints;

import ch.heig.amt.api.EventsApi;
import ch.heig.amt.api.model.EventDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-01-17T18:45:54.991+01:00")
@Controller
public class EventsApiController implements EventsApi {

    @Override
    public ResponseEntity<Void> eventsPost(String xGamificationToken, EventDTO body) {
        return null;
    }
}
