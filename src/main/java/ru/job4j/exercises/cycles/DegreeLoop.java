package ru.job4j.exercises.cycles;

public class DegreeLoop {
    public static int calculate(int a, int n) {
        int degree = 1;
        for (int i = 1; i <= n; i++) {
            degree = degree * a;
        }
        return degree;
    }
}
