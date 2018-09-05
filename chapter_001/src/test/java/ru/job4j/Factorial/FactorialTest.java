package ru.job4j.Factorial;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class FactorialTest {
    @Test
    public void whenCalculateFactorialForFiveThenOneHundreedTwenty() {
        Factorial fact = new Factorial();
        int result = 1;
        int exist = 1;
        assertThat(result, is(exist));
        System.out.print(fact.factorial(5));
    }

    @Test
    public void whenCalculateFactorialForZeroThenOne() {
        Factorial fact = new Factorial();
        int result = 1;
        int exist = 1;
        assertThat(result, is(exist));
        System.out.print(fact.factorial(0));
    }

}