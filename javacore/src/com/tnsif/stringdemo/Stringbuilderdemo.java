package com.tnsif.stringdemo;


public class Stringbuilderdemo {
	public static void main(String[] args) {
		
		StringBuilder b=new StringBuilder("welcome");
		
		
	b.append("to java");
	System.out.println(b);
	
	b.insert(2, "hi");
	System.out.println(b);

	b.delete(2, 5);
	System.out.println(b);

	b.reverse();
	System.out.println(b);
}}