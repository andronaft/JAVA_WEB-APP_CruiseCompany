package org.galun.repository;

import org.galun.model.PortsEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PortsRepo extends CrudRepository<PortsEntity, Integer> {
}