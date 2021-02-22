package ru.job4j.exercises.cycles;

import org.junit.Test;

import static org.junit.Assert.*;

public class MultiplicationLoopTest {

    @Test
    public void when0to2that0() {
        assertEquals(0, MultiplicationLoop.mult(0, 2));
    }

    @Test
    public void when1to2that2() {
        assertEquals(2, MultiplicationLoop.mult(1, 2));
    }

    @Test
    public void when1to3that6() {
        assertEquals(6, MultiplicationLoop.mult(1, 3));
    }

}