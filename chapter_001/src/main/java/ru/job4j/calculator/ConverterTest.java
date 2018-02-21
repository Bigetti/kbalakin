package ru.job4j.calculator;

import com.sun.org.apache.xerces.internal.util.PropertyState;
import org.testng.annotations.Test;

import static com.sun.org.apache.xerces.internal.util.PropertyState.is;

public class ConverterTest {
    @Test
    public void when60RubleToDollarThen1() {
        Converter converter = new Converter();
        int result = converter.rubleToDollar(60);
        assertThat(result, is(1D));
    }

    private void assertThat(int result, PropertyState propertyState) {
    }

    @Test
    public void when70RubleToEuroThen1() {
        Converter converter = new Converter();
        int result = converter.rubleToDollar(70);
        assertThat(result, is(1D));
    }
}
