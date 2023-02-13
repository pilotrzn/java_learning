package com.alex.incapsulation.hw;

public class Nominal20 {
    private int count;
    private int summ;
    private final int NOMINAL = 20;

    public int getCount() {
        return count;
    }

    public int getSumm() {
        return summ;
    }

    public void setCount(int count) {
        this.count += count;
        this.summ += count * NOMINAL;
    }

    public Nominal20(int count) {
        this.count = count;
        this.summ = count * NOMINAL;
    }
}
