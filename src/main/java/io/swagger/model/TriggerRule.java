package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * A rule applied on point scale change
 */
@ApiModel(description = "A rule applied on point scale change")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-01-04T14:23:30.087Z")

public class TriggerRule   {
  @JsonProperty("name")
  private String name = null;

  @JsonProperty("badgeAwarded")
  private String badgeAwarded = null;

  @JsonProperty("pointScale")
  private String pointScale = null;

  @JsonProperty("limit")
  private BigDecimal limit = null;

  @JsonProperty("aboveLimit")
  private Boolean aboveLimit = null;

  public TriggerRule name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The name of the rule
   * @return name
  **/
  @ApiModelProperty(value = "The name of the rule")


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public TriggerRule badgeAwarded(String badgeAwarded) {
    this.badgeAwarded = badgeAwarded;
    return this;
  }

  /**
   * The badge awarded when rule condition matched
   * @return badgeAwarded
  **/
  @ApiModelProperty(value = "The badge awarded when rule condition matched")


  public String getBadgeAwarded() {
    return badgeAwarded;
  }

  public void setBadgeAwarded(String badgeAwarded) {
    this.badgeAwarded = badgeAwarded;
  }

  public TriggerRule pointScale(String pointScale) {
    this.pointScale = pointScale;
    return this;
  }

  /**
   * The point scale on which the rule is applied
   * @return pointScale
  **/
  @ApiModelProperty(value = "The point scale on which the rule is applied")


  public String getPointScale() {
    return pointScale;
  }

  public void setPointScale(String pointScale) {
    this.pointScale = pointScale;
  }

  public TriggerRule limit(BigDecimal limit) {
    this.limit = limit;
    return this;
  }

  /**
   * The point limit to award the badge
   * @return limit
  **/
  @ApiModelProperty(value = "The point limit to award the badge")

  @Valid

  public BigDecimal getLimit() {
    return limit;
  }

  public void setLimit(BigDecimal limit) {
    this.limit = limit;
  }

  public TriggerRule aboveLimit(Boolean aboveLimit) {
    this.aboveLimit = aboveLimit;
    return this;
  }

  /**
   * Whether the badge is given above or below point limit
   * @return aboveLimit
  **/
  @ApiModelProperty(value = "Whether the badge is given above or below point limit")


  public Boolean isAboveLimit() {
    return aboveLimit;
  }

  public void setAboveLimit(Boolean aboveLimit) {
    this.aboveLimit = aboveLimit;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TriggerRule triggerRule = (TriggerRule) o;
    return Objects.equals(this.name, triggerRule.name) &&
        Objects.equals(this.badgeAwarded, triggerRule.badgeAwarded) &&
        Objects.equals(this.pointScale, triggerRule.pointScale) &&
        Objects.equals(this.limit, triggerRule.limit) &&
        Objects.equals(this.aboveLimit, triggerRule.aboveLimit);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, badgeAwarded, pointScale, limit, aboveLimit);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TriggerRule {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    badgeAwarded: ").append(toIndentedString(badgeAwarded)).append("\n");
    sb.append("    pointScale: ").append(toIndentedString(pointScale)).append("\n");
    sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
    sb.append("    aboveLimit: ").append(toIndentedString(aboveLimit)).append("\n");
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

