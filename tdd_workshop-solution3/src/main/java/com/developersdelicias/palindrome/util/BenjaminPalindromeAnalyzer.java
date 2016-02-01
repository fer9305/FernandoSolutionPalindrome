package com.developersdelicias.palindrome.util;

public class BenjaminPalindromeAnalyzer implements PalindromeAnalyzer {

	@Override
	public boolean isPalindrome(String phrase) {

		if (phrase == null || phrase.isEmpty()) {
			return false;
		}

		String phraseWithoutSymbols = phrase.replaceAll("[^a-zA-Z0-9]", "");

		if (phraseWithoutSymbols.isEmpty()) {
			return false;
		}

		String reversedPhrase = new StringBuilder(phraseWithoutSymbols).reverse().toString();

		return phraseWithoutSymbols.equalsIgnoreCase(reversedPhrase);
	}

	@Override
	public String toString() {
		return "BenjaminPalindromeAnalyzer";
	}

}
