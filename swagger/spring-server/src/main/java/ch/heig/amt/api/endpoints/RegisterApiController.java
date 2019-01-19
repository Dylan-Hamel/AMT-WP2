package ch.heig.amt.api.endpoints;

import ch.heig.amt.api.RegisterApi;
import ch.heig.amt.api.model.ApplicationDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-01-17T18:45:54.991+01:00")
@Controller
public class RegisterApiController implements RegisterApi {

    @Override
    public ResponseEntity<Void> registerPost(String xGamificationToken, ApplicationDTO body) {
        return null;
    }
}
