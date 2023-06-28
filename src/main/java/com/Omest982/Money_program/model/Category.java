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
@Table(name = "categories")
public class Category extends BaseAccountEntity {

    private int budget;

    private boolean isSpend;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;
}
