package ru.job4j.exercises.cycles;

public class SecondSum {
    public static int sum(int a, int b) {
        int rsl = 0;
        for (int i = a; i <= b; i++) {
            if (i % 2 != 0) {
                rsl = rsl + i;
            }
        }
        return rsl;
    }
}
