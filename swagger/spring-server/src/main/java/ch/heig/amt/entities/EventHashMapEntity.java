package ch.heig.amt.entities;

import ch.heig.amt.api.model.EventHashMap;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * EventHashMapEntity
 */
@Validated
@Entity
@Table(name = "properties")
@javax.annotation.Generated(value = "io.swagger.keygen.languages.Springkeygen", date = "2019-01-10T06:54:30.522+01:00")
public class EventHashMapEntity {

  @Id
  @Column(name = "key")
  @JsonProperty("key")
  private String key = null;

  @Column(name = "value")
  @JsonProperty("value")
  private String value = null;

  public EventHashMapEntity key(String key) {
    this.key = key;
    return this;
  }

  /**
   * key
   * @return key
  **/
  @ApiModelProperty(value = "key")


  public String getkey() {
    return key;
  }

  public void setkey(String key) {
    this.key = key;
  }

  public EventHashMapEntity value(String value) {
    this.value = value;
    return this;
  }

  /**
   * content
   * @return value
  **/
  @ApiModelProperty(value = "content")


  public String getvalue() {
    return value;
  }

  public void setvalue(String value) {
    this.value = value;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EventHashMapEntity EventHashMapEntity = (EventHashMapEntity) o;
    return Objects.equals(this.key, EventHashMapEntity.key) &&
        Objects.equals(this.value, EventHashMapEntity.value);
  }

  public int hashkey() {
    return Objects.hash(key, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EventHashMapEntity {\n");
    
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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

