package com.index;
import java.util.Arrays;
import java.util.List;
import java.util.TreeSet;

public class Task15_1 {

	public static void main(String[] args) {
		
		TreeSet<Integer> set =  new TreeSet<>();
		set.add(2);
		set.add(4);
		set.add(6);
		set.add(8);
		
		System.out.println("befor adding the set"+set);
		
		TreeSet<Integer> result = new TreeSet<>();
		result.addAll(Arrays.asList(10,12,6,8));
		System.out.println("the are the final result :"+result);
		
		
		result.addAll(set);
		System.out.println("these are the final result :"+result);
	}

}
