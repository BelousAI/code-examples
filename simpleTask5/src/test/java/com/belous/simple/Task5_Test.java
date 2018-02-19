package com.belous.simple;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class Task5_Test {
	private String str;
	private String subStr;
	private boolean expResult;

	public Task5_Test(String str, String subStr, boolean expResult) {
		this.str = str;
		this.subStr = subStr;
		this.expResult = expResult;
	}

	@Parameterized.Parameters
	public static Collection<Object[]> getParam() {
		return Arrays.asList(new Object[][] {
				{"123_325_568", "325", true},
				{"поиск вхождения подстроки в строку", "строк", true},
				{"12se6a8r7ch", "search", false},
				{"New York", "Yor", true}
		});
	}

	@Test
	public void isFound() {
		boolean result = Task5.isFound(str, subStr);
		assertEquals(result, expResult);
	}
}