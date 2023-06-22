package com.Omest982.Money_program.model;

import com.Omest982.Money_program.model.base.BaseAccountEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "category_earns")
public class CategoryEarn extends BaseAccountEntity {

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;
}