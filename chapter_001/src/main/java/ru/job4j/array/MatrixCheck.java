package ru.job4j.array;

public class MatrixCheck {
    public boolean mono(boolean[][] data) {
        boolean result = true;
        int x = data.length -1;
        for (int i = 1; i < data.length; i++) {
            if (data[0][0] != data[i][i] || data[x][0] != data[x-i][i]) {
                result = false;
                break;
            }
        }
        if (data[0][0] != data[x][0])
            result = false;
        return result;

    }
}