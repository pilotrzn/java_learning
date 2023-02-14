package com.alex.incapsulation.task;

public class OopLessonRunner2 {

    public static void main(String[] args) {
        Computer laptop = new Laptop(new Ram(4096), new SSD(256), 2);
        Computer laptop2 = new Laptop(new Ram(8000), new SSD(512), 2);
        print(laptop,laptop2);
    }

    public static void print(Printable... objects) {
        for (Printable object : objects) {

        }
    }

    ;
}
