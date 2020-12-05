package ru.job4j.loop;

public class Mortgage {
    public static int year(int amount, int salary, double percent) {
        int year = 0;
        double credit = amount;
        while (credit >= 0) {
            credit = credit + (credit * (percent / 100));
            credit -= salary;
            year++;
        }
        return year;
    }
}
