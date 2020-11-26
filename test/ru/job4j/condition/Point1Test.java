package ru.job4j.condition;

import org.junit.Test;

import org.junit.Assert;

public class Point1Test {

    @Test
    public void when00to20then2() {
        int expected = 2;
        int x1 = 0;
        int y1 = 0;
        int x2 = 2;
        int y2 = 0;
        double out = Point1.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when10to01then1() {
        double expected = 1.41;
        int x1 = 1;
        int y1 = 2;
        int x2 = 0;
        int y2 = 1;
        double out = Point1.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when23to14then3() {
        double expected = 3.16;
        int x1 = 2;
        int y1 = 1;
        int x2 = 3;
        int y2 = 4;
        double out = Point1.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when18to26then8() {
        double expected = 8.06;
        int x1 = 1;
        int y1 = 2;
        int x2 = 8;
        int y2 = 6;
        double out = Point1.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }
}