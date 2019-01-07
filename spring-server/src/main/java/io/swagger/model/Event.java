package io.swagger.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;

import javax.persistence.*;
import java.util.Objects;

/**
 * An event created when an user does something on the application
 */
@ApiModel(description = "An event created when an user does something on the application")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-01-04T14:23:30.087Z")

@Entity
@Table(name = "event")
@Inheritance(strategy = InheritanceType.JOINED)
public class Event {

    @Id
    @Column(name = "type", nullable = false)
    @JsonProperty("type")
    private String type = null;

    @Column(name = "username", nullable = false)
    @JsonProperty("username")
    private String username = null;

    // -------------------------------------------------------------------------------------------------------------------

    public Event type(String type) {
        this.type = type;
        return this;
    }

    /**
     * The type of the event
     *
     * @return type
     **/
    @ApiModelProperty(value = "The type of the event")

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }


    public Event username(String username) {
        this.username = username;
        return this;

    }

    /**
     * The username of the user
     *
     * @return username
     **/
    @ApiModelProperty(value = "The username of the user")

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Event event = (Event) o;
        return Objects.equals(this.type, event.type) &&
                Objects.equals(this.username, event.username);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, username);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Event {\n");

        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    username: ").append(toIndentedString(username)).append("\n");
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

