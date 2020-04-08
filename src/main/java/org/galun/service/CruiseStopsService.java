package org.galun.service;

import org.galun.model.CruisestopsEntity;

import java.util.ArrayList;

public interface CruiseStopsService {
    void add(CruisestopsEntity cruisestopsEntity);
    void update(CruisestopsEntity cruisestopsEntity);
    ArrayList<CruisestopsEntity> getAll();
}
