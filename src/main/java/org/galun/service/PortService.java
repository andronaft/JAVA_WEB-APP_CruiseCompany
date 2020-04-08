package org.galun.service;

import org.galun.model.PortsEntity;

import java.util.ArrayList;

public interface PortService {
    void add(PortsEntity portsEntity);
    void update(PortsEntity portsEntity);
    ArrayList<PortsEntity> getAll();
}

