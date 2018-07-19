package ru.job4j.condition;

import org.junit.Test;

import static org.hamcrest.number.IsCloseTo.closeTo;
import static org.junit.Assert.assertThat;

public class PointTest {

    @Test
    public void whenDistancePoint() {
        Point a = new Point(0, 1);
        Point b = new Point(0, 2);
        double distance = a.distanceTo(b);
        assertThat(distance, closeTo(1, 0.1));
    }
}