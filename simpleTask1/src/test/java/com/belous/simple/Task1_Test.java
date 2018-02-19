package com.belous.simple;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class Task1_Test {
	private int[] numbers;
	private int expResult;

	public Task1_Test(int[] src, int[] num) {
		this.numbers = src;
		this.expResult = num[0];
	}

	@Parameterized.Parameters
	public static Collection<Object[]> getNumbers() {
		return Arrays.asList(new int[][][] {
				{{1, 2, 3, 4}, {3}},
				{{-2, 0, 2, 8, -5}, {2}},
				{{60, 10, 2, 15, 15}, {15}},
				{{5, 10}, {5}}
		});
	}

	@Test
	public void testGetMax() {
		int result = Task1.getMax(numbers);
		assertEquals(expResult, result);
	}

}