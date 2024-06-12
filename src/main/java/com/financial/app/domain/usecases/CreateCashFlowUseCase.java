package com.financial.app.domain.usecases;


import com.financial.app.domain.entitys.CashFlow;
import com.financial.app.domain.ports.DatabasePort;
import com.financial.app.domain.resourses.CreateCashFlow;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class CreateCashFlowUseCase implements CreateCashFlow {
    private final DatabasePort databasePort;


    @Override
    public void execute(CashFlow cashFlow) {
        databasePort.save(cashFlow);
    }
}
