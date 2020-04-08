package org.galun.service.impl;

import org.galun.model.ExcursionEntity;
import org.galun.repository.ExcursionRepo;
import org.galun.service.ExcursionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;

@Service("ExcursionServiceImpl")
@Repository
@Transactional
public class ExcursionServiceImpl implements ExcursionService {
    private final ExcursionRepo excursionRepo;

    @Autowired
    public ExcursionServiceImpl(ExcursionRepo excursionRepo) {
        this.excursionRepo = excursionRepo;
    }

    @Override
    public void add(ExcursionEntity excursionEntity) {
        excursionRepo.save(excursionEntity);
    }

    @Override
    public void update(ExcursionEntity excursionEntity) {
        excursionRepo.save(excursionEntity);
    }

    @Override
    public ArrayList<ExcursionEntity> getAll() {
        return (ArrayList<ExcursionEntity>) excursionRepo.findAll();
    }
}