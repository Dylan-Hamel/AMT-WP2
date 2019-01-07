package io.swagger.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;

import javax.persistence.*;
import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * An user doing various actions in an application
 */
@ApiModel(description = "An user doing various actions in an application")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-01-04T14:23:30.087Z")

@Entity
@Table(name = "user", uniqueConstraints = @UniqueConstraint(columnNames = {"username", "name"}))
public class User {
    @JsonProperty("username")
    @Id
    private String username = null;

    @JsonProperty("badges")
    @Valid
    @OneToMany(targetEntity = Badge.class, fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "user")
    private List<Badge> badges = null;

    @JsonProperty("points")
    @Valid
    @OneToMany(targetEntity = PointsOnPointScale.class, fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "user")
    private List<PointsOnPointScale> points = null;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "name", nullable = false)
    private GamifiedApplication application;

    public User username(String username) {
        this.username = username;
        return this;
    }

    /**
     * The username of the user
     *
     * @return username
     **/
    @ApiModelProperty(value = "The username of the user")


    public GamifiedApplication getApplication() {
        return application;
    }

    public void setApplication(GamifiedApplication application) {
        this.application = application;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public User badges(List<Badge> badges) {
        this.badges = badges;
        return this;
    }

    public User addBadgesItem(Badge badgesItem) {
        if (this.badges == null) {
            this.badges = new ArrayList<Badge>();
        }
        this.badges.add(badgesItem);
        return this;
    }

    /**
     * The badges awarded to the user
     *
     * @return badges
     **/
    @ApiModelProperty(value = "The badges awarded to the user")

    @Valid

    public List<Badge> getBadges() {
        return badges;
    }

    public void setBadges(List<Badge> badges) {
        this.badges = badges;
    }

    public User points(List<PointsOnPointScale> points) {
        this.points = points;
        return this;
    }

    public User addPointsItem(PointsOnPointScale pointsItem) {
        if (this.points == null) {
            this.points = new ArrayList<PointsOnPointScale>();
        }
        this.points.add(pointsItem);
        return this;
    }

    /**
     * The points received by the user
     *
     * @return points
     **/
    @ApiModelProperty(value = "The points received by the user")

    @Valid

    public List<PointsOnPointScale> getPoints() {
        return points;
    }

    public void setPoints(List<PointsOnPointScale> points) {
        this.points = points;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        User user = (User) o;
        return Objects.equals(this.username, user.username) &&
                Objects.equals(this.badges, user.badges) &&
                Objects.equals(this.points, user.points);
    }

    @Override
    public int hashCode() {
        return Objects.hash(username, badges, points);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class User {\n");

        sb.append("    username: ").append(toIndentedString(username)).append("\n");
        sb.append("    badges: ").append(toIndentedString(badges)).append("\n");
        sb.append("    points: ").append(toIndentedString(points)).append("\n");
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

