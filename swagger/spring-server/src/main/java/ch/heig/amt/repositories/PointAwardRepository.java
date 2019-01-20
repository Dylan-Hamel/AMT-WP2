package ch.heig.amt.repositories;

import ch.heig.amt.entities.PointAwardEntity;
import ch.heig.amt.entities.RuleEntity;
import ch.heig.amt.entities.UserEntity;
import org.springframework.data.repository.CrudRepository;

public interface PointAwardRepository extends CrudRepository<PointAwardEntity, Integer> {
    PointAwardEntity findByUserEntityAndRuleEntity(UserEntity userEntity, RuleEntity ruleEntity);
}
