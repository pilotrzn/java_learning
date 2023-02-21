package com.alex.incapsulation.hw;

public class BankomatRunner {
    public static void main(String[] args) {
        Bankomat bankomat = new Bankomat();

        bankomat.loadMoneyIncassator(3000,
                3,
                2000);
        bankomat.showBalance();

        bankomat.accountAdd("Иванов");
        bankomat.accountAdd("Петров");
        bankomat.accountAdd("Сидоров");
        bankomat.accountAdd("Рабинович");

        bankomat.showAccountSumm("Иванов");
        bankomat.loadMoneyAccount("Иванов", 100, 20);
        bankomat.loadMoneyAccount("Иванов", 2, 50);

        bankomat.showAccountSumm("Иванов");
        bankomat.getMoneyAccount("Иванов",510);

        //bankomat.loadMoneyAccount("Сидоров",30,50);
        bankomat.loadMoneyAccount("Сидоров", 230,20);

        bankomat.getMoneyAccount("Сидоров",280);

        //bankomat.loadMoneyIncassator(0,300,1000);
        bankomat.showBalance();
    }


}
