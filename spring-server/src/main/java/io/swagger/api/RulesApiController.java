package io.swagger.api;

import io.swagger.model.EventRule;
import io.swagger.model.TriggerRule;
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
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-01-04T14:23:30.087Z")

@Controller
public class RulesApiController implements RulesApi {

    private static final Logger log = LoggerFactory.getLogger(RulesApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public RulesApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<List<EventRule>> rulesEventsGet() {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<List<EventRule>>(objectMapper.readValue("[ {  \"pointScale\" : \"pointScale\",  \"name\" : \"name\",  \"pointsGiven\" : 0.80082819046101150206595775671303272247314453125,  \"event\" : \"event\"}, {  \"pointScale\" : \"pointScale\",  \"name\" : \"name\",  \"pointsGiven\" : 0.80082819046101150206595775671303272247314453125,  \"event\" : \"event\"} ]", List.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<List<EventRule>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<List<EventRule>>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> rulesEventsNameDelete(@ApiParam(value = "Event rule name",required=true) @PathVariable("name") String name) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<EventRule> rulesEventsNameGet(@ApiParam(value = "Event rule name",required=true) @PathVariable("name") String name) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<EventRule>(objectMapper.readValue("{  \"pointScale\" : \"pointScale\",  \"name\" : \"name\",  \"pointsGiven\" : 0.80082819046101150206595775671303272247314453125,  \"event\" : \"event\"}", EventRule.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<EventRule>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<EventRule>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> rulesEventsNamePost(@ApiParam(value = "Event rule name",required=true) @PathVariable("name") String name,@ApiParam(value = "URL of the modified event rule" ,required=true )  @Valid @RequestBody EventRule body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> rulesEventsPost(@ApiParam(value = "Required informations" ,required=true )  @Valid @RequestBody EventRule body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<List<TriggerRule>> rulesTriggersGet() {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<List<TriggerRule>>(objectMapper.readValue("[ {  \"pointScale\" : \"pointScale\",  \"badgeAwarded\" : \"badgeAwarded\",  \"name\" : \"name\",  \"limit\" : 0.80082819046101150206595775671303272247314453125,  \"aboveLimit\" : true}, {  \"pointScale\" : \"pointScale\",  \"badgeAwarded\" : \"badgeAwarded\",  \"name\" : \"name\",  \"limit\" : 0.80082819046101150206595775671303272247314453125,  \"aboveLimit\" : true} ]", List.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<List<TriggerRule>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<List<TriggerRule>>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> rulesTriggersNameDelete(@ApiParam(value = "Trigger rule name",required=true) @PathVariable("name") String name) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<TriggerRule> rulesTriggersNameGet(@ApiParam(value = "Trigger rule name",required=true) @PathVariable("name") String name) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<TriggerRule>(objectMapper.readValue("{  \"pointScale\" : \"pointScale\",  \"badgeAwarded\" : \"badgeAwarded\",  \"name\" : \"name\",  \"limit\" : 0.80082819046101150206595775671303272247314453125,  \"aboveLimit\" : true}", TriggerRule.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<TriggerRule>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<TriggerRule>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> rulesTriggersNamePost(@ApiParam(value = "Trigger rule name",required=true) @PathVariable("name") String name,@ApiParam(value = "Modified trigger rule" ,required=true )  @Valid @RequestBody TriggerRule body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> rulesTriggersPost(@ApiParam(value = "Required informations" ,required=true )  @Valid @RequestBody TriggerRule body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

}
