package ru.job4j.loop;


import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class CounterTest {
    @Test
    public void whetSixToFiftyFor() {
        Counter see = new Counter();
        int even = see.add(6, 9);
        assertThat(even, is(14));
    }
}