package ru.job4j.exercises.cycles;

import org.junit.Test;

import static org.junit.Assert.*;

public class OddCountTest {

    @Test
    public void test1() {
        assertEquals(1, OddCount.count(1, 2));
    }

    @Test
    public void test2() {
        assertEquals(2, OddCount.count(1, 3));
    }

    @Test
    public void test3() {
        assertEquals(2, OddCount.count(1, 4));
    }

    @Test
    public void test4() {
        assertEquals(3, OddCount.count(1, 5));
    }
}