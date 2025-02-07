package com.tnsif.interfacedemo;

public interface Bank {

	public default float rateofintrest() {
		
		return 9.7f;
	}
	
	public static void main(String[] args) {
		Bank b=(Bank) new RBI();
		System.out.println("get rate of intresent "+b.rateofintrest());

	}

}

