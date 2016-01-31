package com.developersdelicias.palindrome.util;

import java.util.HashSet;

public class FernandoPalindromeAnalyzer implements PalindromeAnalyzer{
    @Override
    public boolean isPalindrome(String phrase) {
        if (phrase == null || phrase.isEmpty())
            return false;
        String phraseWithoutSymbols = deletingSymbols(phrase);
        if(phraseWithoutSymbols.isEmpty())
            return false;
        return validatingPalindrome(phraseWithoutSymbols);
    }

    private String deletingSymbols(String phrase)
    {
        return phrase.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
    }

    private boolean validatingPalindrome(String phraseWithoutSymbols)
    {
        HashSet<String> palindromeValidator = new HashSet<>();
        palindromeValidator.add(phraseWithoutSymbols);
        String phraseReversed = new StringBuilder(phraseWithoutSymbols).reverse().toString();
        return !palindromeValidator.add(phraseReversed);
    }

    @Override
    public String toString() {
        return "FernandoPalindromeAnalyzer";
    }
}

