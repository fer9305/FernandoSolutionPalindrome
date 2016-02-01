package com.developersdelicias.palindrome.util;

public class AnotherPalindromeAnalyzer implements PalindromeAnalyzer {

	@Override
	public boolean isPalindrome(String phrase) {

		if (phrase == null) {
			return false;
		}

		String phraseWithoutSpaces = phrase.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

		if (phraseWithoutSpaces.isEmpty()) {
			return false;
		}
		final int lengthWithoutSpaces = phraseWithoutSpaces.length();
		String firstHalfPhrase = phraseWithoutSpaces.substring(0, lengthWithoutSpaces / 2);
		String secondHalfPhrase = phraseWithoutSpaces.substring(lengthWithoutSpaces / 2);

		boolean equals = true;
		for (int i = 0; i < firstHalfPhrase.length(); i++) {
			final char firstLetter = firstHalfPhrase.charAt(i);
			final char lastLetter = secondHalfPhrase.charAt(secondHalfPhrase.length() - i - 1);

			if (firstLetter != lastLetter) {
				equals = false;

				break;
			}
		}
		return equals;
	}

	@Override
	public String toString() {
		return "AnotherPalindromeAnalyzer";
	}

}
