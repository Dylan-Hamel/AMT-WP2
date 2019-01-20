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
@Entity
@Table(name = "point_award")
public class PointAwardEntity {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long pointAwardEntityId;
  private Long points = null;

  @ManyToOne
  private RuleEntity ruleEntity;

  @ManyToOne
  private UserEntity userEntity;

  public PointAwardEntity pointScaleId(Long pointScaleId) {
    this.pointAwardEntityId = pointScaleId;
    return this;
  }

  public Long getPointAwardEntityId() {
    return pointAwardEntityId;
  }

  public void setPointAwardEntityId(Long pointAwardEntityId) {
    this.pointAwardEntityId = pointAwardEntityId;
  }

  public PointAwardEntity points(Long points) {
    this.points = points;
    return this;
  }

  public Long getPoints() {
    return points;
  }

  public void setPoints(Long points) {
    this.points = points;
  }

  public RuleEntity getRuleEntity() {
    return ruleEntity;
  }

  public void setRuleEntity(RuleEntity ruleEntity) {
    this.ruleEntity = ruleEntity;
  }

  public UserEntity getUserEntity() {
    return userEntity;
  }

  public void setUserEntity(UserEntity userEntity) {
    this.userEntity = userEntity;
  }
}

