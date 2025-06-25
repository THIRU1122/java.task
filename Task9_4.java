package com.index;

import java.util.Arrays;///array class

public class Task9_4 { 

	public static void main(String[] args) {
		
		int [] arr1= {1,2,3,4,5,7};
		int [] arr2 = {1,2,3,4,5,7};
		
		if(Arrays.equals(arr1,arr2)) {//we have same length so using Arrays.equals
			
			System.out.println("the arr1 and arr2 are equal");
		}else{
			System.out.println("the arr1 and arr2 are not equal");
		}

	}

}
