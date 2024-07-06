package com.financial.app.domain.usecases;


import com.financial.app.domain.entitys.CashFlow;
import com.financial.app.domain.entitys.UserDataModel;
import com.financial.app.domain.enums.CashFlowType;
import com.financial.app.domain.ports.DatabasePort;
import com.financial.app.domain.resourses.CreateCashFlow;
import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class CreateCashFlowUseCase implements CreateCashFlow {
    private final DatabasePort databasePort;


    @Override
    public void execute(CashFlow cashFlow) {

        UserDataModel user = databasePort.findUser(cashFlow.getUser().getEmail()).orElseThrow(EntityNotFoundException::new);
        if (cashFlow.getType().equals(CashFlowType.EXPENSE)) {
            user.setDueAmount(user.getDueAmount() + cashFlow.getAmount());
        } else {
            user.setAmount(user.getAmount() + cashFlow.getAmount());
        }
        databasePort.saveCash(cashFlow);
        databasePort.updateUser(user);

    }


}

