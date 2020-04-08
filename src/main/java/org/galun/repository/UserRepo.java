package org.galun.repository;

import org.galun.model.UserEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends CrudRepository<UserEntity, Integer> {
    UserEntity findByLogin(String login);
    UserEntity findOneById(int id);
}
