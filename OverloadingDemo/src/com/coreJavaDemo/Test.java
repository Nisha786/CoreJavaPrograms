package com.coreJavaDemo;

public class Test {

	public void m1(int i) {
		System.out.println("int arg");
	}

	public void m1(float f) {
		System.out.println("float arg");
	}

	public void m1(StringBuffer sb) {
		System.out.println("StringBuffer arg");
	}

	public void m1(Object o) {
		System.out.println("Object version");
	}

	public void m1(String s) {
		System.out.println("String arg");
	}

	public static void main(String[] args) {

		Test t = new Test();
	    t.m1(new Object());
	    t.m1("nisha");
	/*	t.m1(10);
		t.m1(10.5f);
		t.m1(new StringBuffer("nisha"));
		t.m1('a');
		t.m1(10l);
		t.m1(10.5f);  */
	}

}
