package com.index;

public class Circle {
	
	private float radius;
	
	public float getradius(){
		return radius;
		
	}
	public  void setradius(float radius) {
		this.radius=radius;
		
	}
	
	public double perimeter() {
		return 2*Math.PI * radius * radius;
		
	}
	public double area() {
		return 2 *Math.PI * radius;
	}

	public static void main(String[] args) {
		Circle obj= new Circle();
		obj.setradius(52.5f);
		System.out.println("the radius of the circle is :"+ obj.getradius());
		System.out.println("The Perimeter of Circle is :" +obj.perimeter());
		System.out.println("The Area of the Circle is : " +obj.area());
		
	}

}
