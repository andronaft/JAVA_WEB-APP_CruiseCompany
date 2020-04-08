package org.galun.service.impl;

import org.galun.repository.ExcursionRepo;
import org.galun.service.ExcursionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("ExhibitServiceImpl")
@Repository
@Transactional
public class ExcursionServiceImpl implements ExcursionService {
    private final ExcursionRepo excursionRepo;

    @Autowired
    public ExcursionServiceImpl(ExcursionRepo excursionRepo) {
        this.excursionRepo = excursionRepo;
    }
}