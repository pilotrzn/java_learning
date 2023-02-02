package com.alex.tasks;

/**
 * сумма цифр числа
 */

public class Task2 {
    public static void main(String[] args) {
        int value = 124675;
        System.out.println(sum(value));
        System.out.println(sumfor(value));
    }

    public static int sum(int value) {
        int result = 0;
        int curvalue = value;
        while (curvalue != 0) {
            result += curvalue % 10;
            curvalue /= 10;
        }
        return result;
    }

    public static int sumfor(int value) {
        int result = 0;
        for (int curvalue = value; curvalue != 0 ; curvalue /=10) {
            result += curvalue %10;
        }
        return result;
    }
}

