package com.alex.incapsulation.task;

public class CompositionRunner {

    public static void main(String[] args) {
        Ram ram = new Ram(8000);
        SSD ssd = new SSD(512);
        //Computer computer = new Computer(ram, ssd);
        //computer.load();
        Laptop laptop = new Laptop(new Ram(8000), new SSD(256), 2);
        laptop.load();
        laptop.open();
    }
}
