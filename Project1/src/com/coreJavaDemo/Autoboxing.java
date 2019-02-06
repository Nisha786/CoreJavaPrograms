package com.coreJavaDemo;

import java.util.ArrayList;
import java.util.List;

public class Autoboxing {

	public static void main(String[] args) {

		// creating an Integer Object with value 10
		/*
		 * Integer i = new Integer(10);
		 * 
		 * // unboxing the object int i1 = i; System.out.println("value of i :"
		 * + i); System.out.println("value of i1 :" + i1);
		 * 
		 * // Autoboxing of char Character c = 'a';
		 * 
		 * // Auto-unboxing of Character char ch = c;
		 * System.out.println("value of c :" + c);
		 * System.out.println("value of ch :" + ch);
		 */

		// Example 2
		List<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < 10; i++) {
			list.add(i);
			list.add(Integer.valueOf(i));
		}
	}

}
