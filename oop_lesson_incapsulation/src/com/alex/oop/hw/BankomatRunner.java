package com.alex.oop.hw;

public class BankomatRunner {
    public static void main(String[] args) {
        Bankomat bankomat = new Bankomat(200,100,500);
        bankomat.showBalance();

        bankomat.accountAdd("Иванов");
        bankomat.accountAdd("Петров");
        bankomat.accountAdd("Сидоров");
        bankomat.accountAdd("Рабинович");

        bankomat.Deposit("Иванов", 15, 20);
        bankomat.Deposit("Иванов", 20, 50);

        //bankomat.ShowAccountSumm("Иванов");

   /*       bankomat.Deposit(100, 200, 50);
        bankomat.Deposit(100, 10, 20);
        bankomat.Deposit(100, 30, 100);
        bankomat.ShowAccountSumm(100);


        bankomat.Deposit(101, 230, 50);
        bankomat.ShowAccountSumm(101);

        bankomat.showBalance();
        bankomat.Deposit(8, 2110, 100);
        bankomat.ShowAccountSumm(8);*/
        bankomat.loadMoney(0,300,1000);
        bankomat.showBalance();
    }


}
