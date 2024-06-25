package com.financial.app.domain.resourses;

import com.financial.app.domain.entitys.UserDataModel;

import java.util.Optional;

public interface CreateUser {
    public Optional<UserDataModel> createUser(UserDataModel user);
}
