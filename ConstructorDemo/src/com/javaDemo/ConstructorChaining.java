package com.javaDemo;

public class ConstructorChaining {

	public static void main(String[] args) {
		System.out.println("Contructor chaining");
		Child c = new Child("Jersey");
		System.out.println("---------------------");
		Child c2 = new Child();
	}
}

class Parent {
	private String name;

	protected Parent() {
		this("");
		System.out.println("No argument constructor of parent called");
	}

	protected Parent(String name) {
		this.name = name;
		System.out.println("One argument constructor of parent called");
	}
}

class Child extends Parent {
	private String name;

	protected Child() {
		this("");
		System.out.println("No argument constructor of child class");
	}

	protected Child(String name) {
		super(name);
		System.out.println("One argument constructor of Super class called from sub class");
	}
}
