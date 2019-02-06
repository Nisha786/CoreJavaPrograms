/*package com.javaDemo;

import java.util.HashSet;

class Country {

	private String name;

	Country(String name) {
		this.name = name;
	}

	public String toString() {
		return name;
	}

}  */
import java.util.HashSet;
import java.util.LinkedHashSet;

public class HashsetDemo {

	public static void main(String[] args) {

/*		HashSet myMap = new HashSet();
		String s1 = new String("India");
		String s2 = new String("India");
		Country c1 = new Country("France");
		Country c2 = new Country("France");
		myMap.add(s1);
		myMap.add(s2);
		myMap.add(c1);
		myMap.add(c2);
		System.out.println(myMap);  */



		LinkedHashSet h = new LinkedHashSet();
		h.add("B");
		h.add("C");
		h.add("D");
		h.add("Z");
		h.add(null);
		h.add(10);
		System.out.println(h.add("z"));
		System.out.println(h);
	}

}
