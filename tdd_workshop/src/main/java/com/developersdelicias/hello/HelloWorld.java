package com.developersdelicias.hello;

public class HelloWorld {
	
	public String sayHello(String name) {
		if (name == null) {
			name = "World";
		}
		return "Hello " + name + "!";
	}
}
