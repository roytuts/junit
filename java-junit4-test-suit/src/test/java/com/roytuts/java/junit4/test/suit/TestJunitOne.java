package com.roytuts.java.junit4.test.suit;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestJunitOne {

	@Test
	public void testOne() {
		System.out.println("testOne() method in TestJunitOne");
		String str = "JunitOne is working fine";
		assertEquals("JunitOne is working fine", str);
	}

}
