package ch.heigvd.gamification.model;

import org.hibernate.type.EntityType;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Ansermoz Yannis
 * @author de Bourgues Cyril
 * @author Hamel Dylan
 * @author Pradervand Kevin
 *
 */

@Entity
@Table(name = "event")
public class Event implements Serializable {

    /*
     * MEMBERS
     */
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private long id;

    @Column(name = "userId", nullable = false)
    private long userId;

    @Column(name = "timestamp")
    @Temporal(TemporalType.TIMESTAMP)
    private Date timestamp;

    @Column(name = "eventType")
    private String eventType;

    /* It is a good idea to include a map of "properties" in the event data structure,
     * so that every application can freely define its own event attributes.
     */
    @Column(name = "properties")
    @ManyToMany(cascade = CascadeType.ALL)
    // TODO : replace EntityType by suitable type
            Map<String, EntityType> propertyMap = new HashMap<String, EntityType>();

    /*
     * CONSTRUCTORS
     */

    public Event(long userId, Date timestamp, String eventType, Map<String, EntityType> propertyMap) {
        this.userId = userId;
        this.timestamp = timestamp;
        this.eventType = eventType;
        this.propertyMap = propertyMap;
    }

    /*
     * GETTERS & SETTERS
     */

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }

    public String getEventType() {
        return eventType;
    }

    public void setEventType(String eventType) {
        this.eventType = eventType;
    }

    public Map<String, EntityType> getPropertyMap() {
        return propertyMap;
    }

    public void setPropertyMap(Map<String, EntityType> propertyMap) {
        this.propertyMap = propertyMap;
    }
}
