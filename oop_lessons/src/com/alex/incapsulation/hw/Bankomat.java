package com.alex.incapsulation.hw;

import java.util.Objects;

public class Bankomat {
    private Nominal20 nominalTwenty;
    private Nominal50 nominalFifty;
    private Nominal100 nominalHundred;
    private int totalBalance;
    private static int accountId = 0;
    private Account[] accounts;

    public Bankomat(int nominalTwenty, int nominalFifty, int nominalHundred) {
        this.nominalTwenty = new Nominal20(nominalTwenty);
        this.nominalFifty = new Nominal50(nominalFifty);
        this.nominalHundred = new Nominal100(nominalHundred);
        updateBalance();
        accounts = new Account[100];
    }

    public void loadMoney(int nominalTwenty, int nominalFifty, int nominalHundred) {
        this.nominalTwenty.setCount(nominalTwenty);
        this.nominalFifty.setCount(nominalFifty);
        this.nominalHundred.setCount(nominalHundred);
        updateBalance();
    }

    public void accountAdd(String accountName) {
        accounts[accountId] = new Account(accountName, accountId);
        accountId++;
    }

    private void updateBalance() {
        this.totalBalance = nominalTwenty.getSumm() + nominalFifty.getSumm() + nominalHundred.getSumm();
    }

    public void Deposit(String accountName, int billCount, int billNominal) {
        int accountId = getAccountId(accountName);
        if (accountId != -1) {
            switch (billNominal) {
                case 20 -> nominalTwenty.setCount(billCount);
                case 50 -> nominalFifty.setCount(billCount);
                case 100 -> nominalHundred.setCount(billCount);
            }
            updateBalance();
            //внесение на счет
            accounts[accountId].setSumm(billCount * billNominal);
            accounts[accountId].printInfo();
        }
    }

    private int getAccountId(String accountName) {
        for (Account account : accounts) {
            if (Objects.equals(account.getAccountName(), accountName))
                return account.getAccountId();
        }
        return -1;
    }


    public int Debet() {
        int result = 0;

        return result;
    }

    public void showBalance() {
        System.out.println("В банкомете " + this.totalBalance + " рублёв");
    }

    public void ShowAccountSumm(String accountName) {
        System.out.println("Счет аккаунта " + accountName + " = " + accounts[getAccountId(accountName)].getSumm() + " рублёв");
    }
}
