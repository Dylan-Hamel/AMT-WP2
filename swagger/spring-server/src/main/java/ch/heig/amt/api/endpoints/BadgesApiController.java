package ch.heig.amt.api.endpoints;

import ch.heig.amt.api.BadgesApi;
import ch.heig.amt.api.model.BadgeDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import java.util.List;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-01-17T18:45:54.991+01:00")
@Controller
public class BadgesApiController implements BadgesApi {

    @Override
    public ResponseEntity<Void> badgesDelete(String xGamificationToken, String name) {
        return null;
    }

    @Override
    public ResponseEntity<List<BadgeDTO>> badgesGet(String xGamificationToken) {
        return null;
    }

    @Override
    public ResponseEntity<Void> badgesPost(String xGamificationToken, BadgeDTO body) {
        return null;
    }
}
