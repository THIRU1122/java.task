package com.index;

abstract class Marks{
	 abstract double Getpercentage();
		
}

class classA extends Marks{
	public int tamil,maths,science;
	
	public  classA (int t,int m,int s) {
		this.tamil=t;
		this.maths=m;
		this.science=s;
		
	}
	 double Getpercentage() {
		double totl = tamil+maths+science/3;
		return totl;
	}
}

class classB extends Marks{
	
	private int english,social,tamil,science;
	
	public classB(int e,int s,int t,int se) {
		
		this.english=e;
		this.social=s;
		this.tamil=t;
		this.science=se;
		
	}
	double Getpercentage(){
		
		double total = tamil+science+social+english/4;
		return total;	
	}	
}


public class Task_14_1 {

	public static void main(String[] args) {
		
		classA ST1 = new classA(60,58,79);
		classB ST2 = new classB(60,76,90,86);
		
		System.out.println("the student of class A is:"+ST1.Getpercentage());
		System.out.println("the student of class B is:"+ST2.Getpercentage());
	}

}

