package com.alex.incapsulation.hw;

public class Nominal {
    private int count;
    private int summ;

    public int getCount() {
        return count;
    }

    public void updateCash(int count, int nominal) {
        this.count += count;
        this.summ += (count * nominal);
    }

    public int getSumm() {
        return summ;
    }
}
