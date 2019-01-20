package ch.heig.amt.repositories;

import ch.heig.amt.entities.ApplicationEntity;
import ch.heig.amt.entities.UserEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends CrudRepository<UserEntity, Long> {

    UserEntity findByUsernameAndApplicationEntity(String username, ApplicationEntity applicationEntity);
    List<UserEntity> findAllByApplicationEntity(ApplicationEntity applicationEntity);
    UserEntity findUserEntityById(Long id);
}
