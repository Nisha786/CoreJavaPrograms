package com.collectionDemo;

import java.util.ArrayList;

class G {

	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add(9);
		list.add(0);
		list.add(90);
		list.add(19);
		System.out.println(list);
		Object obj = list.remove(2);
		System.out.println(list);
		System.out.println(obj);
		obj = list.remove(10);
	}

}
