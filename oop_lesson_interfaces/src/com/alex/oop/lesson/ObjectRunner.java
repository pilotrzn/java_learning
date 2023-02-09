package com.alex.oop.lesson;

public class ObjectRunner {
    public static void main(String[] args) {

    }
    public static void print(Printable... objects){
        for (Printable object : objects) {
            object.print();
        }
    }
}
