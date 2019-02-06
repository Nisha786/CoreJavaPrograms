package com.collectionDemo;

import java.util.ArrayList;

class F {

	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add(9);
		list.add(0);
		list.add(90);
		list.add(19);
		System.out.println(list);
		ArrayList list1 = new ArrayList(list);
		list1.add(9);
		list1.add(100);
		list1.add(90);
		list1.add(110);
		list1.add(123);
		System.out.println(list1);
		list1.removeAll(list);
		System.out.println(list1);
		ArrayList list2 = new ArrayList(list);
		list2.add(201);
		list2.add(202);
		list2.add(203);
		list2.addAll(list1);
		list2.add(204);
		System.out.println(list2);
		list.addAll(2, list1);
		System.out.println(list);
	}

}
