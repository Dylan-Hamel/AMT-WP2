package ch.heig.amt.api.endpoints;

import ch.heig.amt.api.RulesApi;
import ch.heig.amt.api.model.RuleDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import java.util.List;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-01-17T18:45:54.991+01:00")
@Controller
public class RulesApiController implements RulesApi {

    @Override
    public ResponseEntity<List<RuleDTO>> rulesGet(String xGamificationToken) {
        return null;
    }

    @Override
    public ResponseEntity<Void> rulesNameDelete(String xGamificationToken, String name) {
        return null;
    }

    @Override
    public ResponseEntity<RuleDTO> rulesNameGet(String xGamificationToken, String name) {
        return null;
    }

    @Override
    public ResponseEntity<Void> rulesNamePost(String xGamificationToken, String name, RuleDTO body) {
        return null;
    }

    @Override
    public ResponseEntity<Void> rulesPost(String xGamificationToken, RuleDTO body) {
        return null;
    }
}
