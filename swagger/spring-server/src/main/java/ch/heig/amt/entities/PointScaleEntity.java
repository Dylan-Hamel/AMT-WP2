package ch.heig.amt.entities;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;

import javax.persistence.*;

/**
 * A point scale in an application
 */
@ApiModel(description = "A point scale in an application")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-01-10T06:54:30.522+01:00")

public class PointScaleEntity {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  @Column(name = "id")
  @JsonProperty("id")
  private int id;

  @Column(name = "name")
  @JsonProperty("name")
  private String name = null;

  @OneToMany(fetch = FetchType.LAZY)
  @JoinColumn(name = "rule_id")
  //@JoinColumn(name = "point_award_id")

  @OneToOne(fetch = FetchType.LAZY)
  // @JoinColumn(name = "application_id")

  public PointScaleEntity name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The name of the point scale
   * @return name
  **/
  @ApiModelProperty(value = "The name of the point scale")


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
    PointScaleEntity pointScale = (PointScaleEntity) o;
    return Objects.equals(this.name, pointScale.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PointScale {\n");
    
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

