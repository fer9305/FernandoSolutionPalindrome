package com.developersdelicias.hello;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class HelloWorldTest {

	private static final String DEFAULT_RESULT = "Hello World!";
	private HelloWorld hello;

	@Before
	public void setUp() {
		hello = new HelloWorld();
	}

	@Test
	public void testSayHello() {
		assertEquals("Hello Benjamin!", hello.sayHello("Benjamin"));
	}

	@Test
	public void testSayHelloWithNullValue() {
		assertEquals(DEFAULT_RESULT, hello.sayHello(null));
	}

	@Test
	public void testSayHelloWithEmptyString() throws Exception {
		assertEquals(DEFAULT_RESULT, hello.sayHello(""));
	}

	@Test
	public void testSayHelloWithSpaces() throws Exception {
		assertEquals(DEFAULT_RESULT, hello.sayHello("      "));
	}

}
