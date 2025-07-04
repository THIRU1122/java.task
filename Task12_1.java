package com.index;
import java.util.Scanner;
public class Task12_1 {
	public static void main(String[]args) {
		Scanner py = new Scanner(System.in);
		System.out.println("Enter the Number of Elements");
		int row = py.nextInt();
		
		System.out.println("enter the second no:");
		int row2 = py.nextInt();
        
		for(int i=1;i<=row;i++) {
			//print spaces
			for(int j=1;j<=row-i;j++) {
			System.out.print(" ");
			}
		for(int k=1;k<=i;k++) {
		System.out.print(i+" ");
		}
		System.out.println();
		}
		for(int i =row2-1;i>=1;i--) {
			for(int j=0;j<row2-i;j++) {
				
				System.err.print(" ");
				
			}
			
			for(int k =0; k<i;k++) {
				System.out.print(i+" ");
			}
			System.out.println();
		}
		
		py.close();
	}

}