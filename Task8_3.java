package com.index;

public class Task8_3 {

	public static void main(String[] args) {
		
		int [] a= {200,300,400,50,10,5,20,30};
		int min = a[0];
		
		for(int i =0;i<a.length;i++){
			
		if(a[i]<min) {
			min =a[i];
			
		}
		}
		System.out.println(min);

	}

}
