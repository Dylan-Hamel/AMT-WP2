package ch.heig.amt.entities;

import javax.persistence.*;
import java.util.List;

/**
 * A point scale in an application
 */
@Entity(name = "point_scale")
public class PointScaleEntity {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private int id;

  private String name = null;

  @OneToMany(mappedBy = "pointScaleEntity")
  private List<RuleEntity> ruleEntity;

  @ManyToOne
  private ApplicationEntity applicationEntity;

  public PointScaleEntity name(String name) {
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

