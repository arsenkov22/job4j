package ru.job4j.array;

public class Square {
    public int[] calculate(int bound) {
        int[] rst = new int[bound];
        for (int i = 1; i <= rst.length; i++) {
            rst[i - 1] = i * i;
        }
        // заполнить массив через цикл элементами от 1 до bound возведенными в квадрат
        return rst;
    }
}