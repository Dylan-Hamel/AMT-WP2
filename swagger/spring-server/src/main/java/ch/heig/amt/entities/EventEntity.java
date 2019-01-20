package ch.heig.amt.entities;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.HashMap;
import java.util.Map;

import org.hibernate.annotations.Cascade;
import org.springframework.validation.annotation.Validated;

import javax.persistence.*;
import javax.validation.Valid;

@Entity
@Table(name = "event")
public class EventEntity   {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id = null;
  private String type = null;

  @ManyToOne(cascade = CascadeType.PERSIST)
  private UserEntity userEntity;

  @OneToMany(mappedBy = "eventEntity")
  private List<PropertyEntity> propertyEntities;

  private LocalDateTime localDateTime;

  public EventEntity id(Long id) {
    this.id = id;
    return this;
  }

  public Long getId() {
    return id;
  }

  public EventEntity type(String type) {
    this.type = type;
    return this;
  }

  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public UserEntity getUserEntity() {
    return userEntity;
  }

  public void setUserEntity(UserEntity userEntity) {
    this.userEntity = userEntity;
  }

  public List<PropertyEntity> getPropertyEntities() {
    return propertyEntities;
  }

  public void setPropertyEntities(List<PropertyEntity> propertyEntities) {
    this.propertyEntities = propertyEntities;
  }

  public LocalDateTime getLocalDateTime() {
    return localDateTime;
  }

  public void setLocalDateTime(org.joda.time.LocalDateTime toLocalDateTime) {
  }
  public void setLocalDateTime(LocalDateTime now) {
  }
}

