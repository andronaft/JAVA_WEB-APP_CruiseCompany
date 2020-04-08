package org.galun.service;

import org.galun.model.ExcursionEntity;

import java.util.ArrayList;

public interface ExcursionService {
    void add(ExcursionEntity excursionEntity);
    void update(ExcursionEntity excursionEntity);
    ArrayList<ExcursionEntity> getAll();
}
