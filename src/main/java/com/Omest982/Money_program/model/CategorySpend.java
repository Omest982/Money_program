package com.Omest982.Money_program.model;

import com.Omest982.Money_program.model.base.BaseAccountEntity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "category_spends")
public class CategorySpend extends BaseAccountEntity {

    private int budget;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;
}
