package com.BankTransactions;

public class InvalidArgumentException extends Exception {
	String st;
	
	InvalidArgumentException(String str1) {
		st=str1;
	   }
	  
	public String toString() {
	      return ("InvalidArgumentException : " + st);
	   }
	
	
}

