package com.index;

import java.util.Scanner;

public class Task3_1 {
	                        //check the number  cube of the number based on the user

	public static void main(String[] args) {
                     
		Scanner math = new Scanner (System.in);
		
		System.out.println("Enter the cube number");
		int number = math.nextInt();
		
		int cube = number * number * number;//cube is given number multupyl by three=if the 
		//cube is 5-cube =5 * 5 * 5*;
		
		System.out.println(number +":number of cube is : " + cube);
		
		math.close();
		
	}

}
