package com.alex.tasks;

/**
 * простое ли число
 */

public class Task4 {
    public static void main(String[] args) {
        int value = 12;
        boolean result = isSimple(value);
        System.out.println(result);
    }

    public static boolean isSimple(int value){
        for (int i = 2; i < value; i++) {
            System.out.println(value % i);
            if (value % i == 0) {
                return false;
            }
        }
        return true;
    }
}
