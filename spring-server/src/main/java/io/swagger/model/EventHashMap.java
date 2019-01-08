package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * EventHashMap
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-01-08T14:04:10.019+01:00")

public class EventHashMap   {
  @JsonProperty("code")
  private String code = null;

  @JsonProperty("text")
  private String text = null;

  public EventHashMap code(String code) {
    this.code = code;
    return this;
  }

   /**
   * ID
   * @return code
  **/
  @ApiModelProperty(value = "ID")


  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public EventHashMap text(String text) {
    this.text = text;
    return this;
  }

   /**
   * content
   * @return text
  **/
  @ApiModelProperty(value = "content")


  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EventHashMap eventHashMap = (EventHashMap) o;
    return Objects.equals(this.code, eventHashMap.code) &&
        Objects.equals(this.text, eventHashMap.text);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, text);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EventHashMap {\n");
    
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
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

