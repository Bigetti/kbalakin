package ru.job4j.array;



public class Check {
    public boolean mono(boolean[] data) {
        boolean result = false;
        for (int i = 1; i <= data.length - 1; i++) {
            if (data[0] = data[i]) {
                result = true;
            }
            else {
                result = false;
                break;
            }
        }
        return result;
    }
}
