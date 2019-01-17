package ch.heig.amt.entities;

import java.util.List;
import java.util.Objects;

import ch.heig.amt.api.model.Badge;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;

import javax.persistence.*;

/**
 * The info of a gamified application
 */
@ApiModel(description = "The info of a gamified application")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-01-10T06:54:30.522+01:00")
@Entity
public class ApplicationEntity {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id")
  @JsonProperty("id")
  private int id;

  @Column(name = "name")
  @JsonProperty("name")
  private String name = null;

  @Column(name = "token")
  @JsonProperty("token")
  private String token = null;

  @OneToMany(fetch = FetchType.LAZY, targetEntity = BadgeEntity.class)
  @JoinColumn(name = "badge_id", nullable = false)
  private List<Badge> badge;
  // @JoinColumn(name = "user_id", nullable = false)
  // @JoinColumn(name = "point_scale_id", nullable = false)
  // @JoinColumn(name = "rule_id", nullable = false)

  public ApplicationEntity name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The unique name of the gamified application
   * @return name
  **/
  @ApiModelProperty(value = "The unique name of the gamified application")


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

  /**
   * The token of the gamified application
   * @return token
  **/
  @ApiModelProperty(value = "The token of the gamified application")


  public String gettoken() {
    return token;
  }

  public void settoken(String token) {
    this.token = token;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApplicationEntity applicationEntity = (ApplicationEntity) o;
    return Objects.equals(this.name, applicationEntity.name) &&
        Objects.equals(this.token, applicationEntity.token);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, token);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApplicationEntity {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    token: ").append(toIndentedString(token)).append("\n");
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

