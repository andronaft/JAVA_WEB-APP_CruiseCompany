package org.galun.repository;

import org.galun.model.CruisestopsEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CruiseStopsRepo extends CrudRepository<CruisestopsEntity, Integer> {
}
