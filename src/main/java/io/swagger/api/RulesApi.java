/**
 * NOTE: This class is auto generated by the swagger code generator program (2.4.1-SNAPSHOT).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package io.swagger.api;

import io.swagger.model.EventRule;
import io.swagger.model.TriggerRule;
import io.swagger.annotations.*;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-01-04T14:23:30.087Z")

@Api(value = "rules", description = "the rules API")
public interface RulesApi {

    @ApiOperation(value = "List events rules linked to current application", nickname = "rulesEventsGet", notes = "", response = EventRule.class, responseContainer = "List", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Successfully done", response = EventRule.class, responseContainer = "List") })
    @RequestMapping(value = "/rules/events/",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.GET)
    ResponseEntity<List<EventRule>> rulesEventsGet();


    @ApiOperation(value = "Delete specific event rule", nickname = "rulesEventsNameDelete", notes = "", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Successfully done"),
        @ApiResponse(code = 404, message = "No such event rule") })
    @RequestMapping(value = "/rules/events/{name}/",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.DELETE)
    ResponseEntity<Void> rulesEventsNameDelete(@ApiParam(value = "Event rule name",required=true) @PathVariable("name") String name);


    @ApiOperation(value = "Fetch specific event rule", nickname = "rulesEventsNameGet", notes = "", response = EventRule.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Successfully done", response = EventRule.class),
        @ApiResponse(code = 404, message = "No such event rule") })
    @RequestMapping(value = "/rules/events/{name}/",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.GET)
    ResponseEntity<EventRule> rulesEventsNameGet(@ApiParam(value = "Event rule name",required=true) @PathVariable("name") String name);


    @ApiOperation(value = "Update specific event rule", nickname = "rulesEventsNamePost", notes = "", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Successfully done"),
        @ApiResponse(code = 404, message = "No such event rule"),
        @ApiResponse(code = 409, message = "Event rule already exists") })
    @RequestMapping(value = "/rules/events/{name}/",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.POST)
    ResponseEntity<Void> rulesEventsNamePost(@ApiParam(value = "Event rule name",required=true) @PathVariable("name") String name,@ApiParam(value = "URL of the modified event rule" ,required=true )  @Valid @RequestBody EventRule body);


    @ApiOperation(value = "Create a new event rule", nickname = "rulesEventsPost", notes = "", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "Successfully done"),
        @ApiResponse(code = 404, message = "No such event rule"),
        @ApiResponse(code = 409, message = "Event rule already exists") })
    @RequestMapping(value = "/rules/events/",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.POST)
    ResponseEntity<Void> rulesEventsPost(@ApiParam(value = "Required informations" ,required=true )  @Valid @RequestBody EventRule body);


    @ApiOperation(value = "List all trigger rules for current application", nickname = "rulesTriggersGet", notes = "", response = TriggerRule.class, responseContainer = "List", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Successful operation", response = TriggerRule.class, responseContainer = "List") })
    @RequestMapping(value = "/rules/triggers/",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.GET)
    ResponseEntity<List<TriggerRule>> rulesTriggersGet();


    @ApiOperation(value = "Delete specific trigger rule", nickname = "rulesTriggersNameDelete", notes = "", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Successfully done"),
        @ApiResponse(code = 404, message = "No such trigger rule") })
    @RequestMapping(value = "/rules/triggers/{name}/",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.DELETE)
    ResponseEntity<Void> rulesTriggersNameDelete(@ApiParam(value = "Trigger rule name",required=true) @PathVariable("name") String name);


    @ApiOperation(value = "Fetch specific trigger rule", nickname = "rulesTriggersNameGet", notes = "", response = TriggerRule.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Successfully done", response = TriggerRule.class),
        @ApiResponse(code = 404, message = "No such trigger rule") })
    @RequestMapping(value = "/rules/triggers/{name}/",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.GET)
    ResponseEntity<TriggerRule> rulesTriggersNameGet(@ApiParam(value = "Trigger rule name",required=true) @PathVariable("name") String name);


    @ApiOperation(value = "Update specific trigger rule", nickname = "rulesTriggersNamePost", notes = "", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Successfully done"),
        @ApiResponse(code = 404, message = "No such trigger rule"),
        @ApiResponse(code = 409, message = "Trigger rule already exists") })
    @RequestMapping(value = "/rules/triggers/{name}/",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.POST)
    ResponseEntity<Void> rulesTriggersNamePost(@ApiParam(value = "Trigger rule name",required=true) @PathVariable("name") String name,@ApiParam(value = "Modified trigger rule" ,required=true )  @Valid @RequestBody TriggerRule body);


    @ApiOperation(value = "Create trigger rule", nickname = "rulesTriggersPost", notes = "", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "Successfully done"),
        @ApiResponse(code = 400, message = "No such trigger rule"),
        @ApiResponse(code = 409, message = "Trigger rule already exists") })
    @RequestMapping(value = "/rules/triggers/",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.POST)
    ResponseEntity<Void> rulesTriggersPost(@ApiParam(value = "Required informations" ,required=true )  @Valid @RequestBody TriggerRule body);

}
