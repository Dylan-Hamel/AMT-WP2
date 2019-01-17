package ch.heig.amt.entities;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import org.springframework.validation.annotation.Validated;

import javax.persistence.*;
import javax.validation.Valid;

/**
 * How many points an user has on a given point scale
 */
@ApiModel(description = "How many points an user has on a given point scale")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-01-10T06:54:30.522+01:00")

public class PointAwardEntity {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  @Column(name = "id")
  @JsonProperty("pointAwardEntityId")
  private BigDecimal pointAwardEntityId = null;

  @Column(name = "points")
  @JsonProperty("points")
  private BigDecimal points = null;

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "user_id")
  // @JoinColumn(name = "point_scale_id")

  public PointAwardEntity pointScaleId(BigDecimal pointScaleId) {
    this.pointAwardEntityId = pointScaleId;
    return this;
  }

  /**
   * The point scale
   * @return pointAwardEntityId
  **/
  @ApiModelProperty(value = "The point scale")

  @Valid

  public BigDecimal getPointAwardEntityId() {
    return pointAwardEntityId;
  }

  public void setPointAwardEntityId(BigDecimal pointAwardEntityId) {
    this.pointAwardEntityId = pointAwardEntityId;
  }

  public PointAwardEntity points(BigDecimal points) {
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
    PointAwardEntity pointAwardEntity = (PointAwardEntity) o;
    return Objects.equals(this.pointAwardEntityId, pointAwardEntity.pointAwardEntityId) &&
        Objects.equals(this.points, pointAwardEntity.points);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pointAwardEntityId, points);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PointAwardEntity {\n");
    
    sb.append("    pointAwardEntityId: ").append(toIndentedString(pointAwardEntityId)).append("\n");
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

