package com.developersdelicias.palindrome.util;

import static org.mockito.Mockito.when;

import org.junit.Before;
import org.mockito.Mockito;

public class BenjaminPalindromeComplexityCalculatorTest extends PalindromeComplexityCalculatorTest {

	@Before
	public void setUp() {
		PalindromeAnalyzer analyzer = Mockito.mock(PalindromeAnalyzer.class);
		for (String palindrome: TestPalindromeProvider.validPalindromes()) {
			when(analyzer.isPalindrome(palindrome)).thenReturn(true);
		}
		
		for (String palindrome: TestPalindromeProvider.invalidPalindromes()) {
			when(analyzer.isPalindrome(palindrome)).thenReturn(false);
		}

		calculator = new BenjaminPalindromeComplexityCalculator(analyzer);
	}

}
