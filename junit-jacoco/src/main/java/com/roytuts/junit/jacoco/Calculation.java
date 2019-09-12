package com.roytuts.junit.jacoco;

public class Calculation {

	public int findMax(int arr[]) {
		int max = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (max < arr[i])
				max = arr[i];
		}
		return max;
	}

	public int getRemainder(int dividend, int divisor) {
		if (divisor <= 0) {
			throw new IllegalArgumentException("Divisor should be greater than 0");
		}
		return dividend % divisor;
	}

}
