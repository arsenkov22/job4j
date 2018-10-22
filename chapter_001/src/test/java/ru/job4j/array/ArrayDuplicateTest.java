package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class ArrayDuplicateTest {
    @Test
    public void whenTest() {
        ArrayDuplicate ad = new ArrayDuplicate();
        String[] input = {"один", "два", "три", "три", "один", "два", "пять", "six"};
        String[] expect = {"один", "два", "три", "пять", "six"};
        String[] res = ad.remove(input);
        assertThat(res, is(expect));
    }
}
