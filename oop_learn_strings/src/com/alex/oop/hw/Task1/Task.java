package com.alex.oop.hw.Task1;

/**
 * Дана строка.
 * Удалить из нее все повторяющиеся символы без учета регистра, если они идут друг за другом. Также удалить пробелы.
 * Результат привести к верхнему регистру.
 * <p>
 * Например:
 * "abc Cpddd Dio OsfWw" -> "ABCPDIOSFW"
 */
public class Task {
    public static void main(String[] args) {
        String str = "saDd rtR QqQ R333vDcsX";
        format(str);
    }

    public static String format(String value) {
        StringBuilder result = new StringBuilder();
        
        char[] str = value.toLowerCase().toCharArray();
        for (int i = 1; i < str.length; i++) {

        }
        return null;
    }
}
