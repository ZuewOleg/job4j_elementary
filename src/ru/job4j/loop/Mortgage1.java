package ru.job4j.loop;

public class Mortgage1 {
    public static int year(int amount, int salary, double percent) {
        int year = 0;
        double a = percent / 100;
        double proc = amount * a;
        double credit = amount + proc;
        while (credit >= 0) {
            double first = credit - salary;
            credit = (first * a) + first;
            year++;
        }
        return year;
    }
}
