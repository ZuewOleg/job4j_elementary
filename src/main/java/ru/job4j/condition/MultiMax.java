package ru.job4j.condition;

public class MultiMax {
    public static int max(int first, int second, int third) {
        int a = first > second ? first : second;
        int result = a > third ? a : third;
        return result;
    }

    public static void main(String[] args) {
        int result = MultiMax.max(-4, -6, 0);
        System.out.println(result);
    }
}
