package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * The info of a gamified application
 */
@ApiModel(description = "The info of a gamified application")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-01-08T20:53:35.584+01:00")

public class GamifiedApplication   {
  @JsonProperty("name")
  private String name = null;

  @JsonProperty("password")
  private String password = null;

  public GamifiedApplication name(String name) {
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

  public GamifiedApplication password(String password) {
    this.password = password;
    return this;
  }

  /**
   * The password of the gamified application
   * @return password
  **/
  @ApiModelProperty(value = "The password of the gamified application")


  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GamifiedApplication gamifiedApplication = (GamifiedApplication) o;
    return Objects.equals(this.name, gamifiedApplication.name) &&
        Objects.equals(this.password, gamifiedApplication.password);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, password);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GamifiedApplication {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
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

