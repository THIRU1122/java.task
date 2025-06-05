package com.index;

import java.util.Scanner;

    public class DayTask1{

	public static void main(String[] args) {
		
		java.util.Scanner maths =new Scanner(System.in);
		
		int x,y,result;
		System.out.println("enter the first x value");
		x = maths.nextInt();
		System.out.println("the value of x"+x);
		
		
		System.out.println("enter the first y value");
        y = maths.nextInt();
		System.out.println("the value of y is"+y);
		
		result = x + y;
		System.out.println("add"+result);
		
		result = x-y;
		System.out.println("sub"+result);
		
		result = x/y;
		System.out.println("divide"+result);
		
		result = x % y;
		System.out.println("modulse"+result);
		
		result = x * y;
		System.out.println("multi"+result);
		
		
		maths.close();
		
	
		
	     }
	}
		
		
		
	