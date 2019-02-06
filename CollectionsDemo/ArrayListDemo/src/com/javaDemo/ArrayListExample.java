package com.javaDemo;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListExample {

	public static void main(String[] args) {

		ArrayList al = new ArrayList(); // creating arraylist
		al.add("Nisha");
		al.add("Pinky");
		Iterator itr = al.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

}
