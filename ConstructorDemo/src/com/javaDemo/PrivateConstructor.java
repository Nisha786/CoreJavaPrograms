package com.javaDemo;

public class PrivateConstructor {

	private static PrivateConstructor pc;

	private PrivateConstructor() {

	}

	// create a static method to get instance
	public static PrivateConstructor getInstance() {
		if (pc == null) {
			pc = new PrivateConstructor();
		}
		return pc;
	}

	public void getSomeThing() {
		System.out.println("getSomething method");
	}

	public static void main(String[] args) {

		// PrivateConstructor pc = new PrivateConstructor();
		// System.out.println(pc.hashCode());
		PrivateConstructor prc = PrivateConstructor.getInstance();
		PrivateConstructor p1 = new PrivateConstructor();
		prc.getSomeThing();
	}

}
