package com.index;

import java.util.Scanner;

public class Task3_3 {

	public static void main(String[] args) {
                            //multiply table using while
		Scanner table = new Scanner (System.in);
		
		
		System.out.println("Enter the table number");
		int num = table.nextInt();
		
		
		int i = 1;
		
		while(i<=20) {
			System.out.println(num+"x"+i+"=" +(num * i));
			i++;
		
		}
		      
	}

}
