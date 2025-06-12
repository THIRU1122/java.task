package com.index;

public class BankAccount {
	
	private int AccountNumber;
	private double Balance;
	
	
	public int getAccountNumber() {
		return AccountNumber;
	}
	
	public void setAccountNumber(int AccountNumber) {
		  this.AccountNumber=AccountNumber;
	}
	
	
	public double getBalance() {
		return Balance;
	}
	
	public void setBalance(double Balance ) {
		  this.Balance=Balance;
	}
	

	public static void main(String[] args) {
		
		BankAccount obj = new BankAccount();
		obj.setAccountNumber(345678923);
		obj.setBalance(1000.1234);
		
		System.out.println("the employees account no is:"+obj.getAccountNumber());
        System.out.println("the employees current balance is :"+obj.getBalance());
	}

}
