package com.alex.task;

/**
 * 2. Написать программу, заносящую в массив первые 100 целых чисел, делящихся на 13 или на 17, и печатающую его.
 */

public class Task2 {
    public static void main(String[] args) {
        int[] values =  new int[100];
        fillArray(values);
        Task1.printArrayForEach(values);
    }
    
    public static void fillArray(int[] values) {
        //int currentIndex = 0;
        for (int currentvalue = 1, currentIndex = 0; currentIndex < values.length; currentvalue++) {
            if (currentvalue % 13 ==0 || currentvalue % 17 == 0) {
                values[currentIndex++] = currentvalue;
                //currentIndex++;
            }
        }
    }

}
