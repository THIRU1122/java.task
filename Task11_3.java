package com.index;


class Navigation {
	String 	dic1;
	
	
	Navigation(String d) {
		this.dic1=d;
	
	}
	
	
	void select() {
		
		System.out.println("the dircetion one is:"+dic1);
		
		
	}
}

public class Task11_3 {

	public static void main(String[] args) {
		
		Navigation [] D1 = new Navigation[4];
		
		D1[0] = new Navigation("East");
		D1[1] = new Navigation("west");
		D1[2] = new Navigation("north");
		D1[3] = new Navigation("south");
		
		for(Navigation side :D1) {
			
			
			if("south".equalsIgnoreCase(side.dic1)){
				
				side.select();	
			}
		}	
		
	
	}

}
