package com.belous.simple;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class Task2_Test {
	private Integer number;
	private Integer[] expResult;

	public Task2_Test(Integer[] num, Integer[] multipliers) {
		this.number = num[0];
		this.expResult = multipliers;
	}

	@Parameterized.Parameters
	public static List<Integer[][]> getNumbers() {
		return Arrays.asList(new Integer[][][] {
				{{20}, {2, 2, 5}},
				{{25}, {5, 5}},
				{{13}, {13}},
				{{144}, {2, 2, 2, 2, 3, 3}}
		});
	}

	@Test
	public void testGetMultiplier() {
		ArrayList<Integer> list = Task2.getMultipliers(number);
		Integer[] result = list.toArray(new Integer[list.size()]);
		assertArrayEquals(expResult, result);
	}
}