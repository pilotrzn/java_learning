package com.alex.incapsulation.hw;

public class Nominal100 {
    private int count;
    private int summ;
    public final int NOMINAL = 100;

    public Nominal100(int count) {
        this.count += count;
        this.summ += count * NOMINAL;
    }

    public int getSumm() {
        return summ;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count += count;
        this.summ += count * NOMINAL;
    }
}
