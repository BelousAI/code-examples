package com.belous.simple;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class Task3_Test {
	private String text;
	private boolean expResult;

	public Task3_Test(String src, boolean expResult) {
		this.text = src;
		this.expResult = expResult;
	}

	@Parameterized.Parameters
	public static Collection<Object[]> getParams() {
		return Arrays.asList(new Object[][] {
				{"1234321", true},
				{"AbcFfcba", true},
				{"А роза упала на лапу Азора", true},
				{"Parameterized", false}
		});
	}

	@Test
	public void testIsPalindrome() {
		boolean result = Task3.isPalindrome(text);
		assertEquals(result, expResult);
	}
}