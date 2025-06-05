package com.index;

import java.util.Scanner;

public class DayTask1_3 {

	public static void main(String[] args) {
		
	 java.util.Scanner crlandpri = new Scanner(System.in);
	 
	 double radius ,area,perimeter;
	 

      System.out.println("Enter the radius:");
      radius = crlandpri.nextDouble();
      System.out.println("the radius is:" +radius);
      
      area = Math.PI * radius * radius;
      perimeter = 2 * Math.PI * radius;
      
      System.out.println("the area is :"+area);
      System.out.println("the perimeter is :"+perimeter);
      
  
      crlandpri.close();

	}

}
