package ru.job4j.array;

public class Merge {
    public static int[] merge(int[] left, int[] right) {
        int[] rsl = new int[left.length + right.length];
        int a = 0; /* счетчик */
        for (int i = 0; i < left.length; i++) {
            rsl[i] = left[i];
            a++;
        }
            for (int j = 0; j < right.length; j++) {
                rsl[a++] = right[j];
            }
            for (int i = 0; i < rsl.length - 1; i++) {
                if (rsl[i + 1] < rsl[i]) {
                    int tmp = rsl[i];
                    rsl[i] = rsl[i + 1];
                    rsl[i + 1] = tmp;
                }
            }
            return rsl;
        }
}
