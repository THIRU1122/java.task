package com.index;

public class Task4_2 {
	int id;
	String name,desgination,location,details;
	
	public Task4_2(int i,String n,String d,String l,String d1){
		
		 id=i;
		 name=n;
		 desgination = d; 
		 location =l;
		 details = d1;
		
		
	}
	
	public void display() {
		
		System.out.println("the employee id is :"+id);
		System.out.println("the employee name is:"+name);
		System.out.println("the employee desgination:"+desgination);
		System.out.println("the employee of location is:"+location);
		System.out.println("the employee of details is: "+details);
	}
	
	


	public static void main(String[] args) {
		
		Task4_2 E1= new Task4_2(101,"thiru","webdeveloper","arakkonam","b.com,JAVA developer");
		Task4_2 E2 = new Task4_2(102,"karthi","AI developer","Kancipuram","AI & ML(ENG)");
		Task4_2 E3 = new Task4_2(103,"durai","excel supervisor","Tenkasi","BCA");
		Task4_2 E4 = new Task4_2(104,"Venkatesh","Manager","Ashok nagar","B.COM(CA)");
		E1.display();
		E2.display();
		E3.display(); 
		E4.display();
		
		
		
	}
	

}
