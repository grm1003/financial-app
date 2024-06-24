package com.financial.app.domain.entitys;


import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class UserDataModel {
    private String name;
    private String email;
    private Double amount;
    private Double dueAmount;


}
