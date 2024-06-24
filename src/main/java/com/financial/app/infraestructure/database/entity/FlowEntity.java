package com.financial.app.infraestructure.database.entity;


import com.financial.app.domain.entitys.CashFlow;
import com.financial.app.domain.enums.CategoryEnum;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@Entity
@NoArgsConstructor
@Table(name = "cash_flow")
public class FlowEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "email")
    private String email;

    @Column(name = "description")
    private String description;

    @Enumerated(EnumType.STRING)
    @Column(name = "category")
    private CategoryEnum category;

    @Column(name = "amount")
    private double amount;

    public FlowEntity(CashFlow cashFlow) {
        this.email = cashFlow.getUser().getEmail();
        this.description = cashFlow.getDescription().orElse(null);
        this.category = cashFlow.getCategory();
        this.amount = cashFlow.getAmount();
    }
}
