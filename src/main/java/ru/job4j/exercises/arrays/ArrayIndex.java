package ru.job4j.exercises.arrays;

public class ArrayIndex {
    public static int getFirstElement(int[] array) {
        int rsl = array[0];
        return rsl;
    }

    public static int getLastElement(int[] array) {
        int rsl = array[array.length - 1];
        return rsl;
    }
}
