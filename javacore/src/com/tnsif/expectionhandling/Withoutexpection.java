package com.tnsif.expectionhandling;

public class Withoutexpection {
	
	public static void main(String[] args) {
		
		int d=0;
		try 
		{
			int a=5/0;
		}
		catch(ArithmeticException e) {
			System.out.println("exception caught "+e);
			System.out.println("hello");
		}

		}
	}


