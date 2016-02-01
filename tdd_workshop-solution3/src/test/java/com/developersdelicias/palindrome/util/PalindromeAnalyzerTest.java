package com.developersdelicias.palindrome.util;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

import org.apache.log4j.Logger;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;

import com.developersdelicias.util.file.FileUtils;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;

@RunWith(JUnitParamsRunner.class)
public abstract class PalindromeAnalyzerTest {

	protected PalindromeAnalyzer analyzer;
	private static String longestPalindrome;
	private static TreeMap<Long, PalindromeAnalyzer> analyzers;
	private static Logger logger = Logger.getLogger(PalindromeAnalyzerTest.class);

	static {
		try {
			longestPalindrome = FileUtils.getResourceAsString("/longest_palindrome.txt");
		} catch (IOException e) {
			fail("Failed test due we cannot open longest_palindrome.txt file: " + e.getMessage());
		}
		analyzers = new TreeMap<>();
	}

	@BeforeClass
	public static void initClass() {
		logger.debug("This method executes only once per test");
	}

	@Test
	@Parameters(source = TestPalindromeProvider.class, method = "validPalindromes")
	public void withValidPalindromeShouldReturnTrue(String palindrome) throws Exception {
		assertTrue(palindrome + " should be a palindrome.", analyzer.isPalindrome(palindrome));
	}

	@Test
	@Parameters(source = TestPalindromeProvider.class, method = "invalidPalindromes")
	public void withInvalidPalindromeShouldReturnFalse(String palindrome) throws Exception {
		assertFalse(palindrome + " should not be a palindrome.", analyzer.isPalindrome(palindrome));
	}


	@Test(timeout = 100)
	public void withLongestPalindromeShouldHaveAcceptablePerformance() throws Exception {
		long initTime = System.currentTimeMillis();
		assertTrue(analyzer.isPalindrome(longestPalindrome));
		analyzers.put(System.currentTimeMillis() - initTime, analyzer);

	}

	@AfterClass
	public static void printResults() {
		int place = 1;
		logger.info("Performance contest:");
		for (Map.Entry<Long, PalindromeAnalyzer> entry : analyzers.entrySet()) {
			logger.debug(String.format("%d.- %s with %d milliseconds", place++, entry.getValue(), entry.getKey()));
		}
	}

}
