package com.tnsif.streamapi;

import java.util.function.Predicate;
import java.util.function.Supplier;

// demo functional interfaces

public class SPCdemo {
	// predicate : takes one input , return boolean
	public static void main(String[] args) {
		
	
	Predicate<Integer> iseven=number->number%2==0;
	{
	int testnumber=11;
	if(iseven.test(testnumber)) {
		System.out.println(testnumber+"is even");
	}
	else {
		System.out.println(" is odd");
	}
	
}
}
}