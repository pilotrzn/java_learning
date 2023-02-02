package com.alex.tasks;

/**
 * d 1626 году индейцы продали манхеттен за 24доллера
 * найти сумму получившуюуся бы в этом году, если бы индейцы положили
 * деньги в банк под 5 %
 */

public class Task3 {
    public static void main(String[] args) {
        System.out.println(sum(24 ));
    }

    public static double sum(double srcsum){
        double result = srcsum;
        for (int year = 1626 + 1; year <= 2022 ; year++) {
            double percent = result * 0.05;
            result += percent;
            System.out.println(year + ":" + result);
        }
        return result;
    }
}
