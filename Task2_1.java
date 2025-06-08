package com.index;

import java.util.Scanner;
//check the input postive or negative 

public class Task2_1 {

	public static void main(String[] args) {
		
		 Scanner devil = new Scanner(System.in);
		 
		 System.out.println("Enter the number:");
		 int num = devil.nextInt();
		 System.out.println("The number is :"+num);
		 
		 //using logical in this programme;
		 
		 if((num > 0) && !(num < 0)) {
			 
			System.out.println("the number is postive(+)");
		 }
		 else if((num < 0) && !(num > 0)) {
			 System.out.println("the number is negatve(-)");
		 }
		 
		 else if (!(num > 0) && !(num < 0)) {
			 System.out.println("the number is  zero");
		 }
		 
		 devil.close();
		  
		
	}
	

}
