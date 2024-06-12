package com.financial.app.domain.ports;

import com.financial.app.domain.entitys.CashFlow;

public interface DatabasePort {
    void save(CashFlow cashFlow);
}
