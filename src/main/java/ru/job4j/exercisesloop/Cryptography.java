package ru.job4j.exercisesloop;

import org.w3c.dom.ls.LSOutput;

public class Cryptography {
    public static String code(String s) {
        String rsl = s;
        if (s.length() == 0) {
            rsl = "empty";
        } else if (s.length() <= 4) {
            rsl = s;
        }
        if (s.length() > 4) {
            StringBuilder str = new StringBuilder(s);
            for (int i = 0; i < s.length() - 4; i++) {
                str.setCharAt(i, '#');
                rsl = str.toString();
            }

        }
        return rsl;
    }
}
