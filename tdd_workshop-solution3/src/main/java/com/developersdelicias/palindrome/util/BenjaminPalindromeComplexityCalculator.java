package com.developersdelicias.palindrome.util;

public class BenjaminPalindromeComplexityCalculator implements PalindromeComplexityCalculator {

	private PalindromeAnalyzer analyzer;

	public BenjaminPalindromeComplexityCalculator(PalindromeAnalyzer analyzer) {
		this.analyzer = analyzer;
	}

	@Override
	public PalindromeComplexity calculate(String palindrome) throws InvalidPalindromeException {
		if (!analyzer.isPalindrome(palindrome)) {
			throw new InvalidPalindromeException(palindrome + " is not a palindrome");
		}

		if (isNumber(palindrome)) {
			return calculateNumberPalindrome(palindrome);
		}

		return calculateStringPalindrome(palindrome);
	}

	private PalindromeComplexity calculateStringPalindrome(String palindrome) {
		int numberOfWords = palindrome.split(" ").length;

		if (numberOfWords < 4) {
			return PalindromeComplexity.LOW;
		} else if (numberOfWords < 7) {
			return PalindromeComplexity.MEDIUM;
		}

		return PalindromeComplexity.HIGH;
	}

	private PalindromeComplexity calculateNumberPalindrome(String palindrome) {
		int numberOfDigits = palindrome.length();

		if (numberOfDigits < 11) {
			return PalindromeComplexity.LOW;
		} else if (numberOfDigits < 21) {
			return PalindromeComplexity.MEDIUM;
		}

		return PalindromeComplexity.HIGH;
	}

	private boolean isNumber(String value) {
		return value.matches("\\d+");
	}

}
