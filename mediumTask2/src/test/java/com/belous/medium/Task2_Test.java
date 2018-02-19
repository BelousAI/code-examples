package com.belous.medium;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class Task2_Test {
	private String source;
	private String expResult;

	public Task2_Test(String source, String expResult) {
		this.source = source;
		this.expResult = expResult;
	}

	@Parameterized.Parameters
	public static Collection<Object[]> getParam() {
		return Arrays.asList(new Object[][] {
				{"aaaabbbccd", "4a3b2c1d"},
				{"ffaaarrrrr", "2f3a5r"},
				{"@@@@}}>>>>", "4@2}4>"},
				{"****fff///", "4*3f3/"}
		});
	}

	@Test
	public void getEncoded() {
		String result = Task2.getEncoded(source);
		assertEquals(result, expResult);
	}
}