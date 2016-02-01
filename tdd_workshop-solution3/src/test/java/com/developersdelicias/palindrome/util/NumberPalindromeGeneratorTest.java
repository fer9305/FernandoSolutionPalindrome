package com.developersdelicias.palindrome.util;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;

@RunWith(JUnitParamsRunner.class)
public abstract class NumberPalindromeGeneratorTest {

	protected NumberPalindromeGenerator generator;

	@Test
	@Parameters(source=TestPalindromeProvider.class, method="nextNumberPalindromeTestCases")
	public void shouldReturnNextNumberPalindrome(long expected, long initialValue) throws Exception {
		assertEquals(expected, generator.nextNumberPalindrome(initialValue));
	}
}
