package io.avalia.fruits.api;

import io.avalia.fruits.model.PointScale;
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
public class PointScalesApiController implements PointScalesApi {

    private static final Logger log = LoggerFactory.getLogger(PointScalesApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public PointScalesApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<List<PointScale>> pointScalesGet() {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<List<PointScale>>(objectMapper.readValue("[ {  \"name\" : \"name\"}, {  \"name\" : \"name\"} ]", List.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<List<PointScale>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<List<PointScale>>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> pointScalesNameDelete(@ApiParam(value = "Point scale name",required=true) @PathVariable("name") String name) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<List<PointScale>> pointScalesNameGet(@ApiParam(value = "Point scale name",required=true) @PathVariable("name") String name) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<List<PointScale>>(objectMapper.readValue("[ {  \"name\" : \"name\"}, {  \"name\" : \"name\"} ]", List.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<List<PointScale>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<List<PointScale>>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> pointScalesNamePost(@ApiParam(value = "Point scale name",required=true) @PathVariable("name") String name,@ApiParam(value = "Required informations" ,required=true )  @Valid @RequestBody PointScale body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> pointScalesPost(@ApiParam(value = "Required informations" ,required=true )  @Valid @RequestBody PointScale body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

}
