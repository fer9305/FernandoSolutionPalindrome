package com.developersdelicias.palindrome.util;

import static org.junit.Assert.assertSame;

import org.junit.Test;
import org.junit.runner.RunWith;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;

@RunWith(JUnitParamsRunner.class)
public abstract class PalindromeComplexityCalculatorTest {

	protected PalindromeComplexityCalculator calculator;

	@Test
	@Parameters(source=TestPalindromeProvider.class, method="lowComplexPalindromes")
	public void palindromesWithThreeOrLessWordsShouldReturnLowComplexity(String palindrome) {
		assertSame(PalindromeComplexity.LOW, calculator.calculate(palindrome));
	}

	@Test
	@Parameters(source=TestPalindromeProvider.class, method="mediumComplexPalindromes")
	public void palindromeWithSixFiveOrFourWordsShouldReturnMediumComplexity(String palindrome) throws Exception {
		assertSame(PalindromeComplexity.MEDIUM, calculator.calculate(palindrome));
	}

	@Test
	@Parameters(source=TestPalindromeProvider.class, method="highComplexPalindromes")
	public void withSevenOrMoreWordsPalindromeShouldReturnHighComplexity(String palindrome) throws Exception {
		assertSame(PalindromeComplexity.HIGH, calculator.calculate(palindrome));
	}

	@Test(expected = InvalidPalindromeException.class)
	@Parameters(source=TestPalindromeProvider.class, method="invalidPalindromes")
	public void withInvalidPalindromeShouldThrowInvalidPalindromeException(String palindrome) throws Exception {
		calculator.calculate(palindrome);
	}

}
