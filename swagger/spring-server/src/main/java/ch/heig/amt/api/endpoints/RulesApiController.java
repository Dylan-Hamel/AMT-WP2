package ch.heig.amt.api.endpoints;

import ch.heig.amt.api.RulesApi;
import ch.heig.amt.api.model.Rule;

import io.swagger.annotations.*;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-01-17T18:45:54.991+01:00")

@Controller
public class RulesApiController implements RulesApi {



    public ResponseEntity<List<Rule>> rulesGet() {
        // do some magic!
        return new ResponseEntity<List<Rule>>(HttpStatus.OK);
    }

    public ResponseEntity<Void> rulesNameDelete(@ApiParam(value = "Event rule name",required=true ) @PathVariable("name") String name) {
        // do some magic!
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    public ResponseEntity<Rule> rulesNameGet(@ApiParam(value = "Event rule name",required=true ) @PathVariable("name") String name) {
        // do some magic!
        return new ResponseEntity<Rule>(HttpStatus.OK);
    }

    public ResponseEntity<Void> rulesNamePost(@ApiParam(value = "Event rule name",required=true ) @PathVariable("name") String name,
        @ApiParam(value = "URL of the modified event rule" ,required=true ) @RequestBody Rule body) {
        // do some magic!
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    public ResponseEntity<Void> rulesPost(@ApiParam(value = "Required informations" ,required=true ) @RequestBody Rule body) {
        // do some magic!
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

}
