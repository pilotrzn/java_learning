package com.alex.incapsulation.task;

public class OopLessonRunner {

    public static void main(String[] args) {
        Computer laptop = new Laptop(new Ram(4096), new SSD(512), 2);
        Computer mobile = new Mobile(new Ram(2048), new SSD(256));
        loadComputers(laptop, mobile);
        printInfo(new Computer[]{laptop, mobile});
    }

    public static  void printInfo(Computer[] computers){
        for (Computer computer : computers) {
            computer.print();
        }
    }
    public static void loadComputers(Computer... computers) {
        for (Computer computer : computers) {
            computer.load();
            System.out.println();
        }
    }
}
