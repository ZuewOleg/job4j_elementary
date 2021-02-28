package ru.job4j.exercises.cycles;

public class AttackRook {
    public static boolean check(String left, String right) {
        String[] strLeft = left.split("");
        String[] strRight = right.split("");
        if (strLeft[0].equals(strRight[0]) || strLeft[1].equals(strRight[1])) {
            return true;
        }
        return false;
    }
}
