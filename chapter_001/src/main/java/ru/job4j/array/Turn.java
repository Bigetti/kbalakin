package ru.job4j.array;



public class Turn {
    public int[] turn(int[] array) {
        int leng = array.length - 1;
        for (int i = 0; i <= leng; i++) {
            int a = array[i];
            array[i] = array[leng];
            array[leng] = a;
            leng--;
        }
        return array;
    }
}