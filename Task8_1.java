package com.index;

public class Task8_1 {
	
	public static void main(String []args) {
		
		
		int [] a1 = {1,2,3,4,5};
		int [] a2 = {1,2,2,7,7};
		 int []  a3 = new int [a1.length+a2.length]; 
		 
		 for(int i=0;i<a1.length;i++) {
			 a3[i] = a1[i];
		 }
		 
		 for(int j=0;j<a2.length;j++) {
			 a3[a1.length + j] =a2[j];
		 }
		 System.out.println("concatenated ARRAY : ");
		 for(int num : a3) {
			 System.out.println(num+" ");
			 
			 
		 }
			 
		
	}

}
