package com.coreJavaDemo;

public class Program {

	public abstract class BaseClass {
		private BaseClass() {
			System.out.println("Base constructor");
		}
	}

	public static void Main(String[] args) {

		Program p = new Program();
		System.out.println("Main method");
		
	}
}
