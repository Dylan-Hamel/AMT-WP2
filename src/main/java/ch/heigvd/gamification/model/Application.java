package ch.heigvd.gamification.model;

import java.io.Serializable;
import javax.persistence.*;

/**
 *
 * @author Ansermoz Yannis
 * @author de Bourgues Cyril
 * @author Hamel Dylan
 * @author Pradervand Kevin
 *
 */

@Entity
@Table(name = "application")
public class Application implements Serializable {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  @Column(name = "id")
  private long id;

  @Column(name = "name", unique = true)
  private String name;

  @Column(name = "passwordHash", nullable = false)
  private String passwordHash;

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getPasswordHash() {
    return passwordHash;
  }

  public void setPasswordHash(String passwordHash) {
    // TODO : generate a secure pass hash
    this.passwordHash = passwordHash;
  }

}
