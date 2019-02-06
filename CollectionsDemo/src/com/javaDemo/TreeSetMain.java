package com.javaDemo;

import java.util.*;

public class TreeSetMain {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {

		TreeCountry indiaTc = new TreeCountry("India");
		TreeCountry chinaTc = new TreeCountry("China");
		TreeCountry nepalTc = new TreeCountry("Nepal");
		TreeCountry indiaTc2 = new TreeCountry("India");
		TreeCountry chinaTc2 = new TreeCountry("China");

		TreeSet countrytreeSet = new TreeSet();
		countrytreeSet.add(indiaTc);
		countrytreeSet.add(chinaTc);
		countrytreeSet.add(nepalTc);
		countrytreeSet.add(indiaTc2);
		countrytreeSet.add(chinaTc2);
		
		Iterator itr = countrytreeSet.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next().getClass());
		}
	}
	}  