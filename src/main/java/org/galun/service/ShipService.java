package org.galun.service;

import org.galun.model.ShipEntity;

import java.util.ArrayList;

public interface ShipService {
    void add(ShipEntity ship);
    ShipEntity update(ShipEntity shipEntity);
    ArrayList<ShipEntity> getAll();
}
