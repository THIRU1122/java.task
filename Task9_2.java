package com.index;

public class Task9_2 {

	public static void main(String[] args) {
		
		String [] str1= {"apple","Orange","blueberry","mango","watermelon"};
        String [] str2= {"green apple","mango","watermelon","walnet","pappaya","whiteApple"};
        
        
       for(int i= 0;i < str1.length;i++) {
    	   for(int j=0;j< str2.length;j++) {
    		   if(str1[i].equals(str2[j])) {//for string using (.equlas)
    			   System.out.println(str1[i]);
    		   }
    	   }
       }
        
      
        }
        
	}


