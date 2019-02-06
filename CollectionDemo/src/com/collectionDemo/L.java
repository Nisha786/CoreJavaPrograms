package com.collectionDemo;

import java.util.ArrayList;

public class L extends ArrayList {

	public static void main(String[] args) {
		L list = new L();
		list.add(9);
		list.add(0);
		list.add(90);
		list.add(19);
		list.add(81);
		list.add(80);
		list.add(18);
		list.add(83);
		System.out.println(list);
		list.removeRange(2, 6);
		System.out.println(list);
	}

}
