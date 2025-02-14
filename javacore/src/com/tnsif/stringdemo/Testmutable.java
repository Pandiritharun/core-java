package com.tnsif.stringdemo;

public class Testmutable {
	public static void main(String[] args) {
	String s="dhoni";
		s.concat("tendulkar");
		
		System.out.println(s);
		s=s.concat("tendulkar");
		System.out.println(s);
	}
}
