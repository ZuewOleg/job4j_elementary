package ru.job4j.array;

public class ArrayChar {
    public static boolean startsWith(char[] word, char[] pref) {
        boolean result = true;
        for (int i = 0; i < pref.length - 1; i++) {
            for (int j = 0; j < word.length - 1; j++) {
                if (word[0] != pref[0]) {
                    result = false;
                }
                if (word[1] != pref[1]) {
                    result = false;
                }
            }
        }
        return result;
    }
}
