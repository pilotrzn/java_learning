package com.alex.oop.hw;

public class BankomatRunner {
    public static void main(String[] args) {
        Bankomat bankomat = new Bankomat();
        bankomat.accountAdd(100);

        bankomat.accountAdd(1);
        bankomat.accountAdd(8);
        bankomat.Deposit(1, 15, 20);
        bankomat.ShowAccountSumm(1);

        bankomat.Deposit(100, 200, 50);
        bankomat.Deposit(100, 10, 20);
        bankomat.Deposit(100, 30, 100);
        bankomat.ShowAccountSumm(100);

        bankomat.accountAdd(101);
        bankomat.Deposit(101, 230, 50);
        bankomat.ShowAccountSumm(101);

        bankomat.showBalance();
        bankomat.Deposit(8, 2110, 100);
        bankomat.ShowAccountSumm(8);
        bankomat.showBalance();
    }


}
