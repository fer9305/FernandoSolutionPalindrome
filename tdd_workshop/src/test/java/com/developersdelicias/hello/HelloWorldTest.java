package com.developersdelicias.hello;

import static org.junit.Assert.*;

import org.junit.Test;

public class HelloWorldTest {

	@Test
	public void testSayHello() {
		HelloWorld hello = new HelloWorld();
		String name = "Benjamin";
		String expected = "Hello Benjamin!";
		String result = hello.sayHello(name);

		assertEquals(expected, result);
	}

	@Test
	public void testSayHelloWithNullValue() {
		HelloWorld hello = new HelloWorld();
		String name = null;
		String expected = "Hello World!";
		String result = hello.sayHello(name);
		assertEquals(expected, result);
	}

}
