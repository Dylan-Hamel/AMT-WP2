package ch.heig.amt.entities;

import javax.persistence.*;
import java.util.List;

/**
 * The info of a gamified application
 */
@Entity
@Table(name = "rule")
public class RuleEntity {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int id;

  private Integer threshold;
  private String name = null;

  @ManyToOne
  private PointScaleEntity pointScaleEntity;

  @ManyToOne
  private BadgeEntity badgeEntity;

  @OneToMany(mappedBy = "ruleEntity")
  private List<PointAwardEntity> pointAwardEntities;

  @OneToMany(mappedBy = "ruleEntity")
  private List<PointAwardEntity> pointAwardEntity;

  public RuleEntity name(String name) {
    this.name = name;
    return this;
  }

  public Integer getThreshold() {
    return threshold;
  }

  public void setThreshold(Integer threshold) {
    this.threshold = threshold;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public PointScaleEntity getPointScaleEntity() {
    return pointScaleEntity;
  }

  public void setPointScaleEntity(PointScaleEntity pointScaleEntity) {
    this.pointScaleEntity = pointScaleEntity;
  }

  public BadgeEntity getBadgeEntity() {
    return badgeEntity;
  }

  public void setBadgeEntity(BadgeEntity badgeEntity) {
    this.badgeEntity = badgeEntity;
  }

  public List<PointAwardEntity> getPointAwardEntities() {
    return pointAwardEntities;
  }

  public void setPointAwardEntities(List<PointAwardEntity> pointAwardEntities) {
    this.pointAwardEntities = pointAwardEntities;
  }

  public List<PointAwardEntity> getPointAwardEntity() {
    return pointAwardEntity;
  }

  public void setPointAwardEntity(List<PointAwardEntity> pointAwardEntity) {
    this.pointAwardEntity = pointAwardEntity;
  }
}

