package ru.job4j.exercises.arrays;

public class MaxFirstOrLastElement {
    public static int getMaxValue(int[] array) {
        int rsl = 0;
        if (array[0] > array[array.length - 1]) {
            rsl = array[0];
        } else {
            rsl = array[array.length - 1];
        }
        return rsl;
    }
}
