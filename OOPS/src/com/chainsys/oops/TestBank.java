package com.chainsys.oops;

import java.util.Scanner;

public class TestBank {
	static String accountname;
	static int accountNumber;
	static String branchname;

	public static void main(String[] args) {
		BankDetails bank = new BankDetails();		
		bank.setAmount(2000);
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the accountName:");
		bank.setAccountName(sc.next());
		System.out.println("Enter the accountNumber:");
		accountNumber = sc.nextInt();
		System.out.println("Enter the branch:");
		branchname = sc.next();
		ABCBank.deposit(2000, bank.getAccountNumber());
		ABCBank.deposit(3000, bank.getAccountNumber(), bank.getAccountName());
	}

}
