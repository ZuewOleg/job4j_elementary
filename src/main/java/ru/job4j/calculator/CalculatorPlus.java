package ru.job4j.calculator;

public class CalculatorPlus {
    public static void plus(int first, int second) {
        int result = first + second;
        System.out.println(result);
    }

    public static void main(String[] args) {
        CalculatorPlus.plus(100, 500);
        CalculatorPlus.plus(4, 2);
        CalculatorPlus.plus(3, 5);
    }
}
