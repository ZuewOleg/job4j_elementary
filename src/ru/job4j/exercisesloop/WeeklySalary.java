package ru.job4j.exercisesloop;

public class WeeklySalary {
    public static int calculate(int[] hours) {
        int rsl = 0;
        int rslNorm = 0;
        int rslOvertime = 0;
        int rslNormV = 0;
        int rslOvertimeV = 0;
        for (int i = 0; i < hours.length; i++) {
                if (hours[i] <= 8 && i <= 4) {
                    rslNorm += hours[i] * 10;
                } else if (hours[i] > 8 && i <= 4) {
                    int bonus = hours[i] - 8;
                    rslOvertime += ((hours[i] - bonus) * 10) + (bonus * 15);
            }
                if (hours[i] <= 8 && i > 4) {
                    rslNormV += hours[i] * 10 * 2;
                }
                if (hours[i] > 8 && i > 4) {
                    int bonus = hours[i] - 8;
                    rslOvertimeV += ((hours[i] - bonus) * (10 * 2) + (bonus * (15 * 2)));
                }
                rsl = rslNorm + rslOvertime + rslNormV + rslOvertimeV;
        }
        return rsl;
    }
}
