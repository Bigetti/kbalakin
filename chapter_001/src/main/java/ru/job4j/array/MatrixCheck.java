package ru.job4j.array;

public class MatrixCheck {
    public boolean mono(boolean[][] data) {
        boolean result = true;
        for (int i = 1; i < data.length; i++) {
            if (data[0][0] != data[i][i] || data[2][0] != data[2-i][i]) {
                result = false;
            }
        }
        return result;

    }
}