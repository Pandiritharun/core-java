package com.tnsif.staticprogram;

public class Student {
	int roll;
	String name;
	static String college="IBB";
	 
	static void change() {
		college="tkr";
	}
	Student(int r,String s){
		roll=r;
		name=s;
	}
	void display() {
		System.out.println(roll+" "+name+" "+college);
	}

	public static void main(String[] args) {
		Student s1=new Student(1,"sai");
		s1.display();
}

}
