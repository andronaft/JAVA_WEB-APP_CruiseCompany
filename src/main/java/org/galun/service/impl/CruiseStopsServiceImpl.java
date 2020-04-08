package org.galun.service.impl;

import org.galun.model.CruisestopsEntity;
import org.galun.repository.CruiseStopsRepo;
import org.galun.service.CruiseStopsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;

@Service("CruiseStopsServiceImpl")
@Repository
@Transactional
public class CruiseStopsServiceImpl implements CruiseStopsService {
    private final CruiseStopsRepo ceruiseStopsRepo;

    @Autowired
    public CruiseStopsServiceImpl(CruiseStopsRepo ceruiseStopsRepo) {
        this.ceruiseStopsRepo = ceruiseStopsRepo;
    }

    @Override
    public void add(CruisestopsEntity cruisestopsEntity) {
        ceruiseStopsRepo.save(cruisestopsEntity);
    }

    @Override
    public void update(CruisestopsEntity cruisestopsEntity) {
        ceruiseStopsRepo.save(cruisestopsEntity);
    }

    @Override
    public ArrayList<CruisestopsEntity> getAll() {
        return (ArrayList<CruisestopsEntity>) ceruiseStopsRepo.findAll();
    }
}