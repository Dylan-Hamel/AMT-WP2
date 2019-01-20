/*
 * AMT
 * Gamification App
 *
 * OpenAPI spec version: 0.1.1
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
import java.math.BigDecimal;

/**
 * How many points an user has on a given point scale
 */
@ApiModel(description = "How many points an user has on a given point scale")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-01-20T17:27:44.724+01:00")
public class PointAwardDTO {
  @SerializedName("pointAwardId")
  private Integer pointAwardId = null;

  @SerializedName("points")
  private BigDecimal points = null;

  public PointAwardDTO pointAwardId(Integer pointAwardId) {
    this.pointAwardId = pointAwardId;
    return this;
  }

   /**
   * Point Award ID
   * @return pointAwardId
  **/
  @ApiModelProperty(value = "Point Award ID")
  public Integer getPointAwardId() {
    return pointAwardId;
  }

  public void setPointAwardId(Integer pointAwardId) {
    this.pointAwardId = pointAwardId;
  }

  public PointAwardDTO points(BigDecimal points) {
    this.points = points;
    return this;
  }

   /**
   * How many points are on the point scale
   * @return points
  **/
  @ApiModelProperty(value = "How many points are on the point scale")
  public BigDecimal getPoints() {
    return points;
  }

  public void setPoints(BigDecimal points) {
    this.points = points;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PointAwardDTO pointAwardDTO = (PointAwardDTO) o;
    return Objects.equals(this.pointAwardId, pointAwardDTO.pointAwardId) &&
        Objects.equals(this.points, pointAwardDTO.points);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pointAwardId, points);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PointAwardDTO {\n");
    
    sb.append("    pointAwardId: ").append(toIndentedString(pointAwardId)).append("\n");
    sb.append("    points: ").append(toIndentedString(points)).append("\n");
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
