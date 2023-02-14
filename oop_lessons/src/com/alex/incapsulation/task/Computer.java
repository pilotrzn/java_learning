package com.alex.incapsulation.task;

public abstract class Computer implements Printable {
    private Ram ram;
    private SSD ssd;

    public Computer(Ram ram, SSD ssd) {
        this.ram = ram;
        this.ssd = ssd;
    }

    public abstract void load();

    @Override
    public void print() {
        System.out.println("RAM: " + ram.getValue() + ", SSD: " + ssd.getValue());
    }

    public Ram getRam() {
        return ram;
    }
    public SSD getSsd() {
        return ssd;
    }


}
