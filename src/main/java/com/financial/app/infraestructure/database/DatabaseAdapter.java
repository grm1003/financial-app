package com.financial.app.infraestructure.database;

import com.financial.app.domain.entitys.CashFlow;
import com.financial.app.domain.ports.DatabasePort;
import com.financial.app.infraestructure.database.entity.FlowEntity;
import com.financial.app.infraestructure.database.repository.FlowRepository;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class DatabaseAdapter implements DatabasePort {
    private final FlowRepository flowRepository;
    @Override
    public void save(CashFlow cashFlow) {
        flowRepository.save(new FlowEntity(cashFlow));
    }
}
