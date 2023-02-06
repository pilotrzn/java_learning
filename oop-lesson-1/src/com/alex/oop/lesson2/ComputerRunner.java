package com.alex.oop.lesson2;

public class ComputerRunner {

    public static void main(String[] args) {
        Computer computer = new Computer();
        computer.printState();

        Computer computer1 = new Computer(512);
        computer1.printState();;

        Computer computer2 = new Computer(1024, 10000 );
        computer2.printState();;

 
    }
}
