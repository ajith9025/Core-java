package com.chainsys.oops;

public class SuperClass {

	private void privateMethod() {
		System.out.println("This is a private method in SuperClass");
	}

	public void publicMethod() {
		System.out.println("This is a public method in SuperClass");
		privateMethod();
	}
}
