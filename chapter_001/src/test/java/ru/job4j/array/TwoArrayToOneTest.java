package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class TwoArrayToOneTest {
    @Test
    public void TwoinOne() {

        TwoArrayToOne dablmaker = new TwoArrayToOne();
        int[] a = new int[] {10, 20, 30};
        int[] b = new int[] {9, 11, 20};
        int[] result = dablmaker.dabl(a, b);
        int [] g = new int[] {9, 10, 11, 20, 20, 30};
        assertThat(result, is(g));
    }

}