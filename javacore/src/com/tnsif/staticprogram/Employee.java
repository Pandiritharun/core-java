package com.tnsif.staticprogram;

public class Employee {
	
	int id;
	String name;
	static String college="tkr";
	
	Employee(int n,String m) {
		id=n;
		name=m;
	}
	void display() {
		System.out.println(id+" "+name+" "+college);
	}
	public static void main(String[] args) {
	Employee d=new Employee(1, "tharun");
	Employee p=new Employee(2, "sai");
			d.display();
			p.display();
			
}

}
