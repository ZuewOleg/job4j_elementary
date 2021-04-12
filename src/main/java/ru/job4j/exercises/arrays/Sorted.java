package ru.job4j.exercises.arrays;

public class Sorted {
    public static boolean isSorted(int[] array) {
        boolean rsl = false;
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] < array[j]) {
                    rsl = true;
                } else {
                    rsl = false;
                    break;
                }
            }
        }
        return rsl;
    }
}
