package com.tnsif.expectionhandlingg;

public class Test3 {
	public static void main(String[] args) {
		try {
		System.out.println(100/10);
	}
	catch(ArrayIndexOutOfBoundsException f) {
		System.out.println(f.getMessage());
	}
	
	finally {
		System.out.println("hello java");
		
	}
			
}}