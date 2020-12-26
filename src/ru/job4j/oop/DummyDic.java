package ru.job4j.oop;

public class DummyDic {

    public String engToRus(String eng) {
        System.out.println("Неизвестное слово. " + eng);
        return eng;
    }

    public static void main(String[] args) {
        DummyDic words = new DummyDic();
        String says = words.engToRus("Bird");

    }
}
