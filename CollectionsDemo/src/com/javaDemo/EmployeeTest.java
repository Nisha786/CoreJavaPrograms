package com.javaDemo;

import java.util.HashSet;

public class EmployeeTest {

	public String name;

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	public static void main(String[] args) {

		Employee e1 = new Employee();
		Employee e2 = new Employee();
		e1.name = "John";
		e2.name = "John";

		HashSet employeeSet = new HashSet();
		employeeSet.add(e1);
		employeeSet.add(e2);
		System.out.println(employeeSet.size());
	}

}
