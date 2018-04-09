package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class FindLoopTest {

    @Test
    public void whenArrayHasLengh4Then0() {
        FindLoop find = new FindLoop();
        Square square = new Square();
        int[] input = square.calculate(4);
        int value = 4;
        int result = find.indexOf(input, value);
        int expect = 1;
        assertThat(result, is(expect));
    }

    @Test
    public void whenArrayHasLengh4ThenNO() {
        FindLoop find = new FindLoop();
        Square square = new Square();
        int[] input = square.calculate(4);
        int value = 5;
        int result = find.indexOf(input, value);
        int expect = -1;
        assertThat(result, is(expect));
    }
}