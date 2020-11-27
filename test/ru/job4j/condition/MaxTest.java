package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MaxTest {

    @Test
    public void thenMax33To27Then33() {
        int result = Max.max(33, 27);
        assertThat(result, is(33));
    }

    @Test
    public void thenMax5To5Then5() {
        int result = Max.max(5, 5);
        assertThat(result, is(5));
    }

    @Test
    public void thenMax0To14Then14() {
        int result = Max.max(0, 14);
        assertThat(result, is(14));
    }
}