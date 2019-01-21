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
 * Rule
 */
@ApiModel(description = "Rule")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-01-21T12:18:58.316+01:00")
public class RuleDTO {
  @SerializedName("name")
  private String name = null;

  @SerializedName("threshold")
  private Integer threshold = null;

  @SerializedName("pointScaleId")
  private Integer pointScaleId = null;

  @SerializedName("badgeId")
  private Integer badgeId = null;

  public RuleDTO name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Rule name
   * @return name
  **/
  @ApiModelProperty(value = "Rule name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public RuleDTO threshold(Integer threshold) {
    this.threshold = threshold;
    return this;
  }

   /**
   * Treshold
   * @return threshold
  **/
  @ApiModelProperty(value = "Treshold")
  public Integer getThreshold() {
    return threshold;
  }

  public void setThreshold(Integer threshold) {
    this.threshold = threshold;
  }

  public RuleDTO pointScaleId(Integer pointScaleId) {
    this.pointScaleId = pointScaleId;
    return this;
  }

   /**
   * Related point scale
   * @return pointScaleId
  **/
  @ApiModelProperty(value = "Related point scale")
  public Integer getPointScaleId() {
    return pointScaleId;
  }

  public void setPointScaleId(Integer pointScaleId) {
    this.pointScaleId = pointScaleId;
  }

  public RuleDTO badgeId(Integer badgeId) {
    this.badgeId = badgeId;
    return this;
  }

   /**
   * Related badge
   * @return badgeId
  **/
  @ApiModelProperty(value = "Related badge")
  public Integer getBadgeId() {
    return badgeId;
  }

  public void setBadgeId(Integer badgeId) {
    this.badgeId = badgeId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RuleDTO ruleDTO = (RuleDTO) o;
    return Objects.equals(this.name, ruleDTO.name) &&
        Objects.equals(this.threshold, ruleDTO.threshold) &&
        Objects.equals(this.pointScaleId, ruleDTO.pointScaleId) &&
        Objects.equals(this.badgeId, ruleDTO.badgeId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, threshold, pointScaleId, badgeId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RuleDTO {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    threshold: ").append(toIndentedString(threshold)).append("\n");
    sb.append("    pointScaleId: ").append(toIndentedString(pointScaleId)).append("\n");
    sb.append("    badgeId: ").append(toIndentedString(badgeId)).append("\n");
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

