package ru.job4j.condition;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class Game2Test {

    @Test
    public void checkGame() {
        double rsl = Game2.checkGame(0.2, 50, 9);
        assertThat(rsl, is(1.0));
    }

    @Test
    public void checkGameIs0() {
        double rsl = Game2.checkGame(0.9, 1, 2);
        assertThat(rsl, is(0.0));
    }
}