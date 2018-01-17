package ru.job4j;

import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 *Class Test;
 *@author kbalakin
 *@since 09.01.2018
 *@version 1.0
 */

public class CalculateTest {
    /**
     * Test echo.
     */ @Test

    public void whenTakeNameThenTreeEchoPlusName() {
        String input = "Kbalakin";
        String expect = "Echo, echo, echo : Kbalakin";
        Calculate calc = new Calculate();
        String result = calc.echo(input);
        assertThat(result, is(expect));
    }

}