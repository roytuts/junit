package com.roytuts.junit.setup.gradle.maven;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import com.roytuts.junit.setup.gradle.maven.Library;

public class LibraryTest {

	@Test
	public void testSomeLibraryMethod() {
		Library classUnderTest = new Library();
		assertTrue(classUnderTest.someLibraryMethod(), "someLibraryMethod should return 'true'");
	}

}
