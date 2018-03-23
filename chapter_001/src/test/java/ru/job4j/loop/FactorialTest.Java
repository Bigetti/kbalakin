package ru.job4j.loop;


import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class FactorialTest {
    @Test
    public void whenNisSix() {
        Factorial factorial = new Factorial();
        int event = factorial.calc(6);
        assertThat(event, is(720));
    }

    public void whenNisFive() {
        Factorial factorial = new Factorial();
        int event = factorial.calc(5);
        assertThat(event, is(120));
    }
}