package ru.job4j.condition;

import org.junit.Test;

import org.junit.Assert;

public class SqAreaTest {

    @Test
    public void whenP3K6Then0() {
    int expected = 0;
    int p = 3;
    int k = 6;
    double out = SqArea.square(p,k);
    Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenP9K1Then4() {
        double expected = 4;
        int p = 9;
        int k = 1;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenP16K3Then12() {
        double expected = 12;
        int p = 16;
        int k = 3;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }
}