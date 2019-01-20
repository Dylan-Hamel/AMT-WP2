package ch.heig.amt.entities;

import java.util.List;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;

import javax.persistence.*;

@Entity
@Table(name = "application")
public class ApplicationEntity {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int id;

  private String name = null;

  private String token = null;

  @OneToMany(mappedBy = "applicationEntity")
  private List<BadgeEntity> badges;

  @OneToMany(mappedBy = "applicationEntity")
  private List<UserEntity> users;

  @OneToMany(mappedBy = "applicationEntity")
  private List<PointScaleEntity> pointScales;

  public ApplicationEntity name(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ApplicationEntity token(String token) {
    this.token = token;
    return this;
  }

  public String getToken() {
    return token;
  }

  public void setToken(String token) {
    this.token = token;
  }

  public List<BadgeEntity> getBadges() {
    return badges;
  }

  public void setBadges(List<BadgeEntity> badges) {
    this.badges = badges;
  }

  public List<UserEntity> getUsers() {
    return users;
  }

  public void setUsers(List<UserEntity> users) {
    this.users = users;
  }

  public List<PointScaleEntity> getPointScales() {
    return pointScales;
  }

  public void setPointScales(List<PointScaleEntity> pointScales) {
    this.pointScales = pointScales;
  }
}

