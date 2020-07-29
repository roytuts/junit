package com.roytuts.junit.jacoco;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class CalculationTest {

	private Calculation calc;

	@Before
	public void setup() {
		calc = new Calculation();
	}

	@Test
	public void testFindMax() {
		int result = calc.findMax(new int[] { 1, 3, 4, 2 });
		assertEquals(4, result);
		result = calc.findMax(new int[] { -12, -1, -3, -4, -2 });
		assertEquals(-1, result);
	}

	/*@Test
	public void testGetRemainder() {
		int result = calc.getRemainder(5, 2);
		assertEquals(1, result);
	}*/
	
	@Test(expected = IllegalArgumentException.class)
	public void testGetRemainder() {
		int result = calc.getRemainder(5, 2);
		assertEquals(1, result);
		calc.getRemainder(5, 0);
	}

}
