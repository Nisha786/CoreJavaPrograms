package com.javaDemo;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {

		LinkedList<String> al = new LinkedList<String>(); // creating linkedlist
		al.add("Deepak");    //adding elements
		al.add("Archana");
		al.add("Shivani");
		Iterator<String> itr = al.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
