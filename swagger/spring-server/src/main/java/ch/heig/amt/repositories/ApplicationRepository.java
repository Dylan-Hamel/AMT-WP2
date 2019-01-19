package ch.heig.amt.repositories;

import ch.heig.amt.entities.ApplicationEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.Repository;

public interface ApplicationRepository extends Repository<ApplicationEntity, Long> {

    ApplicationEntity findByToken(String token);
}
