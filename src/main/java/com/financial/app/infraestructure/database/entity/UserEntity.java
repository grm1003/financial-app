package com.financial.app.infraestructure.database.entity;

import com.financial.app.domain.models.UserDataModel;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
@Table(name = "user_data")
public class UserEntity {
    @Id
    @Column(name = "email")
    private String email;
    @Column(name = "name")
    private String name;
    @Column(name = "amount")
    private Double amount;
    @Column(name = "due_amount")
    private Double dueAmount;

    public UserDataModel toEntity() {
        return UserDataModel.builder()
                .email(email)
                .name(name)
                .amount(amount)
                .dueAmount(dueAmount)
                .build();
    }

    public UserEntity(UserDataModel user) {
        this.email = user.getEmail();
        this.name = user.getName();
        this.amount = user.getAmount();
        this.dueAmount = user.getDueAmount();
    }

}
