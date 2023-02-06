package com.alex.oop.lesson2;

public class Computer {
    private int ssd = 500;
    private int ram ;

    public Computer() {
        System.out.println("Я был создан!");
    }

    public Computer(int newSsd) {
        ssd = newSsd;
    }

    public Computer(int newSsd, int newRam) {
        ssd = newSsd;
        ram = newRam;
    }

    void load() {
        System.out.println("Я зогружен");
    }

    public void printState(){
        System.out.println("RAM: " + this.ram);
        System.out.println("SSD: " + this.ssd);
        System.out.println();
    }
}
