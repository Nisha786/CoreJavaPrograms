package com.coreJavaDemo;

class Audi {

	void run() {
		System.out.println("Audi is running");
	}
}

class Car extends Audi {
	void run() {
		System.out.println("Car is running");
	}

	public static void main(String[] args) {

		Audi a = new Audi();
		a.run();
	}
}
