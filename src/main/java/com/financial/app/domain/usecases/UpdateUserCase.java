package com.financial.app.domain.usecases;

import com.financial.app.domain.entitys.UserDataModel;
import com.financial.app.domain.ports.DatabasePort;
import com.financial.app.domain.resourses.UpdateUser;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class UpdateUserCase implements UpdateUser {
    private final DatabasePort databasePort;

    @Override
    public void updateUser(UserDataModel user) {
        UserDataModel use = databasePort.findUser(user.getEmail()).orElseGet(() -> databasePort.createUser(user).get());
        databasePort.updateUser(use);


    }
}
