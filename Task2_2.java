package com.index;

import java.util.Scanner;

//to print the number of days from the month

public class Task2_2 {

	public static void main(String[] args) {
		
		Scanner day = new Scanner(System.in);
		
		System.out.println("Enter the month:");
		int month = day.nextInt();
		System.out.println("the month this:"+month);
		
		System.out.println("Enter the year:");
		int year = day.nextInt();
		System.out.println("the year this:"+year);
		
		//logical
		
		int days =0;
		
		if ((month == 1) || (month == 3) || (month == 5) ||  (month == 7) || (month == 8) || (month == 10) || (month == 12)) {
			days = 31;
		} if ((month == 4) || (month == 6) || (month == 9) || (month == 11)){
			days = 30;
		 if (month == 2) {
			if(month % 4==1 ) {
				days=29;
			}
		}if (month >=13 ){
			System.out.println("Invalid month number");
			day.close();
			return;
		}
		
		System.out.println("number of days:"+days);	
		day.close();
	

	}

}
