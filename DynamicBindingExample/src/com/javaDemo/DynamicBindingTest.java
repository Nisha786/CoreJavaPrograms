package com.javaDemo;

public class DynamicBindingTest {

	public static void main(String[] args) {

		Vehicle v = new Car(); // here Type is vehicle but object will be car
		v.start(); // Car's start called because start() is overridden method
	}
}

class Vehicle {

	public void start() {
		System.out.println("Inside start method of vehicle");
	}
}

class Car extends Vehicle {

	public void start() {
		System.out.println("Inside start() of car");
	}
}