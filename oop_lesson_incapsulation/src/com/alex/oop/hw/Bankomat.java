package com.alex.oop.hw;

public class Bankomat {
    private Nominal20 nominal20;
    private int count20Bill;
    private int count50Bill;
    private int count100Bill;
    private Nominal50 nominal50;
    private Nominal100 nominal100;



    private int totalBalance;

    private Account[] accounts;

    public Bankomat() {
        accounts = new Account[1000];
        this.nominal100 = new Nominal100(0);
        this.nominal50 = new Nominal50(0);
        this.nominal20 = new Nominal20(0);
        updateBalance();
    }

    public void accountAdd(int accountId) {
        accounts[accountId] = new Account(accountId);
    }

    private void updateBalance() {
        this.totalBalance = nominal20.getSumm() + nominal50.getSumm() + nominal100.getSumm();
    }

    public void Deposit(int accountId, int billCount, int billNominal) {
        switch (billNominal) {
            case 20 -> nominal20.setCount(billCount);
            case 50 -> nominal50.setCount(billCount);
            case 100 -> nominal100.setCount(billCount);
        }
        updateBalance();
        //внесение на счет
        accounts[accountId].setSumm(billCount * billNominal);
    }

    public int Debet() {
        int result = 0;

        return result;
    }

    public void showBalance() {
        System.out.println("В банкомете " + this.totalBalance + " рублёв");
    }

    public void ShowAccountSumm(int accountId) {
        System.out.println("Счет аккаунта " + accountId + " = " + accounts[accountId].getSumm() + " рублёв");
    }
}
