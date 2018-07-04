package ru.job4j.array;

//2.есть 2 массива
//они оба отсортированы.
//их надо добавить в 3-й массив, чтобы там все элементы были отсортированы по возрастанию.

public class TwoArrayToOne {

    public static int[] dabl(int a[], int b[]) {

        int result[] = new int[a.length + b.length];
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < a.length && j < b.length) {
            if (a[i] < b[j]) {
                result[k++] = a[i];
                i++;
            }
            else if (a[i] == b[j]) {
                result[k++] = a[i];
                i++;
                result[k++] = b[j];
                j++;
            }
            else {
                result[k++] = b[j];
                j++;
            }
        }
        System.arraycopy(a, i, result, k, (a.length - i));
        System.arraycopy(b, j, result, k, (b.length - j));
        return result;
    }
}
