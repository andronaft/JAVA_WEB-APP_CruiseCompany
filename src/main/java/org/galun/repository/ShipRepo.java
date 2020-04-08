package org.galun.repository;

import org.galun.model.ShipEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ShipRepo extends CrudRepository<ShipEntity, Integer> {
}