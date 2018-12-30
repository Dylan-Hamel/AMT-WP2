package ch.heigvd.gamification.model;

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
@Table(name = "badge")
public class Badge {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private long id;

    @Column(name = "name", nullable = false)
    private String name;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "app_id", nullable = false)
    private Application app;
}
