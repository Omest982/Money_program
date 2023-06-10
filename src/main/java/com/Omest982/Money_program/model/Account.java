package com.Omest982.Money_program.model;


import jakarta.persistence.MappedSuperclass;

@MappedSuperclass
public class Account {

    private String name;

    private int money;

    public Account() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }
}
