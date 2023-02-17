package com.alex.incapsulation.hw;

public class Nominal20 extends Nominal {
    private final int NOMINAL = 20;
    
    public Nominal20(int count) {
        super(count);
        setSumm(count * NOMINAL);
    }
}
