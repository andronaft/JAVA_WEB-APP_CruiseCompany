package org.galun.service.impl;

import org.galun.model.ShipEntity;
import org.galun.repository.ShipRepo;
import org.galun.service.ShipService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;

@Service("ShipServiceImpl")
@Repository
@Transactional
public class ShipServiceImpl implements ShipService {
    private final ShipRepo shipRepo;

    @Autowired
    public ShipServiceImpl(ShipRepo shipRepo) {
        this.shipRepo = shipRepo;
    }

    @Override
    public void add(ShipEntity ship) {
        shipRepo.save(ship);
    }

    @Override
    public ShipEntity update(ShipEntity shipEntity) {
        return shipRepo.save(shipEntity);
    }

    @Override
    public ArrayList<ShipEntity> getAll() {
        return (ArrayList<ShipEntity>) shipRepo.findAll();
    }
}