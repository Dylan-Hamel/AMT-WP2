package ch.heig.amt.entities;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.HashMap;
import java.util.Map;
import org.springframework.validation.annotation.Validated;

import javax.persistence.*;
import javax.validation.Valid;

/**
 * An eventEntity created when an user does something on the application
 */
@ApiModel(description = "An eventEntity created when an user does something on the application")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-01-10T07:08:05.866+01:00")
@Table(name = "eventEntity", uniqueConstraints = @UniqueConstraint(columnNames = {"name", "user_id"}))

public class EventEntity   {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  @Column(name = "id")
  @JsonProperty("id")
  private Integer id = null;

  @Column(name = "type")
  @JsonProperty("type")
  private String type = null;

  @ElementCollection(fetch = FetchType.EAGER)
  @CollectionTable(name = "properties",
          foreignKey = @ForeignKey(value = ConstraintMode.CONSTRAINT, name = "fk_property"),
          joinColumns = @JoinColumn(name = "property_id"))
  @MapKeyColumn(name = "property", nullable = false)
  @MapKeyEnumerated(EnumType.STRING)
  @Column(name = "translation", nullable = false)
  @JsonProperty("hashMap")
  @Valid
  private Map<String, EventHashMapEntity> hashMap = null;

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "user_id", nullable = false)

  public EventEntity id(Integer id) {
    this.id = id;
    return this;
  }

  /**
   * EventEntity ID
   * @return id
   **/
  @ApiModelProperty(value = "EventEntity ID")


  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public EventEntity type(String type) {
    this.type = type;
    return this;
  }

  /**
   * The type of the eventEntity
   * @return type
  **/
  @ApiModelProperty(value = "The type of the eventEntity")


  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public EventEntity hashMap(Map<String, EventHashMapEntity> hashMap) {
    this.hashMap = hashMap;
    return this;
  }

  public EventEntity putHashMapItem(String key, EventHashMapEntity hashMapItem) {
    if (this.hashMap == null) {
      this.hashMap = new HashMap<String, EventHashMapEntity>();
    }
    this.hashMap.put(key, hashMapItem);
    return this;
  }

  /**
   * Get hashMap
   * @return hashMap
  **/
  @ApiModelProperty(value = "")

  @Valid

  public Map<String, EventHashMapEntity> getHashMap() {
    return hashMap;
  }

  public void setHashMap(Map<String, EventHashMapEntity> hashMap) {
    this.hashMap = hashMap;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EventEntity eventEntity = (EventEntity) o;
    return Objects.equals(this.id, eventEntity.id) &&
        Objects.equals(this.type, eventEntity.type) &&
        Objects.equals(this.hashMap, eventEntity.hashMap);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, type, hashMap);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EventEntity {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    hashMap: ").append(toIndentedString(hashMap)).append("\n");
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

