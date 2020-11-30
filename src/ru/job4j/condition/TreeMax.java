package ru.job4j.condition;

public class TreeMax {
    public static int max(int first, int second, int third) {
        int result = first;
        if (first >= second && first >= third) {
            result = first;
        }
        if (second >= first && second >= third) {
            result = second;
        }
        if (third >= first && third >= second) {
            result = third;
        }
        return result;
    }
    public static void main(String[] args) {
        int result = TreeMax.max(4, 6, 4);
        System.out.println(result);
    }
}
