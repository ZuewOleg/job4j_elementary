package ru.job4j.condition;

public class DummyBot {
    public static String answer(String question) {
        String rsl = "Это ставит меня в тупик. Задайте другой вопрос.";
        if ("Привет, Бот.".equals(question)) {
            rsl = "Привет, умник.";
        }
        if ("Пока.".equals(question)) {
            rsl = "До скорой встречи";
        } else if ("".equals(question)) {
            rsl = "Это ставит меня в тупик. Задайте другой вопрос.";
        }
        return rsl;
    }

    public static void main(String[] args) {
        String rsl = DummyBot.answer("Привет, Бот.");
        System.out.println(rsl);
        rsl = DummyBot.answer("Пока.");
        System.out.println(rsl);
        rsl = DummyBot.answer("как дела?");
        System.out.println(rsl);
    }
}
