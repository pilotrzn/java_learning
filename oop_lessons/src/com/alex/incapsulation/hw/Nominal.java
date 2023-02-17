package com.alex.incapsulation.hw;

public abstract class Nominal {
    private int count;
    private int summ;

    public int getCount() {
        return count;
    }

    public Nominal(int count) {
        this.count += count;
    }

    public void setCount(int count) {
        this.count += count;
    }

    public void setSumm(int summ) {
        this.summ += summ;
    }

    public int getSumm() {
        return summ;
    }
}
