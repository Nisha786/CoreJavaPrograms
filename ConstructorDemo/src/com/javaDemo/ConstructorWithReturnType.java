package com.javaDemo;

public class ConstructorWithReturnType {

	void ConstructorWithReturnType() {
		System.out.println("method not Constructor call");
	}

	public static void main(String[] args) {

		ConstructorWithReturnType cr = new ConstructorWithReturnType();
        cr.ConstructorWithReturnType();
	}

}
