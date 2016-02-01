package com.developersdelicias.util.file;

import static org.junit.Assert.*;

import java.io.FileNotFoundException;

import org.junit.Test;

public class FileUtilsTest {

	@Test
	public void getResourceAsStringShouldReturnTheContentOfTheFileAsString() throws Exception {
		assertEquals("Hello World!", FileUtils.getResourceAsString("/test.txt"));
	}
	
	@Test(expected=FileNotFoundException.class)
	public void getResourceAsStringWithInvalidFileShouldReturnFileNotFoundException() throws Exception {
		FileUtils.getResourceAsString("/notExists.txt");
	}

}
