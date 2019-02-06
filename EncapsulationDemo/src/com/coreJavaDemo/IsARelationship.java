package com.coreJavaDemo;

class P {
	public void m1() {
		System.out.println("m1 method called");
	}
}

class C extends P {
	public void m2() {
		System.out.println("m2 method called");
	}
}

public class IsARelationship {

	public static void main(String[] args) {
		// case 1
		P p = new P();
		p.m1();
		// p.m2(); not valid
		//case 2
		C c = new C();
		c.m1();
		c.m2();
		//case 3
		P p1 = new C();
		p1.m1();
	//	p1.m2();  not valid
	//	C c1 = new P();  not valid
		
	}

}
