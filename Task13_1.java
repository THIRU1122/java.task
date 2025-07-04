package com.index;

interface Green{
	public void  GetArea();
		
}

class Rectangle implements Green{
	
	
	@Override
	public void GetArea() {
		double w = 200.22;
		double l = 200.33;
		System.out.println("area of rectangle"+w*l);
				
	}
}

class White implements Green{
	

	@Override
	public void GetArea() {
		double r=20.44;
		System.out.println(Math.PI*r);
		
		// TODO Auto-generated method stub
		
	}
}

class Triangle implements Green{
	public void GetArea() {
		double base = 22.3;
		double hieght = 33.4;
		System.out.println(base*hieght/2);
		
	}
}


public class Task13_1 {

	public static void main(String[] args) {
		
		Green S1= new White();
		S1.GetArea();

	}

}
