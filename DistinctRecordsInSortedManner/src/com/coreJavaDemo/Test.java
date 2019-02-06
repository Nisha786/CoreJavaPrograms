package com.coreJavaDemo;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Test {

	public static void main(String[] args) {

		// List<Employee> employeeList = Arrays.asList(new Employee(-5, "John"),
		// new Employee(2, "David"),
		// new Employee(1, "Anthony"), new Employee(99, "Nisha"));

		// List<Employee> employeeList = Arrays.asList(new Employee(-5,
		// "John"));

		List<Employee> employeeList = Arrays.asList(new Employee(-5, "John", (long) 12000),
				new Employee(1, "John", (long) 8000), new Employee(-5, "John", (long) -10000));

		/*
		 * List<Integer> sortedNames = employeeList.stream().filter(employee ->
		 * employee.getId() > -100).sorted()
		 * .map(Employee::getId).collect(Collectors.toList());
		 * sortedNames.forEach(id -> System.out.println(id));
		 */

		List<Long> sortedSalary = employeeList.stream().max((Comparator<? super Employee>) employeeList);
		sortedSalary.forEach(Salary -> System.out.println(Salary));
	}

}
