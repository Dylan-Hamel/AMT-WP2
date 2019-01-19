package ch.heig.amt.repositories;

import ch.heig.amt.entities.RuleEntity;
import org.springframework.data.repository.CrudRepository;

public interface RuleRepository extends CrudRepository<RuleEntity, Long> {
}
