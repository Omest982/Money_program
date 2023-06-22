package com.Omest982.Money_program.model;

import com.Omest982.Money_program.model.base.Transaction;
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
@Table(name = "transaction_earns")
public class TransactionEarn extends Transaction {
    @ManyToOne
    @JoinColumn(name = "category_earn_id", nullable = false)
    private CategoryEarn categoryEarn;
}
