package ch.heig.amt.repositories;

import ch.heig.amt.entities.PointScaleEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PointScaleRepository extends CrudRepository<PointScaleEntity, Long> {

    PointScaleEntity findPointScaleEntitiesByName(String name);
    boolean existsByName(String name);
}
