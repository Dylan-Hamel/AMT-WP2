package ch.heig.amt.entities;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import org.springframework.validation.annotation.Validated;

import javax.persistence.*;

/**
 * An user doing various actions in an application
 */
@ApiModel(description = "An user doing various actions in an application")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-01-10T06:54:30.522+01:00")

public class UserEntity {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  @JsonProperty("username")
  private String username = null;

  @Column(name = "password")
  @JsonProperty("password")
  private String password = null;

  @OneToMany(fetch = FetchType.LAZY)
  @JoinColumn(name = "event_id")
  // @JoinColumn(name = "application_id")
  // @JoinColumn(name = "point_award_id")
  // @JoinColumn(name = "badge_id")

  public UserEntity username(String username) {
    this.username = username;
    return this;
  }

  /**
   * The username of the user
   * @return username
  **/
  @ApiModelProperty(value = "The username of the user")


  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
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

