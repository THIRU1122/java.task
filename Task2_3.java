package com.index;

import java.util.Scanner;

//odd or even 

public class Task2_3 {

	public static void main(String[] args) {
		
		
		Scanner get = new Scanner(System.in);
		
		System.out.println("Enter the number :");
		int num = get.nextInt();
        System.out.println("The number is :"+num);
        
        //using logical
        
        if ((num % 2 == 0) && (num > 0 || num < 0)) {
        	System.out.println("the number is even:"+num);
        	
        }if ((num % 2 != 0) && (num > 0 || num < 0)) {
        	System.out.println("the number is odd: "+num);
        }
        
        get.close();

	} 

}
