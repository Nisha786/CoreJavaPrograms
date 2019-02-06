package com.collectionDemo;

import java.util.ArrayList;

class H {

	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add(9);
		list.add(0);
		list.add(90);
		list.add(19);
		System.out.println(list);
		boolean flag = list.remove(new Integer(9));
		System.out.println(list);
		System.out.println(flag);
		flag = list.remove(new Integer(91));
		System.out.println(list);
		System.out.println(flag);
	}

}
