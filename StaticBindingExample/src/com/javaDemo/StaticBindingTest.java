package com.javaDemo;

import java.util.Collection;
import java.util.HashSet;

public class StaticBindingTest {

	public static void main(String[] args) {

		Collection c = new HashSet();
		StaticBindingTest st = new StaticBindingTest();
		st.sort(c);
	}
	
	//overloaded method takes Collection argument
	public Collection sort(Collection c) {
		
		System.out.println("inside collection sort method");
		return c;
	}

	//overloaded method takes hashset argument
	public Collection sort(HashSet hs) {
		System.out.println("Inside hashset sort method");
		return hs;
	}
}
