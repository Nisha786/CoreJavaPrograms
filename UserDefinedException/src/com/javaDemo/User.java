package com.javaDemo;

public class User {

	public static void main(String[] args)throws Exception {

		int price = -120;
		if(price < 0)
			throw new MyOwnExceptionClass(price);
		else
			System.out.println("Price :" + price);
	}

}
