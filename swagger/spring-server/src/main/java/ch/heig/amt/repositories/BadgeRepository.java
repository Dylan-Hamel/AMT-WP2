package ch.heig.amt.repositories;

import ch.heig.amt.entities.ApplicationEntity;
import ch.heig.amt.entities.BadgeEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BadgeRepository extends CrudRepository<BadgeEntity, Integer> {

    BadgeEntity findBadgeEntityByName(String name);
    BadgeEntity findByIdAndApplicationEntity(Integer id, ApplicationEntity applicationEntity);
    List<BadgeEntity> findAllByApplicationEntity(ApplicationEntity application);
}
