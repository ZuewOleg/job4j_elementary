package ru.job4j.array;

public class ArrayChar {
    public static boolean startsWith(char[] word, char[] pref) {
        boolean result = true;
        for (int i = 0; i < pref.length - 1; i++) {
            for (int j = 0; j < word.length - 3; j++) {
                if (pref[i++] != word[j]) {
                    result = false;
                }

            }
        }
        return result;
    }
}
