package ru.job4j.array;

//доп задание: проверить массив на предмет отсортированности по взрастанию
public class CheckArray {

    public boolean checksort(int[] array) {
        boolean res = false;
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] < array[i + 1]) {
                res = true;
            }
            else {
                res = false;
                break;
            }
        }
        return res;
    }
    }