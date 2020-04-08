package org.galun.service.impl;

import org.galun.model.PortsEntity;
import org.galun.repository.PortsRepo;
import org.galun.service.PortService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;

@Service("PortServiceImpl")
@Repository
@Transactional
public class PortServiceImpl implements PortService {
    private final PortsRepo portRepo;

    @Autowired
    public PortServiceImpl(PortsRepo portRepo) {
        this.portRepo = portRepo;
    }

    @Override
    public void add(PortsEntity portsEntity) {
        portRepo.save(portsEntity);
    }

    @Override
    public void update(PortsEntity portsEntity) {
        portRepo.save(portsEntity);
    }

    @Override
    public ArrayList<PortsEntity> getAll() {
        return (ArrayList<PortsEntity>) portRepo.findAll();
    }
}
