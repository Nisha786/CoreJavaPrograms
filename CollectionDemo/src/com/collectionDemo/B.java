package com.collectionDemo;

import java.util.ArrayList;

class B {

	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add(90);
		list.add(true);
		int i = (Integer)list.get(0);
		boolean flag = (Boolean)list.get(1);
		System.out.println(i);
		System.out.println(flag);
		System.out.println(list.get(0));
	}
}
