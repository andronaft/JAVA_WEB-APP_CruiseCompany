package org.galun.service;

import org.galun.model.UserEntity;

import java.util.ArrayList;

public interface UserService {

    UserEntity update(UserEntity userEntity);
    UserEntity login(UserEntity userEntity);
    void registration(UserEntity userEntity);
    UserEntity getById(UserEntity userEntity);
    ArrayList<UserEntity> getAll(UserEntity admin);
    boolean isAdmin(UserEntity admin);
}
