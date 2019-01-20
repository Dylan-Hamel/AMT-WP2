package ch.heig.amt.entities;

import ch.heig.amt.api.model.EventDTO;

import javax.persistence.*;

@Entity
@Table(name = "property")
public class PropertyEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String cle;

    private String val;

    @ManyToOne
    private EventEntity eventEntity;

    public Long getId() {
        return id;
    }

    public String getKey() {
        return cle;
    }

    public void setKey(String key) {
        this.cle = key;
    }

    public String getValue() {
        return val;
    }

    public void setValue(String value) {
        this.val = value;
    }
}
