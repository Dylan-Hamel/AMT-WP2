package ch.heig.amt.entities;
import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "badge")
public class BadgeEntity {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Integer id = null;

  private String name = null;

  @ManyToOne
  private ApplicationEntity applicationEntity;

  @OneToMany(mappedBy = "badgeEntity")
  private List<RuleEntity> ruleEntity;

  @ManyToOne
  private UserEntity userEntity;

  public BadgeEntity id(Integer id) {
    this.id = id;
    return this;
  }

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public BadgeEntity name(String name) {
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

