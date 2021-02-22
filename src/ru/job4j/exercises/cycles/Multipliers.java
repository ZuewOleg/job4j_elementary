package ru.job4j.exercises.cycles;

public class Multipliers {
    public static void out(int n) {
        for (int i = 1; i <= n; i++) {
            if ((n % i == 0) || (n % i == n)) {
                System.out.println(i);
            }
        }
    }
}
