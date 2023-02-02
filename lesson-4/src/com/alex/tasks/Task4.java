package com.alex.tasks;

public class Task4 {
    public static void main(String[] args) {
        int year = 2000;
        isLeapYear(year);
    }
    public static boolean isLeapYear(int year){
        return year % 400 == 0 || (year % 4 == 0 && year % 100 != 0);
    }
}
