package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class ArrayDuplicateTest {
    @Test
    public void whenRemoveDuplicatesThenArrayWithoutDuplicate() {
        ArrayDuplicate data = new ArrayDuplicate();
        String[] first = {"Привет", "Мир", "Привет", "Супер", "Мир"};
        String[] result = data.remove(first);
        String[] expect = {"Привет", "Мир", "Супер"};
        assertThat(result, is(expect));
    }
}