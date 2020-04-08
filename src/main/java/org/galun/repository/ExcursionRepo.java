package org.galun.repository;

import org.galun.model.ExcursionEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExcursionRepo extends CrudRepository<ExcursionEntity, Integer> {
}