package com.index;//array of objects

class Students  {
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

public class Task11_2 {

	public static void main(String[] args) {
		
		Students[] obj = new Students[5];
		
		obj[0]= new Students("thiru",22,1,"arakkonam","(ANNANAGR)","B.COM(G)","MCA");
		obj[1]=new Students("karthi",22,2,"kanchipuram","AshokNAGAR","AI & ML","MSC");
		obj[2]=new Students("duari",22,3,"tenkasi","AshokNAGAR","AI & ML","MSC");
		obj[3]=new Students("samuvel",22,4,"chennai","AshokNAGAR","AI & ML","MSC");
		obj[4]=new Students("venkatesh",22,5,"ekkattuthaangal","AshokNAGAR","AI & ML","MSC");

		for(Students Stud: obj ) {
			
			if(Stud.id > 3) {
				
				Stud.display();
				
			
			}
	     
		}
		
	}

}
