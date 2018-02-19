package com.belous.medium;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class Task3_Test {
	private String code;
	private String expResult;

	public Task3_Test(String code, String expResult) {
		this.code = code;
		this.expResult = expResult;
	}

	@Parameterized.Parameters
	public static Collection<Object[]> getParams() {
		return Arrays.asList(new Object[][] {
				{"3a2b1c", "aaabbc"},
				{"2f3a5r", "ffaaarrrrr"},
				{"4@2}4>", "@@@@}}>>>>"},
				{"4*3f3/", "****fff///"}
		});
	}

	@Test
	public void testGetDecoded() {
		String result = Task3.getDecoded(code);
		assertEquals(result, expResult);
	}
}