package ru.job4j.array;

public class FindLoop {
    public int indexOf(int[] data, int el) {
        int rst = -1; // если элемента нет в массиве, то возвращаем -1.
        for (int j = 0; j < data.length; j++) {
            if (data[j] == el) {
                rst = j;
                break;
            }
        }
        return rst;
    }
}
