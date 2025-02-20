package com.tnsif.lambdaexpression;

public class Parameterdemo {
	public static void main(String[] args) {
		
	Square t=(a)->{return(a*a);};
	System.out.println("Square of a number "+t.calculate(2));
	}


}
