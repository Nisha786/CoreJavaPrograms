package com.javaDemo;

class ChildVsParentConstructor {

	String name;
	int age;

	ChildVsParentConstructor(String name, int age) {
		this.name = name;
		this.age = age;
		System.out.println("Parent constructor");
	}

	class Children extends ChildVsParentConstructor {
		int rollno;
		int marks;

		Children(String name, int age, int rollno, int marks) {
			super(name, age);
			this.rollno = rollno;
			this.marks = marks;
			System.out.println("Child constructor");
		}
	}

	public static void main(String[] args) {

		
	}

}
