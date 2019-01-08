/**
 * NOTE: This class is auto generated by the swagger code generator program (2.4.1-SNAPSHOT).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package io.avalia.fruits.api;

import io.avalia.fruits.model.Credentials;
import io.avalia.fruits.model.Token;
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
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-01-07T19:12:38.721Z")

@Api(value = "auth", description = "the auth API")
public interface AuthApi {

    @ApiOperation(value = "Authenticate an application", nickname = "authPost", notes = "", response = Token.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Successful operation", response = Token.class),
        @ApiResponse(code = 400, message = "Already authenticated"),
        @ApiResponse(code = 401, message = "Authentication failed"),
        @ApiResponse(code = 404, message = "No such application") })
    @RequestMapping(value = "/auth/",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.POST)
    ResponseEntity<Token> authPost(@ApiParam(value = "Application credentials" ,required=true )  @Valid @RequestBody Credentials body);

}
