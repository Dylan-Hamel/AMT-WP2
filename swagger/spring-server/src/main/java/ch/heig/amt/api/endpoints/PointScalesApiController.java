package ch.heig.amt.api.endpoints;

import ch.heig.amt.api.PointScalesApi;
import ch.heig.amt.api.model.PointScaleDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import java.util.List;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-01-17T18:45:54.991+01:00")
@Controller
public class PointScalesApiController implements PointScalesApi {

    @Override
    public ResponseEntity<List<PointScaleDTO>> pointScalesGet(String xGamificationToken) {
        return null;
    }

    @Override
    public ResponseEntity<Void> pointScalesNameDelete(String xGamificationToken, String name) {
        return null;
    }

    @Override
    public ResponseEntity<PointScaleDTO> pointScalesNameGet(String xGamificationToken, String name) {
        return null;
    }


    @Override
    public ResponseEntity<Void> pointScalesNamePost(String xGamificationToken, String name, PointScaleDTO body) {
        return null;
    }

    @Override
    public ResponseEntity<Void> pointScalesPost(String xGamificationToken, PointScaleDTO body) {
        return null;
    }
}
