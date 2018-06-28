package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class CheckArrayTest {
    @Test
    public void whenSortArrayIsUpThenTrue() {

        CheckArray checksorter = new CheckArray();
        int[] input = new int[]{1, 7, 3, 4, 2, 2};
        boolean rst = checksorter.checksort(input);
        assertThat(rst, is(false));
    }

    @Test
    public void whenSortArrayIsUpThenTrue() {

        CheckArray checksorter = new CheckArray();
        int[] input = new int[]{1, 7, 3, 4, 2, 2};
        boolean rst = checksorter.checksort(input);
        assertThat(rst, is(false));
    }
}
