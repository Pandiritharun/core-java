package com.tnsif.expectionhandlingg;

public class Test2 {
	public static void main(String[] args) {
		try {
			System.out.println(100/10);
		}
		catch(ArithmeticException e) {
			System.out.println(e.getMessage());
		}
		finally {
			System.out.println("thank you");
		}
	}

}
