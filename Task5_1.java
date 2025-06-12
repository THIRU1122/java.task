package com.index;

public class Task5_1 {
	private int id;
	private String name;
	private String location;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
	    this.id=id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name=name;
	}
	
	public String getLocation() {
		return location;
	}
	
	public void setLocation(String location) {
		this.location=location;
	}
	

	public static void main(String[] args) {
		
		Task5_1 obj = new Task5_1();
		obj.setId(221);
		obj.setName("dinesh");
		obj.setLocation("thiruvallur");
		
		System.out.println("the new id is :"+obj.getId());
		System.out.println("the new name is :"+obj.getName());
		System.out.println("the new location is :"+obj.getLocation());
		
		
		
		
		

	}
	

}
