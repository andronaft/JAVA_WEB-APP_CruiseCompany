package org.galun.service.impl;

import org.galun.repository.PortsRepo;
import org.galun.service.PortService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("ExhibitServiceImpl")
@Repository
@Transactional
public class PortServiceImpl implements PortService {
    private final PortsRepo portRepo;

    @Autowired
    public PortServiceImpl(PortsRepo portRepo) {
        this.portRepo = portRepo;
    }
}
