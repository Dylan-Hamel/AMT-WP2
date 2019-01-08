package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * How many points an user has on a given point scale
 */
@ApiModel(description = "How many points an user has on a given point scale")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-01-08T14:04:10.019+01:00")

public class PointsOnPointScale   {
  @JsonProperty("pointScaleId")
  private BigDecimal pointScaleId = null;

  @JsonProperty("points")
  private BigDecimal points = null;

  public PointsOnPointScale pointScaleId(BigDecimal pointScaleId) {
    this.pointScaleId = pointScaleId;
    return this;
  }

   /**
   * The point scale
   * @return pointScaleId
  **/
  @ApiModelProperty(value = "The point scale")

  @Valid

  public BigDecimal getPointScaleId() {
    return pointScaleId;
  }

  public void setPointScaleId(BigDecimal pointScaleId) {
    this.pointScaleId = pointScaleId;
  }

  public PointsOnPointScale points(BigDecimal points) {
    this.points = points;
    return this;
  }

   /**
   * How many points are on the point scale
   * @return points
  **/
  @ApiModelProperty(value = "How many points are on the point scale")

  @Valid

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
    PointsOnPointScale pointsOnPointScale = (PointsOnPointScale) o;
    return Objects.equals(this.pointScaleId, pointsOnPointScale.pointScaleId) &&
        Objects.equals(this.points, pointsOnPointScale.points);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pointScaleId, points);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PointsOnPointScale {\n");
    
    sb.append("    pointScaleId: ").append(toIndentedString(pointScaleId)).append("\n");
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

