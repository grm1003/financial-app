package com.financial.app.domain.entitys;


import com.financial.app.domain.enums.CashFlowType;
import com.financial.app.domain.enums.CategoryEnum;
import lombok.Builder;
import lombok.Data;


import java.util.Optional;

@Data
@Builder
public class CashFlow {
    private UserDataModel user;
    private Optional<String> description;
    private CategoryEnum category;
    private CashFlowType type;
    private Double amount;

}
