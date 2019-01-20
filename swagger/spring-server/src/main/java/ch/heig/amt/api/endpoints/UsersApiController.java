package ch.heig.amt.api.endpoints;

import ch.heig.amt.api.UsersApi;
import ch.heig.amt.api.model.UserDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import java.util.List;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-01-17T18:45:54.991+01:00")
@Controller
public class UsersApiController implements UsersApi {


    @Override
    public ResponseEntity<List<UserDTO>> usersGet(String xGamificationToken) {
        return null;
    }

    @Override
    public ResponseEntity<UserDTO> usersIdGet(String xGamificationToken, String id) {
        return null;
    }
}
