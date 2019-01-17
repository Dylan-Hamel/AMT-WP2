package ch.heig.amt.entities;

import java.util.Objects;

import ch.heig.amt.api.model.Application;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;

import javax.persistence.*;

/**
 * A badge in an application
 */
@ApiModel(description = "A badge in an application")
@Validated
@Entity
@Table(name = "badge", uniqueConstraints = @UniqueConstraint(columnNames = {"name", "application_id"}))
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-01-10T06:54:30.522+01:00")
public class BadgeEntity {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  @Column(name = "id")
  @JsonProperty("id")
  private Integer id = null;

  @Column(name = "name")
  @JsonProperty("name")
  private String name = null;

  @ManyToOne(fetch = FetchType.LAZY)
  private ApplicationEntity applicationEntity;

  public BadgeEntity id(Integer id) {
    this.id = id;
    return this;
  }

  /**
   * Badge ID
   * @return id
  **/
  @ApiModelProperty(value = "Badge ID")


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

  /**
   * The name of the badge
   * @return name
  **/
  @ApiModelProperty(value = "The name of the badge")


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BadgeEntity badge = (BadgeEntity) o;
    return Objects.equals(this.id, badge.id) &&
        Objects.equals(this.name, badge.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Badge {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

