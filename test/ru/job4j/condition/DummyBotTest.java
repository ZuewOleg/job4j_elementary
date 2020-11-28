package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class DummyBotTest {

    @Test
    public void whenGreetBot1() {
        assertThat(
                DummyBot.answer("Привет, Бот."),
                is("Привет, умник.")
        );
    }

    @Test
    public void whenByeBot2() {
        assertThat(
                DummyBot.answer("Пока."),
                is("До скорой встречи.")
        );
    }

    @Test
    public void whenUnknownBot3() {
        assertThat(
                DummyBot.answer("Как дела?"),
                is("Это ставит меня в тупик. Задайте другой вопрос.")
        );
    }
}