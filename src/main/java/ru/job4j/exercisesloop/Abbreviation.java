package ru.job4j.exercisesloop;

public class Abbreviation {
    public static String collect(String s) {
        String rsl = "";
        String[] array = s.split(" ");
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < array.length; i++) {
            sb.append(array[i].charAt(0));
            rsl = sb.toString();
        }
        return rsl;
    }
}
