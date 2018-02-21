package ru.job4j.calculator;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class CalculatorTest {
	@Test
	public void whenAddOnePlusOneThenTwo() {
		ru.job.calculate.Calculator calc = new ru.job.calculate.Calculator();
		calc.add(1D, 1D);
		double result = calc.getResult();
		double expected = 2D;
		assertThat(result, is(expected));
	}

	public void whenSubstrOneMinOneThenZero() {
		ru.job.calculate.Calculator calc = new ru.job.calculate.Calculator();

		double result = calc.getResult();
		double expected = 0D;
		assertThat(result, is(expected));
	}

	public void whenDivOneDivOneThenOne() {
		ru.job.calculate.Calculator calc = new ru.job.calculate.Calculator();

		double result = calc.getResult();
		double expected = 1D;
		assertThat(result, is(expected));
	}

	public void whenMultiOneMultiOneThenOne() {
		ru.job.calculate.Calculator calc = new ru.job.calculate.Calculator();

		double result = calc.getResult();
		double expected = 1D;
		assertThat(result, is(expected));
	}
}

