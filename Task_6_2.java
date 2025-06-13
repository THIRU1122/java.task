package com.index;

public class Task_6_2 {
	private int id;
	private String name,designation;
	
	
	Task_6_2(int i){
		id =i;
	}
	
	
	Task_6_2(int i,String n){
		id=i;
		name=n;
	}
	
	Task_6_2(int i,String n, String d){
		id =i;
		name=n;
		designation = d;
	}
	
	void display() {
		
		System.out.println("the deatils of te employees"+id+","+name+","+designation);
			}

	
	public static void main(String [] args) {
		Task_6_2 c= new Task_6_2(221);
		Task_6_2 c1 = new Task_6_2(221,"karthi");
		Task_6_2 c2 = new Task_6_2(221,"karthi","web-devolper");
		
		c.display();
		c1.display();
		c2.display();
		
	}
}
