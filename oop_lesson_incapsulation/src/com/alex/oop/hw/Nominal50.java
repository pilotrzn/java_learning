package com.alex.oop.hw;

public class Nominal50 {
    private int count;
    private int summ;
    private final int NOMINAL = 50;

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

    public Nominal50(int count) {
        this.count = count;
        this.summ = count * NOMINAL;
    }
}
