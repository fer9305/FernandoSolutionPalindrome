package com.developersdelicias.palindrome.util;

public class BenjaminNumberPalindromeGenerator implements NumberPalindromeGenerator {
	
	PalindromeAnalyzer analyzer = new BenjaminPalindromeAnalyzer();

	public BenjaminNumberPalindromeGenerator(PalindromeAnalyzer analyzer) {
		this.analyzer = analyzer;
	}

	@Override
	public long nextNumberPalindrome(long initialValue) {

		long nextPalindrome = initialValue + 1;

		while (!analyzer.isPalindrome(new Long(nextPalindrome).toString())) {
			nextPalindrome++;
		}

		return nextPalindrome;
	}

}
