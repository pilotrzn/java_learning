package com.alex.oop.hw.Task1;

import java.util.Objects;

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
        System.out.println(format(str));
    }

    public static String format(String value) {
        if (Objects.equals(value, "")) {
            return "Строка не задана";
        }
        char[] str = value.toLowerCase().toCharArray();
        char current = str[0];
        StringBuilder result = new StringBuilder().append(current);
        for (int i = 1; i < str.length; i++) {
            if (current != str[i] && str[i] != ' ') {
                result.append(str[i]);
                current = str[i];
            }
        }
        return result.toString().toUpperCase();
    }
}
