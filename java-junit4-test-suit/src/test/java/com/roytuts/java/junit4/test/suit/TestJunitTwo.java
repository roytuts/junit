package com.roytuts.java.junit4.test.suit;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestJunitTwo {

	@Test
	public void testTwo() {
		System.out.println("testTwo() method in TestJunitTwo");
		//String str = "JunitTwo is working fine";
		String str = "JunitTwo1 is working fine";
		assertEquals("JunitTwo is working fine", str);
	}

}
