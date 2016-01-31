package com.developersdelicias.palindrome.util;

import static org.mockito.Mockito.when;

import org.junit.Before;
import org.mockito.Mockito;

public class BenjaminNumberPalindromeGeneratorTest extends NumberPalindromeGeneratorTest {

	@Before
	public void setUp() {
		PalindromeAnalyzer analyzer = Mockito.mock(PalindromeAnalyzer.class);
		for (Object[] o : TestPalindromeProvider.nextNumberPalindromeTestCases()) {
			Long expected = (Long) o[0];
			when(analyzer.isPalindrome(expected.toString())).thenReturn(true);
		}
		generator = new BenjaminNumberPalindromeGenerator(analyzer);
	}
}
