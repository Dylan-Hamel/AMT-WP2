package ch.heig.amt.repositories;

import ch.heig.amt.entities.EventEntity;
import ch.heig.amt.entities.UserEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EventRepository extends CrudRepository<EventEntity, Long> {

}
