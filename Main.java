package com.BankTransactions;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankTransactions bt = new BankTransactions(null);
		bt.depositMoney(5000);
		bt.withdraw(4000);	
		bt.withdraw(2000);
		
		System.out.println(bt.getBal());
	}

}



	