package ch.heig.amt.api.endpoints;

import ch.heig.amt.api.BadgesApi;
import ch.heig.amt.api.model.Badge;

import io.swagger.annotations.*;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-01-17T18:45:54.991+01:00")

@Controller
public class BadgesApiController implements BadgesApi {

    public ResponseEntity<Void> badgesDelete(@ApiParam(value = "Badge name",required=true ) @PathVariable("name") String name) {
        // do some magic!
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    public ResponseEntity<List<Badge>> badgesGet() {
        // do some magic!
        return new ResponseEntity<List<Badge>>(HttpStatus.OK);
    }

    public ResponseEntity<Void> badgesPost(@ApiParam(value = "Required informations" ,required=true ) @RequestBody Badge body) {
        // do some magic!
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

}
