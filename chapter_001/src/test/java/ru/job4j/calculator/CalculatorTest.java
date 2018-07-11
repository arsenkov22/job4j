package ru.job4j.calculator;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class CalculatorTest {
    @Test
    public void whenAddOnePlusOneThenTwo() {
        Calculator calc = new Calculator();
        calc.add(1D, 1D);
        double result = calc.getResult();
        double expected = 2D;
        assertThat(result, is(expected));
    }
    @Test
    public void whenMultyTwoAndThreeThenSix() {
        Calculator calculator = new Calculator();
        calculator.multiply(2D, 3D);
        double res = calculator.getResult();
        double expected = 6D;
        assertThat(res, is(expected));
    }
    @Test
    public void whenSubtractionSixAndTwoThenFour() {
        Calculator calculator = new Calculator();
        calculator.subtraction(6D, 2D);
        double res = calculator.getResult();
        double expected = 4D;
        assertThat(res, is(expected));
    }
    @Test
    public void whenDivisionSixAndTwoThenThree() {
        Calculator calculator = new Calculator();
        calculator.division(6D, 2D);
        double res = calculator.getResult();
        double expected = 3D;
        assertThat(res, is(expected));
    }
}