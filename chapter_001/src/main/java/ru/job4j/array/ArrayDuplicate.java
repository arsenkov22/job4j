package ru.job4j.array;

import java.util.Arrays;

public class ArrayDuplicate {
    public String[] remove(String[] array) {
        int uniqum = array.length;
        for (int i = 0; i < uniqum; i++) {
            for (int j = i + 1; j < uniqum; j++) {
                if (array[i].equals(array[j])) {
                    array[j] = array[uniqum - 1];
                    uniqum--;
                    j--;
                }

            }
        }
        return Arrays.copyOf(array, uniqum);
    }
}
