package com.coreJavaDemo;

class A {
	static void staticMethod() {
		System.out.println("Static Method");
	}
}

public class A3 {

	public static void main(String[] args) {

		A a = null;
		a.staticMethod();
	}

}
