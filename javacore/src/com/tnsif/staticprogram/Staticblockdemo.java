package com.tnsif.staticprogram;

public class Staticblockdemo {
	
	static {
		System.out.println("welcome to session");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("welcome to java");
	}
	public class Finalvariable {
		final int f=7;
		final static int n;
		void change() {
			//n=8;
		}
		static {
			n=2;
		}
	}

}
