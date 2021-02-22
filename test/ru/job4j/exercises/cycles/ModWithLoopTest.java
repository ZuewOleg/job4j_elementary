package ru.job4j.exercises.cycles;

import org.junit.Test;

import static org.junit.Assert.*;

public class ModWithLoopTest {

    @Test
    public void when4to2that0() {
        assertEquals(0, ModWithLoop.mod(4, 2));
    }

    @Test
    public void when3to2that1() {
        assertEquals(1, ModWithLoop.mod(3, 2));
    }

    @Test
    public void when8to2that3() {
        assertEquals(2, ModWithLoop.mod(8, 3));
    }

    @Test
    public void when0to3that0() {
        assertEquals(0, ModWithLoop.mod(0, 3));
    }
}