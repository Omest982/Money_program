package com.Omest982.Money_program.model;

import jakarta.persistence.*;

@Entity
@Table(name = "wallets")
public class Wallet extends BaseAccountEntity {

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    public Wallet() {
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

}
