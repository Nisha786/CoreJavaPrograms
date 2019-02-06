package com.javaDemo;

interface IFruit{
	public String TYPE = "Apple";
}

class Fruit implements IFruit {
	
}

public class A {

	public static void main(String[] args) {

		System.out.println(Fruit.TYPE);
		
	}

}
