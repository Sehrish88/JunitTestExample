package com.qa.JunitExample;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class CalculatorTest {
	@Test
	public void sumTest() {
		Calclator.sum(1, 2);
		assertEquals(3, Calclator.sum(1, 2)); 
	}
	
	@Test 
	public void multiplicationTest() {
		Calclator.multiplication(2, 3);
		assertEquals(6, Calclator.multiplication(2, 3));
	}
	
	@Test
	public void divisionTest() {
		Calclator.division(10, 2);
		assertEquals(5, Calclator.division(10, 2));
	}
	
	@Test
	public void subtractionTest() {
		Calclator.subtraction(20, 18);
		assertEquals(2, Calclator.subtraction(20, 18));
	}
	
	

	
}
