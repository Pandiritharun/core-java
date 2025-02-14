package com.tnsif.constructerdemo;

import java.util.Scanner;

public class Constructor {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the customer name");
		
		String name=sc.next();
		System.out.println("enter the customer id");
		int id=sc.nextInt();
		System.out.println("enter the customer address");
		String address=sc.next();
		
		Constucterdemo c=new Constucterdemo();
		c.setCustumername(name);
		c.setCustomerid(id);
		c.setCustomeradreess(address);
		
		System.out.println(c);
	}
}