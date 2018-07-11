package ru.job4j.converter;

/**
 * Корвертор валюты.
 */
public class Converter {
    int euro = 70;
    int dollar = 60;

    /**
     * Конвертируем рубли в евро.
     * @param rub рубли.
     * @return Евро.
     */
    public int rubleToEuro(int rub) {
        return rub / euro;
    }
    public int euroToRub(int euro) {
        return euro * this.euro;
    }

    /**
     * Конвертируем рубли в доллары.
     * @param rub рубли.
     * @return Доллары
     */
    public int rubleToDollar(int rub) {
        return rub / dollar;
    }
    public int dollarToRub(int dollar) {
        return dollar * this.dollar;
    }
}