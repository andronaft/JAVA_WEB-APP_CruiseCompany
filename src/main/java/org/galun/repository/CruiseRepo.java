package org.galun.repository;

import org.galun.model.CruiseEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CruiseRepo extends CrudRepository<CruiseEntity, Integer> {
}
