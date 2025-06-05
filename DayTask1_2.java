package com.index;

import java.util.Scanner;

public class DayTask1_1 {

	public static void main(String[] args) {
		
		java.util.Scanner students = new Scanner(System.in);
		String name;
		int roll_no,s1,s2,s3,s4,s5;
		float avg;
		
		System.out.println("enter the name: ");
		name = students.nextLine();
		System.out.println("the name is:"+name);
		
		
		System.out.println("Enter the rollno:");
		roll_no = students.nextInt();
		System.out.println("the roll number is:"+roll_no);
		
		System.out.println("Enter the sub1 mark:");
		s1 = students.nextInt();
		System.out.println("the sub1 value is:"+s1);
		
		System.out.println("enter the sub2 mark:");
		s2 = students.nextInt();
		System.out.println("the sub2 value is:"+s2);
		
		System.out.println("enter the sub3 mark:");
		s3 = students.nextInt();
		System.out.println("the sub3 mark is:"+s3);
		
		System.out.println("enter the sub4 mark:");
		s4 = students.nextInt();
	    System.out.println("the sub4 mark is :"+s4);
	    
	    System.out.println("enter the sub5 mark:");
	    s5 = students.nextInt();
	    System.out.println("the sub5 mark is :"+s5);
	    
	    
	    avg = (s1+s2+s3+s4+s5)/5.0f;
	    
	   System.out.println("average marks is:"+avg);
	   
	    
	    students.close();
	}

}
