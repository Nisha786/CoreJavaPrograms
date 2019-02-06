package com.collectionDemo;

import java.util.ArrayList;

public class E {

	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add(90);
		list.add("abc");
		list.add('s');
		list.add(true);
		list.add(235.54);
		System.out.println(list);
		list.add("xyz");
		System.out.println(list);
		list.add(2, "check");
		System.out.println(list);
	}

}
