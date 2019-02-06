package com.collectionDemo;

import java.util.ArrayList;

class D {

	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add(90);
		list.add("abc");
		list.add('s');
		list.add(true);
		list.add(235.54);
		System.out.println("Classical for loop");
		System.out.println("===================");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		System.out.println("Enhanced for loop");
		System.out.println("===================");
		for (Object obj : list) {
			System.out.println(obj + ",");
		}
		System.out.println("toString() method");
		System.out.println("===================");
		System.out.println(list);
	}

}
