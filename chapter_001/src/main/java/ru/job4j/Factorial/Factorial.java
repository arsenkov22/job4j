package ru.job4j.Factorial;

public class Factorial {
    public static int factorial (int x) {
        int fact = 1;
        if (x < 0) throw new IllegalArgumentException("x должен быть >=0);// обработка исключительной ситуации");
        for (int i = 2; i <= x; i++) {
            fact = fact * i;
        }
        return fact;
        }
}
