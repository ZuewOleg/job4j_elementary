package ru.job4j.oop;

public class DummyDic {

    public String engToRus(String eng) {
        eng = "LOL";
        return eng;
    }

    public static void main(String[] args) {
        DummyDic words = new DummyDic();
        String eng = words.engToRus("");
        System.out.println("Неизвестное слово " + eng);
    }
}
