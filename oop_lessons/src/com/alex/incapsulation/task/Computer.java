package com.alex.incapsulation.task;

public class Computer {
    private Ram ram;
    private SSD ssd;

    public Computer(Ram ram, SSD ssd) {
        this.ram = ram;
        this.ssd = ssd;
    }

    public void printState() {
        System.out.println("Computers RAM: " + ram.getValue() + ", SSD: " + ssd.getValue());
    }
}
