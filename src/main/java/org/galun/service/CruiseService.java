package org.galun.service;

import org.galun.model.CruiseEntity;

import java.util.ArrayList;

public interface CruiseService {
    void add(CruiseEntity cruiseEntity);
    void update(CruiseEntity cruiseEntity);
    ArrayList<CruiseEntity> getAll();
}
