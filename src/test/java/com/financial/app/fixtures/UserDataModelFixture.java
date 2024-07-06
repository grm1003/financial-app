package com.financial.app.fixtures;


import com.financial.app.domain.models.UserDataModel;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class UserDataModelFixture {
    @Builder.Default
    private String name = "Gabriel Machado";
    @Builder.Default
    private String email = "Missil@example.com";
    @Builder.Default
    private Double amount = 100.0;
    @Builder.Default
    private Double dueAmount = 90.0;

    public UserDataModel getMock() {
        return UserDataModel.builder()
                .name(name)
                .email(email)
                .amount(amount)
                .dueAmount(dueAmount)
                .build();
    }
}
