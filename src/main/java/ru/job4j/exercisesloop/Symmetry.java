package ru.job4j.exercisesloop;

public class Symmetry {
    public static boolean check(int i) {
        boolean rsl = false;
        String str = Integer.toString(i);
        for (int a = 0; a < str.length() / 2; a++) {
            for (int b = str.length() - 1; b > str.length() / 2; b--) {
                if (str.charAt(a) == str.charAt(b)) {
                    rsl = true;
                } else {
                    rsl = false;
                }
            }
        }
        return rsl;
    }
}
