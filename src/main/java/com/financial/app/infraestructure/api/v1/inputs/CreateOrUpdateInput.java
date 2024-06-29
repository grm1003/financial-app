package com.financial.app.infraestructure.api.v1.inputs;

import com.financial.app.domain.entitys.UserDataModel;
import lombok.Data;

@Data
public class CreateOrUpdateInput {
    private String name;
    private String email;

    public UserDataModel toModel() {
        return UserDataModel.builder()
                .name(name)
                .email(email)
                .amount(0.0)
                .dueAmount(0.0)
                .build();
    }
}
