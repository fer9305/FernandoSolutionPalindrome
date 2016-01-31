package com.developersdelicias.hello;

public class HelloWorld {
	
	public String sayHello(String name) {
		if (name == null || name.trim().isEmpty()) {
			name = "World";
		}
		return "Hello " + name + "!";
	}
}
