package com.financial.app.domain.ports;

import com.financial.app.domain.entitys.CashFlow;
import com.financial.app.domain.entitys.UserDataModel;

import java.util.Optional;

public interface DatabasePort {
    void saveCash(CashFlow cashFlow);

    Optional<UserDataModel> findUser(String email);

    void updateUser(UserDataModel user);

}
