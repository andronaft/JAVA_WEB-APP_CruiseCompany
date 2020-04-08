package org.galun.service.impl;

import org.galun.repository.CruiseStopsRepo;
import org.galun.service.CruiseStopsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("ExhibitServiceImpl")
@Repository
@Transactional
public class CruiseStopsServiceImpl implements CruiseStopsService {
    private final CruiseStopsRepo eruiseStopsRepo;

    @Autowired
    public CruiseStopsServiceImpl(CruiseStopsRepo eruiseStopsRepo) {
        this.eruiseStopsRepo = eruiseStopsRepo;
    }
}