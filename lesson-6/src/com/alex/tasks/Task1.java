package com.alex.tasks;

/*/
1. факториал
 */
public class Task1 {
    public static void main(String[] args) {
        int value = 6;
        int result = FactorialWhile(value);
        System.out.println(result);
    }

    public static int FactorialWhile(int value) {
        int result =1;
        int i =1;
        while (i <= value ){
            result *= i;
            i++;
        }
        return result;
    }

    public static int Factorial(int value) {
        int result = 1;
        for (int i = 1; i <= value; i++) {
            result *= i;
        }
        return result;
    }
}
