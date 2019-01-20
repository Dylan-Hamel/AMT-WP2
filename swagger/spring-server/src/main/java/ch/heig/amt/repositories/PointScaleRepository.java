package ch.heig.amt.repositories;

import ch.heig.amt.entities.ApplicationEntity;
import ch.heig.amt.entities.PointScaleEntity;
import javafx.application.Application;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PointScaleRepository extends CrudRepository<PointScaleEntity, Long> {

    PointScaleEntity findPointScaleEntitiesByName(String name);
    List<PointScaleEntity> findPointScaleEntitiesByApplicationEntity(ApplicationEntity applicationEntity);
    boolean existsByName(String name);
}
