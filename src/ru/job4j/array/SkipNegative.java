package ru.job4j.array;

public class SkipNegative {
    public static int[][] skip(int[][] array) {
        for (int row = 0; row < array.length; row++) {
            for (int cell = 0; cell < array.length; cell++) {
                int i = array[row][cell];
                if (i < 0) {
                    array[row][cell] = 0;
                }
            }
        }
        return array;
    }
}
