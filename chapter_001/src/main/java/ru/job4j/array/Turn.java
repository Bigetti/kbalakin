package ru.job4j.array;



public class Turn {
    public int[] turn(int[] array) {
        int leng = array.length - 1;
        for (int index = 0; index < array.length / 2; index++) {
            int a = array[index];
            array[index] = array[leng];
            array[leng] = a;
            leng --;

        }
        return array;
    }
}


