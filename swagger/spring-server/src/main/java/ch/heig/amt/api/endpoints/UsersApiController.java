package ch.heig.amt.api.endpoints;

import ch.heig.amt.api.UsersApi;
import ch.heig.amt.api.model.User;

import io.swagger.annotations.*;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-01-17T18:45:54.991+01:00")

@Controller
public class UsersApiController implements UsersApi {

    public ResponseEntity<List<User>> usersGet() {
        // do some magic!
        return new ResponseEntity<List<User>>(HttpStatus.OK);
    }

    public ResponseEntity<User> usersIdGet(@ApiParam(value = "User ID",required=true ) @PathVariable("id") String id) {
        // do some magic!
        return new ResponseEntity<User>(HttpStatus.OK);
    }

}
