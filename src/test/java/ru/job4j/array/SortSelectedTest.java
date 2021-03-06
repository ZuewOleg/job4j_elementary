package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class SortSelectedTest {
    @Test
    public void whenSort() {
        int[] input = new int[] {3, 4, 1, 2, 5};
        int[] result = SortSelected.sort(input);
        int[] expect = new int[] {1, 2, 3, 4, 5};
        assertThat(result, is(expect));
    }

    @Test
    public void whenSort2Second() {
        int[] input = new int[] {2, 4, 1, 3, 5};
        int[] result = SortSelected.sort(input);
        int[] expect = new int[] {1, 2, 3, 4, 5};
        assertThat(result, is(expect));
    }

    @Test
    public void whenSortThird() {
        int[] input = new int[] {2, 1, 3};
        int[] result = SortSelected.sort(input);
        int[] expect = new int[] {1, 2, 3};
        assertThat(result, is(expect));
    }

    @Test
    public void whenSortFourth() {
        int[] input = new int[] {3, 1, 2, 4};
        int[] result = SortSelected.sort(input);
        int[] expect = new int[] {1, 2, 3, 4};
        assertThat(result, is(expect));
    }
}