package org.galun.service.impl;

import org.galun.repository.CruiseRepo;
import org.galun.service.CruiseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("ExhibitServiceImpl")
@Repository
@Transactional
public class CruiseServiceImpl implements CruiseService {
    private final CruiseRepo cruiseRepo;

    @Autowired
    public CruiseServiceImpl(CruiseRepo cruiseRepo) {
        this.cruiseRepo = cruiseRepo;
    }
}

