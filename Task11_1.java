package com.index;//array of objects

class Students{
	String name;
	int age;
	int id;
	String location;
	String branch;
	String firstdegree;
	String seconddegree;
	
	Students(String n,int a,int i,String l,String b,String f,String s){
		
           this.name= n;
           this.age=a;
           this.id=i;
           this.location=l;
           this.branch=b;
           this.firstdegree=f;
           this.seconddegree=s;      
		
	}
	
	void display() {
		System.out.println("the student name is :"+name+" "+"the st age is :"+age+" "+"the st id is :"+id+" "+"st location is :"+location+" "+
	                      "THE branch is :"+branch+"the st 1st deg is :"+ firstdegree+" "+"the st 2nd deg is :"+seconddegree);
	}
	

}

public class Task11_1 {

	public static void main(String[] args) {
		
		Students[] obj = new Students[2];
		
		obj[0]= new Students("thiru",22,191,"arakkonam","(ANNANAGR)","B.COM(G)","MCA");
		obj[1]=new Students("karthi",22,190,"kanchipuram","AshokNAGAR","AI & ML","MSC");
		
		
		for(int i =0;i<obj.length;i++) {
			obj[i].display();
		}
		
	}

}
