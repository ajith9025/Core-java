package com.chainsys.oops;

public class ABCBank1 extends ABCBank {
	@Override
	public void deposit(int amount, int accountNumber) {
		int balance = 3000;
		if (amount < balance) {
			int gst=(int)((balance+amount)*0.09);
			balance = balance + amount-gst;
			System.out.println("Available current balance: " + balance + " deduction of gst: " + gst );
		} else
			System.out.println("Invalid balance");

	}
	
}

	
	





