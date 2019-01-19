package ch.heig.amt.entities;

import java.util.List;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.HashMap;
import java.util.Map;
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

  @ManyToOne
  private UserEntity userEntity;

  @OneToMany(mappedBy = "eventEntity")
  private List<PropertyEntity> propertyEntities;

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
}

