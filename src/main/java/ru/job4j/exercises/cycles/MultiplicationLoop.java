package ru.job4j.exercises.cycles;

public class MultiplicationLoop {
    public static int mult(int a, int b) {
        int rsl = 0;
        for (int index = a; index <= b - 1; index++) {
            if (a < b) {
                rsl = a * index * b;
            }
        }
        return rsl;
    }
}
