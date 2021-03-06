/*
 * AMT
 * Gamification App
 *
 * OpenAPI spec version: 0.1.2
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package ch.heig.amt.gamification.tests.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * The info of a gamified application
 */
@ApiModel(description = "The info of a gamified application")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-01-21T16:10:19.911+01:00")
public class ApplicationDTO {
  @SerializedName("name")
  private String name = null;

  @SerializedName("token")
  private String token = null;

  public ApplicationDTO name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The unique name of the gamified application
   * @return name
  **/
  @ApiModelProperty(value = "The unique name of the gamified application")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ApplicationDTO token(String token) {
    this.token = token;
    return this;
  }

   /**
   * The token of the gamified application
   * @return token
  **/
  @ApiModelProperty(value = "The token of the gamified application")
  public String getToken() {
    return token;
  }

  public void setToken(String token) {
    this.token = token;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApplicationDTO applicationDTO = (ApplicationDTO) o;
    return Objects.equals(this.name, applicationDTO.name) &&
        Objects.equals(this.token, applicationDTO.token);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, token);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApplicationDTO {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    token: ").append(toIndentedString(token)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

