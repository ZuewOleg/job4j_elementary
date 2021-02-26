package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class TurnTest {
    @Test
    public void whenTurnArrayWithEvenAmountOfElementsThenTurnedArray() {
        int[] input = new int[]{4, 1, 6, 2};
        int[] result = Turn.back(input);
        int[] expect = new int[]{2, 6, 1, 4};
        assertThat(result, is(expect));
    }

    @Test
    public void whenTurnArrayWithOddNumber5OfElementsThenTurnedArray() {
        int[] input = new int[]{4, 1, 5, 2, 3};
        int[] result = Turn.back(input);
        int[] expect = new int[]{3, 2, 5, 1, 4};
        assertThat(result, is(expect));
    }

    @Test
    public void whenTurnArrayWithOddNumber9OfElementsThenTurnedArray() {
        int[] input = new int[]{4, 1, 5, 2, 3, 7, 8, 9, 6};
        int[] result = Turn.back(input);
        int[] expect = new int[]{6, 9, 8, 7, 3, 2, 5, 1, 4};
        assertThat(result, is(expect));
    }

    @Test
    public void whenTurnArrayWithEvenAmount6OfElementsThenTurnedArray() {
        int[] input = new int[]{8, 2, 1, 4, 6, 9};
        int[] result = Turn.back(input);
        int[] expect = new int[]{9, 6, 4, 1, 2, 8};
        assertThat(result, is(expect));
    }
}