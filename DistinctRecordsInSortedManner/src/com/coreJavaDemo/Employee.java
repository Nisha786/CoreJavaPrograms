package com.coreJavaDemo;

public class Employee implements Comparable<Employee> {

	Integer id;
	String name;
	Long Salary;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public Long getSalary() {
		return Salary;
	}

	public void setSalary(Long salary) {
		Salary = salary;
	}

	public Employee(Integer id, String name, Long Salary) {
		super();
		this.id = id;
		this.name = name;
		this.Salary = Salary;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", Salary ="+ Salary +"]";
	}

	@Override
	public int compareTo(Employee o) {
		return this.id - o.id;
	}

}