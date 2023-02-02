package com.alex.lesson6;

public class WhileExample {
    public static void main(String[] args) {
        int value = 0;
        do{
            //System.out.println(value);
            whileExample(value);
            value++;
        } while (value < 10);

        //whileExample();
    }

    private static void whileExample(int value) {
        while (value > 0) {
            System.out.println(value);
            value--;
        }
    }


}
