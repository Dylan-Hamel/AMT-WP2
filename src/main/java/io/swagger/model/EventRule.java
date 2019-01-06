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
 * A rule applied on event creation
 */
@ApiModel(description = "A rule applied on event creation")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-01-04T14:23:30.087Z")

@Entity
@Table(name = "event_rule")
@PrimaryKeyJoinColumn(name = "name")
public class EventRule {

    @Column(name = "name", nullable = false)
    @JsonProperty("name")
    @Id
    private String name = null;

    @Column(name = "event", nullable = false)
    @JsonProperty("event")
    private String event = null;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "point_scale_id", nullable = false)
    @JsonProperty("pointScale")
    private PointScale pointScale = null;

    @Column(name = "points_given", nullable = false)
    @JsonProperty("pointsGiven")
    private BigDecimal pointsGiven = null;

    public EventRule name(String name) {
        this.name = name;
        return this;
    }

    /**
     * The name of the rule
     *
     * @return name
     **/
    @ApiModelProperty(value = "The name of the rule")


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public EventRule event(String event) {
        this.event = event;
        return this;
    }

    /**
     * The event on which the rule is applied
     *
     * @return event
     **/
    @ApiModelProperty(value = "The event on which the rule is applied")


    public String getEvent() {
        return event;
    }

    public void setEvent(String event) {
        this.event = event;
    }

    public EventRule pointScale(PointScale pointScale) {
        this.pointScale = pointScale;
        return this;
    }

    /**
     * The point scale on which the rule is applied
     *
     * @return pointScale
     **/
    @ApiModelProperty(value = "The point scale on which the rule is applied")


    public PointScale getPointScale() {
        return pointScale;
    }

    public void setPointScale(PointScale pointScale) {
        this.pointScale = pointScale;
    }

    public EventRule pointsGiven(BigDecimal pointsGiven) {
        this.pointsGiven = pointsGiven;
        return this;
    }

    /**
     * How many points are given on the point scale
     *
     * @return pointsGiven
     **/
    @ApiModelProperty(value = "How many points are given on the point scale")

    @Valid

    public BigDecimal getPointsGiven() {
        return pointsGiven;
    }

    public void setPointsGiven(BigDecimal pointsGiven) {
        this.pointsGiven = pointsGiven;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        EventRule eventRule = (EventRule) o;
        return Objects.equals(this.name, eventRule.name) &&
                Objects.equals(this.event, eventRule.event) &&
                Objects.equals(this.pointScale, eventRule.pointScale) &&
                Objects.equals(this.pointsGiven, eventRule.pointsGiven);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, event, pointScale, pointsGiven);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class EventRule {\n");

        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    event: ").append(toIndentedString(event)).append("\n");
        sb.append("    pointScale: ").append(toIndentedString(pointScale)).append("\n");
        sb.append("    pointsGiven: ").append(toIndentedString(pointsGiven)).append("\n");
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

