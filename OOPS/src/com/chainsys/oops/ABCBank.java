package com.chainsys.oops;

public class ABCBank {
	
	public static void deposit(int amount, int accountNumber) {
		int balance = 3000;
		if (amount < balance) {
			balance = balance + amount;
			System.out.println("Available current balance: " + balance);
		} else
			System.out.println("Invalid balance");

	}

	public static void deposit(int amount, int accountNumber, String accountName) {
		int balance = 4000;
		if (amount < balance) {
			balance = balance + amount;
			System.out.println("Available current balance is: " + balance + " Amount is:" + amount
					+ " Your accountname is:" + accountName);
		} else
			System.out.println("Invalid balance");

	}
}
