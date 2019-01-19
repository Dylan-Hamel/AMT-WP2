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

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
}

