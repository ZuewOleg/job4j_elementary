package ru.job4j.exercisesloop;

public class BonusCupCoffee {
    public static int countCup(int count, int n) {
        int rsl = 0;
        int bonus = 0;
        if (count > n) {
            bonus = count / n;
            rsl = count + bonus;
        }
        return rsl;
    }
}
