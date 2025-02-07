package com.tnsif.expectionhandling;

public class Division {
	public static void divide () {
		int a=5 , b=7 , c;
		try
		{
			System.out.println("hello");
			
			c=a/b;
			System.out.println("division "+c);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("exception caught "+ e.getMessage());
		}
		
		catch(ArithmeticException f) {
			System.out.println(f.getMessage());
		}
		catch(IndexOutOfBoundsException d) {
			System.out.println("exception caught "+ d.getMessage());
		}
		
		catch(Exception j) {
			System.out.println(j.getMessage());
		}
	}}
