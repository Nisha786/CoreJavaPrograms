package com.coreJavaDemo;

class Sample {
	public static void m1() {
		System.out.println("method of super class");
	}
}

public class Demo extends Sample {
	public static void m1() {
		System.out.println("method of sub class");
	}

	public static void main(String args[]) {
		Sample p = new Sample();
		p.m1();
		p.m1();
		
		Demo c = new Demo();
		c.m1();
		c.m1();
		
		Sample p1 = new Demo();
		p1.m1();
		p1.m1();
		
	}
}