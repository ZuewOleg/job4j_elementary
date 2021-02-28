package ru.job4j.exercises.cycles;

public class PairsCharString {
    public static boolean check(String l, String r) {
        String[] strL = l.split("");
        String[] strR = r.split("");
        if (l == null && r == null) {
            return true;
        } else if (strL[0].equals(strR[strR.length - 1]) && strL[strL.length - 1].equals(strR[0])) {
            return true;
        }
        return false;
    }
}
