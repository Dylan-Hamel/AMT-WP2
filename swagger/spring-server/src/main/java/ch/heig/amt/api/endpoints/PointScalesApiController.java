package ch.heig.amt.api.endpoints;

import ch.heig.amt.api.PointScalesApi;
import ch.heig.amt.api.model.PointScale;

import io.swagger.annotations.*;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-01-17T18:45:54.991+01:00")

@Controller
public class PointScalesApiController implements PointScalesApi {



    public ResponseEntity<List<PointScale>> pointScalesGet() {
        // do some magic!
        return new ResponseEntity<List<PointScale>>(HttpStatus.OK);
    }

    public ResponseEntity<Void> pointScalesNameDelete(@ApiParam(value = "Point scale name",required=true ) @PathVariable("name") String name) {
        // do some magic!
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    public ResponseEntity<List<PointScale>> pointScalesNameGet(@ApiParam(value = "Point scale name",required=true ) @PathVariable("name") String name) {
        // do some magic!
        return new ResponseEntity<List<PointScale>>(HttpStatus.OK);
    }

    public ResponseEntity<Void> pointScalesNamePost(@ApiParam(value = "Point scale name",required=true ) @PathVariable("name") String name,
        @ApiParam(value = "Required informations" ,required=true ) @RequestBody PointScale body) {
        // do some magic!
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    public ResponseEntity<Void> pointScalesPost(@ApiParam(value = "Required informations" ,required=true ) @RequestBody PointScale body) {
        // do some magic!
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

}
