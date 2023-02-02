package com.alex.task;

import java.util.concurrent.ForkJoinPool;

/**
 * 3. Написать метод equals, который определяет, равны ли между собой соответствующие элементы 
 *    2-х двумерных массивов.
 */

public class Task3 {
    public static void main(String[] args) {
        int [][] values1 = {
            {1,2,3},
            {5,7,8},
            {3,5}
        };
        int [][] values2 = {
            {1,2,3},
            {5,7,8},
            {3,5}
        }; 
       System.out.println(equals(values1, values2));
    }
    
    public static boolean equals(int[][] value1, int[][] value2) {
        if (value1.length != value2.length) {
            return false;
        }
        for (int i = 0; i < value1.length; i++) {
            int[] row1 = value1[i];
            int[] row2 = value2[i];
            if (row1.length != row2.length) {
                return false;
            } 
            for (int j = 0; j < row1.length; j++) {
                if (row1[j] != row2[j]) {
                    return false;
                }                
            }
        }
        return true;
    }
}
