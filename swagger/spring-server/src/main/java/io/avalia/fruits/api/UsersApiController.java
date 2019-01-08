package io.avalia.fruits.api;

import io.avalia.fruits.model.User;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.annotations.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.constraints.*;
import javax.validation.Valid;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.List;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-01-07T19:12:38.721Z")

@Controller
public class UsersApiController implements UsersApi {

    private static final Logger log = LoggerFactory.getLogger(UsersApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public UsersApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<List<User>> usersGet() {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<List<User>>(objectMapper.readValue("[ {  \"badges\" : [ {    \"name\" : \"name\"  }, {    \"name\" : \"name\"  } ],  \"username\" : \"username\",  \"points\" : [ {    \"pointScaleId\" : 0.80082819046101150206595775671303272247314453125,    \"points\" : 6.02745618307040320615897144307382404804229736328125  }, {    \"pointScaleId\" : 0.80082819046101150206595775671303272247314453125,    \"points\" : 6.02745618307040320615897144307382404804229736328125  } ]}, {  \"badges\" : [ {    \"name\" : \"name\"  }, {    \"name\" : \"name\"  } ],  \"username\" : \"username\",  \"points\" : [ {    \"pointScaleId\" : 0.80082819046101150206595775671303272247314453125,    \"points\" : 6.02745618307040320615897144307382404804229736328125  }, {    \"pointScaleId\" : 0.80082819046101150206595775671303272247314453125,    \"points\" : 6.02745618307040320615897144307382404804229736328125  } ]} ]", List.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<List<User>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<List<User>>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<User> usersIdGet(@ApiParam(value = "User ID",required=true) @PathVariable("id") String id) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<User>(objectMapper.readValue("{  \"badges\" : [ {    \"name\" : \"name\"  }, {    \"name\" : \"name\"  } ],  \"username\" : \"username\",  \"points\" : [ {    \"pointScaleId\" : 0.80082819046101150206595775671303272247314453125,    \"points\" : 6.02745618307040320615897144307382404804229736328125  }, {    \"pointScaleId\" : 0.80082819046101150206595775671303272247314453125,    \"points\" : 6.02745618307040320615897144307382404804229736328125  } ]}", User.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<User>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<User>(HttpStatus.NOT_IMPLEMENTED);
    }

}
