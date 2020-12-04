package ru.job4j.loop;

public class Counter {
    public static int sum(int start, int finish) {
        int sum = 0;
        for (int a = start; a <= finish; a++) {
            sum = sum + a;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(sum(5, 7));
        System.out.println(sum(1, 12));
        System.out.println(sum(0, 3));
    }

}
