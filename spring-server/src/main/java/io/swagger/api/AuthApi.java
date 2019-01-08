/**
 * NOTE: This class is auto generated by the swagger code generator program (2.2.3).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package io.swagger.api;

import io.swagger.model.Credentials;
import io.swagger.model.Token;

import io.swagger.annotations.*;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-01-08T13:53:40.484+01:00")

@Api(value = "auth", description = "the auth API")
public interface AuthApi {

    @ApiOperation(value = "Authenticate an application", notes = "", response = Token.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Successful operation", response = Token.class),
        @ApiResponse(code = 400, message = "Already authenticated", response = Void.class),
        @ApiResponse(code = 401, message = "Authentication failed", response = Void.class),
        @ApiResponse(code = 404, message = "No such application", response = Void.class) })
    
    @RequestMapping(value = "/auth/",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.POST)
    ResponseEntity<Token> authPost(@ApiParam(value = "Application credentials" ,required=true )  @Valid @RequestBody Credentials body);

}
