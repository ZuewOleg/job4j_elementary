package ru.job4j.exercises.cycles;

public class ModWithLoop {
    public static int mod(int n, int d) {
        int rsl = n;
        while (rsl >= d) {
            rsl = rsl - d;
        }
        return rsl;
    }
}
