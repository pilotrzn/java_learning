package com.alex.lesson4;

public class SwitchExample {
    public static void main(String[] args) {
        int value = 2;
        switch (value) {
            case 1 -> System.out.println("value == 1");
            case 2 -> System.out.println("value == 2");
            case 10 -> System.out.println("value == 10");
            default -> System.out.println("Нет совпадений");
        }
        int value2 = 10;
        switch (value2){
            case 1 -> System.out.println("равно 1");
            case 2,3,4 -> System.out.println(" 2,3,4");
            case 10 -> System.out.println("равно 10");
            default -> System.out.println("нет свопадениев");
        }
    }
}
