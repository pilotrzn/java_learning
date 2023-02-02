package com.alex.lesson5;

public class Task1 {
    public static void main(String[] args) {
     int value1 =5;
     int value2 =  10;
     int result = getMax(value1,value2);
     System.out.println(result);
    }

    public static int getMax(int val1,int val2) {
        if (val1 > val2) {
            return val1;
        }
        return val2;
    }
}
