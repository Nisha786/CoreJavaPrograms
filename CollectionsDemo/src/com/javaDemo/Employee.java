package com.javaDemo;

import java.util.HashSet;

public class Employee {

	public String name;

	@Override
	public int hashCode() {
		return 30;
	}

	@Override
	public boolean equals(Object obj) {
		return true;
	}

	public static void main(String[] args) {

		Employee e1 = new Employee();
		Employee e2 = new Employee();
		e1.name = "Nisha";
		e2.name = "Pinky";

		HashSet employeeSet = new HashSet();
		employeeSet.add(e1);
		employeeSet.add(e2);
		System.out.println(employeeSet.size());
	}

}
// As equals method always return true and hashcode return constant as 31.So
// when you try to put employeeTwo in HashSet, when it will check for equals
// method, it will always return true, so employeeTwo won’t be added to HashSet