package ru.job4j.array;

public class Merge {
    public static int[] merge(int[] left, int[] right) {
        int[] rsl = new int[left.length + right.length];
        int i = 0, j = 0, r = 0; /* счетчики */
        while (i < left.length && j < right.length) {
            if (left[i] <= right[j]) {
                rsl[r] = left[i];
                i++;
            } else {
                rsl[r] = right[j];
                j++;
            }
            r++;
            }
        while (i < left.length) {
            rsl[r] = left[i];
            i++;
            r++;
        }
        while (j < right.length) {
            rsl[r] = right[j];
            j++;
            r++;
        }
            return rsl;
        }
}
