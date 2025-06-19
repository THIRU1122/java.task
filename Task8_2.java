package com.index;



public class Task8_2 {
	
	
	
	
	
public static void main(String [] args) {
		

		int[] a = {200,300,500,700,800};
		
		int max=a[0];
		
		for(int i =0 ;i<a.length;i++) {
			
			if(a[i]>max) {
				max=a[i];
			}
	
			
		}
		
		
		System.out.println(max);
		
	}
	
}

