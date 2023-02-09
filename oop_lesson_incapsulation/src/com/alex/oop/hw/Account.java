package com.alex.oop.hw;

public class Account {
    private int accountId;
    private int summ;

    public Account(int accountId) {
        this.accountId = accountId;
        this.summ = 0;
    }

    public int getSumm() {
        return summ;
    }

    public void setSumm(int summ) {
        this.summ = summ;
    }
}
