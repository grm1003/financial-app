package com.financial.app.domain.usecases;

import com.financial.app.domain.entitys.UserDataModel;
import com.financial.app.domain.ports.DatabasePort;
import com.financial.app.domain.resourses.CreateUser;
import lombok.RequiredArgsConstructor;

import java.util.Optional;

@RequiredArgsConstructor
public class CreateUserUseCase implements CreateUser {
    private final DatabasePort databasePort;


    @Override
    public Optional<UserDataModel> createUser(UserDataModel user) {
        UserDataModel userDataModel = databasePort.findUser(user.getEmail()).orElse(null);
        if (userDataModel == null) {
            return Optional.of(databasePort.createUser(user).get());
        } else
            return Optional.empty();
    }
}
