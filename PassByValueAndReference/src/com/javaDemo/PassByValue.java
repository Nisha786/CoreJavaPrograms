package com.javaDemo;

public class PassByValue {

	/*
	 * public static void main(String[] args) {
	 * 
	 * Test t = new Test(); t.name = "InitialValue"; new
	 * PassByValue().changeValue(t); System.out.println(t.name); }
	 * 
	 * public void changeValue(Test f) { f.name = "changeValue"; }
	 * 
	 * }
	 * 
	 * class Test { String name; }
	 */

	//for PassByReference
		public static void main(String[] args) {
			Test t = new Test();
			t.name = "initialvalue";
			new PassByValue().changeRefence(t);
			System.out.println(t.name);
		}

		public void changeRefence(Test f) {
			f = null;
		}
	}

	class Test {
	    String name;
	}
