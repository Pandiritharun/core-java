package com.tnsif.interfacedemos;

public class Nestedinterface implements Myinterface.Myinnerinterface{

	@Override
	public void print() {
		System.out.println("inner interface method");
		
	}

}