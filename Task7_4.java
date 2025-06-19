package com.index;

class Shape{

	
	
	public void getPerimeter() {
		
		System.out.println("perimeter of the circle :");
		
	}
	public void getArea(double r) {
		
		System.out.println("circle of the area:");
	}
	
}

class Thiru extends Shape{
	double r = 9.8;
	public void getPerimeter() {
		double perimeter = 2*Math.PI*r;
		System.out.println("the perimeter of circle is:"+perimeter);
	}
	
	public void getArea() {
		double area= Math.PI*r*r;
		
		System.out.println("the circle of area is :"+area);
	}
	
	
}

public class Task7_4 {

	public static void main(String[] args) {
		
		Thiru obj= new Thiru();
		
		obj.getPerimeter();
		obj.getArea();		
		

	}
	
}


