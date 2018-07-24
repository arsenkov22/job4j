package ru.job4j.max;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
public class MaxTest {
    @Test
    public void whenFirstLessSecond() {
        Max maxim = new Max();
        int result = maxim.max(1, 2, 3);
        assertThat(result, is(3));
    }

    @Test
    public void whenFiveMoreThree() {
        Max maxim = new Max();
        int result = maxim.max(5, 3, 1);
        assertThat(result, is(5));
    }
}
