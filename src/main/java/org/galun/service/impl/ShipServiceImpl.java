package org.galun.service.impl;

import org.galun.repository.ShipRepo;
import org.galun.service.ShipService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("ExhibitServiceImpl")
@Repository
@Transactional
public class ShipServiceImpl implements ShipService {
    private final ShipRepo shipRepo;

    @Autowired
    public ShipServiceImpl(ShipRepo shipRepo) {
        this.shipRepo = shipRepo;
    }
}