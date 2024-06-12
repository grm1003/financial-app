package com.financial.app.domain.entitys;


import com.financial.app.domain.enums.CategoryEnum;
import lombok.Builder;
import lombok.Data;


import java.util.Optional;

@Data
@Builder
public class CashFlow {
    private  UserDataEntity data;
    private Optional<String> description;
    private CategoryEnum category;
    private double amount;

}
