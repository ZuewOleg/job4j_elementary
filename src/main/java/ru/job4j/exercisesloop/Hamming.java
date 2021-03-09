package ru.job4j.exercisesloop;

public class Hamming {
    public static int checkStrings(String left, String right) {
        int rsl = 0;
        for (int l = 0; l < left.length(); l++) {
                if (left.charAt(l) != right.charAt(l)) {
                    rsl++;
                }
        }
        return rsl;
    }
}
