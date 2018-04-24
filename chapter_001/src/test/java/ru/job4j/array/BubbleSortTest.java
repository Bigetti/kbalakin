package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class BubbleSortTest {
    @Test
    public void whenSortArrayWithTenElementsThenSortedArray() {

        BubbleSort sorter = new BubbleSort();
        int[] input = new int[] {1, 7, 3, 4, 2, 2};
        int[] rst = sorter.sort(input);
        int[] expect = new int[] {1, 2, 2, 3, 4, 7};
        assertThat(rst, is(expect));
    }
}