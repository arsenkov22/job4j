package ru.job4j.array;

public class MatrixCheck {
    public boolean mono(boolean[][] data) {
        boolean result = true;
        int index = data.length;
        for (int i = 0; i < index; i++) {
            if (!(data[i][i] == data[index - 1][index - 1]) || !(data[index - i - 1][i] == data[0][index - 1]))  {
                result = false;
                break;
            }
        }
        return result;
    }

}
