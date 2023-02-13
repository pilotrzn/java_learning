package com.alex.strings.task;
import java.util.Objects;

public class Task1 {
    public static void main(String[] args) {
        String str = "saD3d rrrrrRRRRt11R Qq3Q    R333vDcsX";
        System.out.println(format(str));
    }

    public static String format(String value) {
        if (Objects.equals(value, "")) {
            return "Строка не задана";
        }
        String caseValue = value.toLowerCase();
        String prevSymbol = caseValue.substring(0, 1);
        StringBuilder result = new StringBuilder().append(!Objects.equals(prevSymbol," ")? prevSymbol:"");
        for (int i = 1; i < caseValue.length(); i++) {
            String symbol = caseValue.substring(i, i + 1);

            if (!Objects.equals(prevSymbol,symbol) && !Objects.equals(symbol," ")) {
                result.append(symbol);
                prevSymbol = symbol;
            }
        }
        return result.toString().toUpperCase();
    }
}
