package com.index;

public class Task9_1 {

	public static void main(String[] args) {
		
		int [] a1 = {20,30,40,50};
		int target =40;
		
		int index=-1;
		
		for (int i=0;i<a1.length;i++) {
			
			if(a1[i]==target) {
				index=i;
				break;
			}
		}
			
			if(index !=-1) {
				System.out.println("found a index : "+index);
			}else {
				System.out.println("Element not found");
			
		
			
		}

	}

}
