package ru.job4j.converter;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class ConverterTest {
    @Test
    public void when60RubleToDollarThen1() {
        Converter converter = new Converter();
        int result = converter.rubleToDollar(60);
        int expected = 1;
        assertThat(result, is(expected));
    }
    @Test
    public void when360RubleToDollarThen6() {
        Converter converter = new Converter();
        int result = converter.rubleToDollar(360);
        int expected = 6;
        assertThat(result, is(expected));
    }
    @Test
    public void when2DollarToRubThen120() {
        Converter converter = new Converter();
        int result = converter.dollarToRub(2);
        int expected = 120;
        assertThat(result, is(expected));
    }
    @Test
    public void when70RubleToEuroThen1() {
        Converter converter = new Converter();
        int result = converter.rubleToEuro(70);
        assertThat(result, is(1));
    }
    @Test
    public void when140RubleToEuroThen2() {
        Converter converter = new Converter();
        int result = converter.rubleToEuro(140);
        assertThat(result, is(2));
    }
    @Test
    public void when4EuroToRubThen280() {
        Converter converter = new Converter();
        int result = converter.euroToRub(4);
        assertThat(result, is(280));
    }
}