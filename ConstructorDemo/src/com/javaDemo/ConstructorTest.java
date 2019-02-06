package com.javaDemo;

public class ConstructorTest {

	/*
	 * ConstructorTest() { this(10);
	 * System.out.println("No Argument Constructor"); }
	 */

    	ConstructorTest(int i) {
		// this(10, 20);
		System.out.println("One Argument Constructor");
	}

	/*
	 * ConstructorTest(int i, int j) {
	 * System.out.println("Two argument constructor"); }
	 */

	public static void main(String[] args) {

		// ConstructorTest t1 = new ConstructorTest();
		ConstructorTest t2 = new ConstructorTest(10);
		// ConstructorTest t3 = new ConstructorTest(10, 20);
	}

}
