package com.financial.app.domain.ports;

import com.financial.app.domain.entitys.CashFlow;
import com.financial.app.domain.entitys.UserDataModel;

import java.util.List;
import java.util.Optional;

public interface DatabasePort {
    void saveCash(CashFlow cashFlow);

    Optional<UserDataModel> findUser(String email);

    void updateUser(UserDataModel user);

    public List<UserDataModel>findAllUsers();

    public void createUser(UserDataModel user);

    public void deleteUser(String email);


}
