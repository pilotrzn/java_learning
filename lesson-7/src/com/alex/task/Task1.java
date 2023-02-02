package com.alex.task;

/**
 * 1. Написать программу, которая печатает массив сначала в обычном порядке,
 * затем в обратном.
 */

public class Task1 {
    public static void main(String[] args) {
        int[] values = { 4, 67, 2, 1, 5, 8, 0, 5, 2, 4, 65 };
        printArray(values);
        printArrayForEach(values);
        printArrayRev(values);
    }

    public static void printArrayRev(int[] value) {
        for (int i = value.length - 1; i >= 0; i--) {
            System.out.print(value[i] + " ");
        }
        System.out.println();
    }

    public static void printArray(int[] values) {
        for (int i = 0; i < values.length; i++) {
            System.out.print(values[i] + " ");
        }
        System.out.println();
    }

    public static void printArrayForEach(int[] values) {
        for (int value : values) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}
