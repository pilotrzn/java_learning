package com.alex.incapsulation.hw;

public class Account {
    private int accountId;
    private String accountName;
    private int summ;

    public Account(String accountName, int accountId) {
        this.accountId = accountId;
        this.accountName = accountName;
        this.summ += 0;
    }

    public String getAccountName() {
        return this.accountName;
    }

    public int getSumm() {
        return this.summ;
    }

    public int getAccountId() {
        return this.accountId;
    }

    public void setSumm(int summ) {
        this.summ += summ;
    }

    public void printInfo() {
        System.out.println("На счету " + accountName + " " + summ + " рублев");
    }
}
