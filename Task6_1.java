package com.index;

public class Task6_1 {
	
	static int a=10;
	static int b= 30;
	
	int c= 4;
	
	
	// static method to add and b  
	static void add() {
		int result = a+b;
		System.out.println("adding of a and b is:"+result);
	}
	
	static void multi() {
		int result = a*b;
		System.out.println("multi of a and b is:"+result);
	}
	
	//NON static method
	void divide() {
		int result = a/c;
		System.out.println("dividing of a  and c is :"+result);
	}
	
	

	public static void main(String[] args) {
		
		add();
		multi();   // Call static methods directly
		
		
	      // Create an object to call non-static method
		
		Task6_1 obj = new Task6_1();
		obj.divide();
		
		
		

	}

}
\\