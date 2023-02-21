package com.alex.incapsulation.hw;

import java.util.Objects;

public class Bankomat {
    private Nominal nominalTwenty;
    private final int NOMINAL_TWENTY = 20;
    private Nominal nominalFifty;
    private final int NOMINAL_FIFTY = 50;
    private Nominal nominalHundred;
    private final int NOMINAL_HUNDRED = 100;
    private int totalBalance;
    private  int accountId = 0;
    private Account[] accounts;

    public Bankomat() {
        this.nominalTwenty = new Nominal();
        this.nominalFifty = new Nominal();
        this.nominalHundred = new Nominal();
        accounts = new Account[100];
    }


    public void loadMoneyIncassator(int nominal_Twenty, int nominal_Fifty, int nominal_Hundred) {
        localUpdater(nominalTwenty, nominal_Twenty, NOMINAL_TWENTY);
        localUpdater(nominalFifty, nominal_Fifty, NOMINAL_FIFTY);
        localUpdater(nominalHundred, nominal_Hundred, NOMINAL_HUNDRED);
        updateBalance();
        System.out.println("Загрузка денег в банкомат");
    }

    public void loadMoneyAccount(String accountName, int billCount, int billNominal) {
        int accountId = getAccountId(accountName);
        if (accountId != -1) {
            switch (billNominal) {
                case NOMINAL_TWENTY -> localUpdater(nominalTwenty, billCount, NOMINAL_TWENTY);
                case NOMINAL_FIFTY -> localUpdater(nominalFifty, billCount, NOMINAL_FIFTY);
                case NOMINAL_HUNDRED -> localUpdater(nominalHundred, billCount, NOMINAL_HUNDRED);
            }
            updateBalance();
            //внесение на счет
            accounts[accountId].setSumm(billCount * billNominal);
            accounts[accountId].printInfo();
        }
    }

    public void getMoneyAccount(String accountName, int summ) {
        int accountId = getAccountId(accountName);

        if (summ > accounts[accountId].getSumm()) {
            System.out.println("Недостаточно средств на счету у " + accountName);
            return;
        }

        if (summ > this.totalBalance) {
            System.out.println("Недостаточно средств в банкомате");
            return;
        }

        int countCurr = summ / NOMINAL_HUNDRED;
        int countHundred = (countCurr <= nominalHundred.getCount()) ? countCurr : nominalHundred.getCount();

        countCurr = (summ - countHundred * NOMINAL_HUNDRED) / NOMINAL_FIFTY;
        int countFifty = (countCurr <= nominalFifty.getCount()) ? countCurr : nominalFifty.getCount();

        countCurr = (summ - countHundred * NOMINAL_HUNDRED - countFifty * NOMINAL_FIFTY) / NOMINAL_TWENTY;
        int countTwenty = (countCurr <= nominalTwenty.getCount() ? countCurr : nominalTwenty.getCount());

        int summCorr = countHundred * NOMINAL_HUNDRED + countFifty * NOMINAL_FIFTY + countTwenty * NOMINAL_TWENTY;

        if (summCorr != summ) {
            System.out.println("Недостаточно купюр для выдачи суммы. Доступная сумма = " + summCorr);
            return;
        }
        //обновление кол-ва купюр
        localUpdater(nominalHundred, -countHundred, NOMINAL_HUNDRED);
        localUpdater(nominalFifty, -countFifty, NOMINAL_FIFTY);
        localUpdater(nominalTwenty, -countTwenty, NOMINAL_TWENTY);
        System.out.println("Снятие денег со счета " + accountName);
        System.out.println("Сумма к выдаче = " + summ + "");
        System.out.println("Количество купюр:");
        System.out.println("100р = " + countHundred);
        System.out.println("50р = " + countFifty);
        System.out.println("20р = " + countTwenty);

        accounts[accountId].setSumm(-summ);
        accounts[accountId].printInfo();
        updateBalance();
    }

    public void accountAdd(String accountName) {
        accounts[accountId] = new Account(accountName, accountId);
        accountId++;
    }

    private void updateBalance() {
        this.totalBalance = nominalTwenty.getSumm() + nominalFifty.getSumm() + nominalHundred.getSumm();
    }

    private void localUpdater(Nominal nominal, int billcount, int nomvalue) {
        nominal.updateCash(billcount, nomvalue);
    }


    private int getAccountId(String accountName) {
        for (Account account : accounts) {
            if (Objects.equals(account.getAccountName(), accountName))
                return account.getAccountId();
        }
        return -1;
    }

    public void showBalance() {
        System.out.println("В банкомете " + this.totalBalance + " рублёв");
    }

    public void showAccountSumm(String accountName) {
        System.out.println("Счет аккаунта " + accountName + " = " + accounts[getAccountId(accountName)].getSumm() + " рублёв");
    }
}
