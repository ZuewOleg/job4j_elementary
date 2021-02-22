package ru.job4j.condition;

public class Game2 {
    public static double checkGame(double percent, int prize, int pay) {
        double win = percent * prize;
        double result = win - pay;
        if (win > pay) {
            result = win - pay;
        } else {
            result = 0;
        }
        return result;
    }
    public static void main(String[] args) {
        double result = Game2.checkGame(0.9, 1, 2);
        System.out.println(result);
        }
}
