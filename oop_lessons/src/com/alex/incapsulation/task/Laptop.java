package com.alex.incapsulation.task;

public final class Laptop extends Computer {
    private int weight;

    public Laptop(Ram ram, SSD ssd, int weight) {
        super(ram, ssd);
        this.weight = weight;
    }

    @Override
    public void load() {
        open();
        System.out.println("нубук загрузился");
    }

    @Override
    public void print() {
        super.print();
        System.out.println("weight = " + weight);
    }

    public void open() {
        System.out.println("Открыл крышку нубука");
    }

    public int getWeight() {
        return weight;
    }
}
