package ch.heig.amt.api.endpoints;

import ch.heig.amt.api.RegisterApi;
import ch.heig.amt.api.model.Application;

import io.swagger.annotations.*;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-01-17T18:45:54.991+01:00")

@Controller
public class RegisterApiController implements RegisterApi {

    public ResponseEntity<Void> registerPost(@ApiParam(value = "Required informations" ,required=true ) @RequestBody Application body) {
        // do some magic!
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

}