package com.index;

import java.util.Scanner;

public class Task_4_1 {

	public static void main(String[] args) {
      
		
		Scanner theatre = new Scanner(System.in);
		
		System.out.println("Enter the Screen 1,2,3,4");
		int screen =  theatre.nextInt();
		
			
		
		switch(screen) {
		
		case 1:
			System.out.println("Timing:7Am-10Am-moviename:Thuglife");
			System.out.println("Timing:10.30Am-1pm-moviename:Vettiyan");
			System.out.println("Timing:1.30pm-4pm-moviename:Maari");
			
			break;
			
		case 2:
			System.out.println("Timing:7Am-10Am-moviename:Avengers");
			System.out.println("Timing:10.30Am-1pm-moviename:Fast & Furious");
			System.out.println("Timing:1.30pm-4pm-moviename:Titanic");
			
			break;
			
		case 3:
			System.out.println("Timing:7Am-10Am-moviename:The Lion King");
			System.out.println("Timing:10.30Am-1pm-moviename:Fast x");
			System.out.println("Timing:1.30pm-4pm-moviename:DD Next Level ");
			
			break;
			
		case 4:
			System.out.println("Timing:7Am-10Am-moviename:Tourist family");
			System.out.println("Timing:10.30Am-1pm-moviename:Cars");
			System.out.println("Timing:1.30pm-4pm-moviename:Final Destination");
			
			break;
			
			default:
				System.out.println("Please Enter The Valid Screen Number: ");
			
			
			
	
		}
	
	}

}
