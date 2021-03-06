package ru.job4j.calculator;

import org.junit.Test;

import org.junit.Assert;

public class FitTest {

    @Test
    public void whenMan180Then92() {
        short in = 180;
        double expected = 92;
        double out = Fit.manWeight(in);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenMan170Then80() {
        short in = 176;
        double expected = 87.39;
        double out = Fit.manWeight(in);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenWoman165Then63() {
        short in = 165;
        double expected = 63.24;
        double out = Fit.womanWeight(in);
        Assert.assertEquals(expected, out, 0.01);
    }
}