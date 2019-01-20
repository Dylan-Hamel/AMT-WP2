package ch.heig.amt.repositories;

import ch.heig.amt.entities.*;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface RuleRepository extends CrudRepository<RuleEntity, Integer> {

    RuleEntity findAllByIdAndBadgeEntity_ApplicationEntity(Integer id, ApplicationEntity applicationEntity);

    // RuleEntity findAllByIdAndBadgeEntity_ApplicationEntity(Integer id, ApplicationEntity applicationEntity);

    List<RuleEntity> findAllByBadgeEntity_ApplicationEntity(ApplicationEntity application);

    List<RuleEntity> findAllByBadgeEntity_ApplicationEntityAndType(ApplicationEntity application, String type);

    List<PointAwardEntity> findAllByPointAwardEntitiesAndBadgeEntity_ApplicationEntity(PointAwardEntity pointAwardEntity,
                                                                                       ApplicationEntity applicationEntity);
}
