package ch.heig.amt.repositories;

import ch.heig.amt.entities.BadgeEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BadgeRepository extends CrudRepository<BadgeEntity, Long> {

    BadgeEntity findBadgeEntityByName(String name);
}
