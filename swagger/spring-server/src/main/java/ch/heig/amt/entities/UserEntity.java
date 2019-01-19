package ch.heig.amt.entities;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "end_user")
public class UserEntity {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;

  private String username = null;
  private String password = null;

  @OneToMany(mappedBy = "userEntity")
  private List<EventEntity> eventEntities;

  @OneToMany(mappedBy = "userEntity")
  private List<PointAwardEntity> pointAwardEntities;

  @OneToMany(mappedBy = "userEntity")
  private List<BadgeEntity> badgeEntities;

  @ManyToOne
  private ApplicationEntity applicationEntity;

  public UserEntity username(String username) {
    this.username = username;
    return this;
  }

  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }
}

