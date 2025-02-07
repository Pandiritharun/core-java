package com.tnsif.abstraction;

public  class Square extends Shape {
	private float side;
	
	//const
	public Square() {
		side=2.0f;
		}
	
	public Square(float side) {
		this.side=side;
		}
	

	@Override
	public String toString() {
		return "Square [side=" + side + "]";
	}

	@Override
	void calarea() {
		// TODO Auto-generated method stub
		super.area=side*side;
	}
	public static void main(String[] args) {
		//	Square s=new Square();
			
			Shape p=new Square(8.0f);
			System.out.println(p);
			p.calarea();
			p.show();
		}
}
