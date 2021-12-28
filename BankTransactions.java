package com.BankTransactions;

public class BankTransactions extends InvalidArgumentException{
	
	BankTransactions(String str2) {
		super(str2);
		// TODO Auto-generated constructor stub
	}
	
	
	private double bal;
	

	public double getBal() {
		return bal;
	}
	
	public void depositMoney(double amount) {
		bal +=  amount;
	}
	public void withdraw(double amount) {
		
		try {
			if (amount < bal) {
				bal -= amount;
			}
			else {
				throw new InvalidArgumentException("Amount entered exceeds the total balance");

			}
			
						
		}
		catch(InvalidArgumentException ex){
			System.out.println("Catch Block") ;
			System.out.println(ex) ;
		}
	}
	
}
