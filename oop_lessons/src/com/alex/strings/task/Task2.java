package com.alex.strings.task;

/**
 * Дана строка с текстом, в котором есть цифры от 0 до 9.
 * <p>
 * Написать 2 метода:
 * <p>
 * - возвращающий массив цифр из переданной строки
 * - возвращающий сумму цифр из переданного целочисленного массива
 * <p>
 * Посчитать сумму всех чисел из строки
 * <p>
 * Например:
 * “Привет 8, как 1 2 твои дела? Может4, сделать 3 дело?” -> 18 (8+1+2+4+3)
 */

public class Task2 {
    public static void main(String[] args) {
        String str = "saD3d rt11R Q1q3Q R333v5Dcs09X";
        System.out.println(sumArray(numbers(str)));
    }


    public static int[] numbers(String value) {
//        resultarraysize
        int arrSize = 0;
        for (int i = 0; i < value.length(); i++) {
            arrSize += (isNumber(value.substring(i, i + 1))) ? 1 : 0;
        }
        int[] result = new int[arrSize];
        String symbol;
        int counter = 0;
        for (int i = 0; i < value.length(); i++) {
            symbol = value.substring(i, i + 1);
            if (isNumber(symbol)) {
                result[counter] = Integer.parseInt(symbol);
                counter++;
            }
        }
        return result;
    }

    public static boolean isNumber(String value) {
        return Character.isDigit(value.charAt(0));
    }


    public static int sumArray(int[] intArr) {
        int result = 0;
        for (int x : intArr) {
            result += x;
        }
        return result;
    }
}
