package ru.job4j.array;

public class EqLast {
    public static boolean check(int[] left, int[] right) {
        for (int l = 0; l < left.length - 1; l++) {
            for (int r = 0; r < right.length - 1; r++) {
                if (left[left.length - 1] == right[right.length - 1]) {
                    return true;
                }
            }
        }
        return false;
    }
}
