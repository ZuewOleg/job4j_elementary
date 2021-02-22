package ru.job4j.exercisesloop;

public class ArithmeticActions {
    public static String selectAction(int left, int right, int rsl) {
        int sum = left + right;
        int difference = left - right;
        int multiplication = left * right;
        int division = left / right;
        if (sum == rsl) {
            return "added";
        } else if (difference == rsl) {
            return "subtracted";
        } else if (multiplication == rsl) {
            return "multiplied";
        } else if (division == rsl) {
            return "divided";
        } else {
            return "none";
        }
    }
}
