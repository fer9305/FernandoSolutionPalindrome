package com.developersdelicias.palindrome.util;

import java.util.ArrayList;
import java.util.List;

public class TestPalindromeProvider {
	
	public static List<String> lowComplexPalindromes() {
		List<String> list = new ArrayList<>();
		list.add("oso");
		list.add("taco cat");
		list.add("Borrow or rob?");
		list.add("1");
		list.add("11");
		list.add("111");
		list.add("1111");
		list.add("11111");
		list.add("111111");
		list.add("1111111");
		list.add("11111111");
		list.add("111111111");
		list.add("1111111111");
		return list;
	}
	
	public static List<String> mediumComplexPalindromes() {
		List<String> list = new ArrayList<>();
		list.add("Anita lava la tina");
		list.add("Campus motto: Bottoms up Mac.");
		list.add("Marge lets Norah see Sharon’s telegram.");
		list.add("11111111111");
		list.add("111111111111");
		list.add("1111111111111");
		list.add("11111111111111");
		list.add("111111111111111");
		list.add("1111111111111111");
		list.add("11111111111111111");
		list.add("111111111111111111");
		list.add("1111111111111111111");
		list.add("11111111111111111111");
		return list;
	}
	
	public static List<String> highComplexPalindromes() {
		List<String> list = new ArrayList<>();
		list.add("A man, a plan, a canal, Panama!");
		list.add("A Toyota! Race fast, safe car! A Toyota!");
		list.add("A new order began, a more Roman age bred Rowena.");
		list.add("Are we not pure? “No sir!” Panama’s moody Noriega brags. “It is garbage!” Irony dooms a man; a prisoner up to new era.");
		list.add("111111111111111111111");
		list.add("1111111111111111111111");
		
		return list;
	}
	
	public static List<String> validPalindromes() {
		List<String> list = new ArrayList<>();
		list.addAll(lowComplexPalindromes());
		list.addAll(mediumComplexPalindromes());
		list.addAll(highComplexPalindromes());
		list.add("Race car");
		list.add("Amor, Roma");
		list.add("Was it a car or a cat I saw?");
		list.add("No 'x' in Nixon");
		return list;
	}
	
	public static List<String> invalidPalindromes() {
		List<String> list = new ArrayList<>();
		list.add("");
		list.add("osos");
		list.add(null);
		list.add("not a palindrome");
		list.add("!#$%&()=?+´*12345678980");
		list.add("!#$%&()=?+´");
		return list;	
	}
	
	public static Object[][] nextNumberPalindromeTestCases() {
		return new Object[][] {
				new Object[] {11L, 10L},
				new Object[] {22L, 11L},
				new Object[] {33L, 22L},
				new Object[] {101L, 99L},
				new Object[] {111L, 101L},
				new Object[] {121L, 111L},
				new Object[] {202L, 191L},
				new Object[] {1001L, 999L},
				new Object[] {1111L, 1001L},
				new Object[] {1221L, 1111L},
				new Object[] {1235321L, 1234567L},
		};
	}
}
