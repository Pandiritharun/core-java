package com.tnsif.superkeyword;

public class Childemo extends Parentdemo {
	int a=7;
	void drink() {
		System.out.println("child drink");
	}
	void display() {
		System.out.println(a);
		System.out.println(super.a);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Childemo d=new Childemo();
		d.drink();
		d.display();
		

	}

}
