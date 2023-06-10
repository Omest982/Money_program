package com.Omest982.Money_program.model;

import jakarta.persistence.*;

@Entity
@Table(name = "category_spends")
public class CategorySpend extends BaseAccountEntity{
    @Column(name = "budget")
    private int budget;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    public CategorySpend() {
    }

    public int getBudget() {
        return budget;
    }

    public void setBudget(int budget) {
        this.budget = budget;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
