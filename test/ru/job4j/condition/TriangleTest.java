package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class TriangleTest {

    @Test
    public void exist() {
        boolean result1 = Triangle.exist(2.0, 2.0, 2.0);
        assertThat(result1, is(true));
        boolean result2 = Triangle.exist(3.0, 1.0, 5.0);
        assertThat(result2, is(false));
    }
}