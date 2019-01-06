package io.swagger.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;

import javax.persistence.*;
import javax.validation.Valid;
import java.math.BigDecimal;
import java.util.Objects;

/**
 * How many points an user has on a given point scale
 */
@ApiModel(description = "How many points an user has on a given point scale")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-01-04T14:23:30.087Z")
@Entity
@Table(name = "points_on_point_scale")
public class PointsOnPointScale {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "point_scale_id")
    @JsonProperty("point_scale_id")
    private BigDecimal pointScaleId = null;

    @Column(name = "points")
    private BigDecimal points = null;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "username", nullable = false)
    private User user;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public PointsOnPointScale pointScaleId(BigDecimal pointScaleId) {
        this.pointScaleId = pointScaleId;
        return this;
    }

    /**
     * The point scale
     *
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
     *
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

