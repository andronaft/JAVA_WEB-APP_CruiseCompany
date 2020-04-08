package org.galun.service.impl;

import org.galun.model.CruiseEntity;
import org.galun.repository.CruiseRepo;
import org.galun.service.CruiseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;

@Service("CruiseServiceImpl")
@Repository
@Transactional
public class CruiseServiceImpl implements CruiseService {
    private final CruiseRepo cruiseRepo;

    @Autowired
    public CruiseServiceImpl(CruiseRepo cruiseRepo) {
        this.cruiseRepo = cruiseRepo;
    }

    @Override
    public void add(CruiseEntity cruiseEntity) {
        cruiseRepo.save(cruiseEntity);
    }

    @Override
    public void update(CruiseEntity cruiseEntity) {
        cruiseRepo.save(cruiseEntity);
    }

    @Override
    public ArrayList<CruiseEntity> getAll() {
        return (ArrayList<CruiseEntity>) cruiseRepo.findAll();
    }
}

