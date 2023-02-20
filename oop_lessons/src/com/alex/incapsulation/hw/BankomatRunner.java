package com.alex.incapsulation.hw;

public class BankomatRunner {
    public static void main(String[] args) {
        Bankomat bankomat = new Bankomat();

        bankomat.loadMoneyIncassator(200,100,2);
        bankomat.showBalance();

        bankomat.accountAdd("Иванов");
        bankomat.accountAdd("Петров");
        bankomat.accountAdd("Сидоров");
        bankomat.accountAdd("Рабинович");

        bankomat.showAccountSumm("Иванов");
        bankomat.loadMoneyAccount("Иванов", 15, 20);
        bankomat.loadMoneyAccount("Иванов", 20, 50);

        bankomat.showAccountSumm("Иванов");
        bankomat.getMoneyAccount("Иванов",2500);

        bankomat.loadMoneyAccount("Сидоров",30,50);
        bankomat.loadMoneyAccount("Сидоров", 23,20);

        bankomat.getMoneyAccount("Сидоров",1270);

        //bankomat.loadMoneyIncassator(0,300,1000);
        bankomat.showBalance();
    }


}
