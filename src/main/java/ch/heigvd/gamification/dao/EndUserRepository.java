package ch.heigvd.gamification.dao;

import ch.heigvd.gamification.model.EndUser;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author Ansermoz Yannis
 * @author de Bourgues Cyril
 * @author Hamel Dylan
 * @author Pradervand Kevin
 *
 */

public interface EndUserRepository extends CrudRepository<EndUser, Long>{

  public EndUser findByApplicationNameAndIdInGamifiedApplication(String targetApplicationName, String targetEndUserId);
  
}
