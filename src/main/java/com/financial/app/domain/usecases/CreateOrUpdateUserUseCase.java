package com.financial.app.domain.usecases;

import com.financial.app.domain.entitys.UserDataModel;
import com.financial.app.domain.ports.DatabasePort;
import com.financial.app.domain.resourses.CreateOrUpdateUser;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CreateOrUpdateUserUseCase implements CreateOrUpdateUser {
    private final DatabasePort databasePort;


    @Override
    public void createUser(UserDataModel user) {
       databasePort.findUser(user.getEmail()).ifPresentOrElse(
               databasePort::updateUser,
               () -> databasePort.createUser(user));
    }
}