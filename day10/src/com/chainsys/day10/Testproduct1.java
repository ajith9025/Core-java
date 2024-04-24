package com.chainsys.day10;

import java.util.Scanner;

public class Testproduct1 {
	@SuppressWarnings({ "static-access", "unused" })

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		GroceryApp groceryapp = new GroceryApp();

		System.out.println("Welcome to all the user of  this GroceryApp");
		System.out.println();
		System.out.println("1)----------Login page----------\n2)----------Signup page----------");
		int n = sc.nextInt();
		if (n == 1) {
			System.out.println();
			System.out.println("Enter the user name:");
			String userName = sc.next();
			while (true) {
				if (userName.equals("ajith@123")) {
					System.out.println("valid");
					System.out.println("Enter the password:");
					String password = sc.next();

					double items = 3;
//				while (items > 2) {
//					System.out.println("we only have 2 items ");
//					items = sc.nextDouble();
//				}
					System.out.println("choice the items");
					System.out.println("1.snacks");
					System.out.println("2.vegetable");
					System.out.println("3.fruits");
					int choice = sc.nextInt();

					switch (choice) {
					case 1:
						System.out.println("snacks");
						GroceryApp.snacks();
						break;
					case 2:
						System.out.println("vegetable");
						GroceryApp.vegetable();
						break;
					case 3:
						System.out.println("fruits");
						GroceryApp.fruits();
						break;

					}
					System.out.println("add to card:" + choice);
					System.out.println("Enter the total qty:");
					int qty = sc.nextInt();
					System.out.println("Enter the price Rs:");
					int price = sc.nextInt();
					System.out.println("Enter the productId:");
					int productId = sc.nextInt();

					System.out.println("Select the payment mode");
					System.out.println("1.online cash");
					System.out.println("2.cash on delivery");
					System.out.println();
					int paymentmode = sc.nextInt();

					switch (paymentmode) {
					case 1:
						System.out.println("online cash");
						break;

					case 2:
						System.out.println("cash on delivery");

						break;

					}
					System.out.println("Enter the Review");
					sc.nextLine();
				    String review = sc.nextLine();
				    
			        
					

					groceryapp.purchase(items, qty, price);
					groceryapp.purchase(productId, review);
					int totalPrice = 0;
					groceryapp.purchase(price, qty, totalPrice);
					break;

				} else {
					System.out.println("Invaid(add the special character and numbers)");

					userName = sc.next();

				}
			}

		}
		if (n == 2) {
			System.out.println("Enter the first name:");
			String a = sc.next();
			System.out.println("Enter the second name:");
			String b = sc.next();
			System.out.println("Enter the email:");
			String c = sc.next();
			System.out.println("Enter the password:");
			int d = sc.nextInt();
			System.out.println("Enter the conform password:");
			int e = sc.nextInt();
			System.out.println("Signup successfully");
		}

		System.out.println();
		System.out.println("Thanks for visiting  the GroceryApp");

		sc.close();
	}

}
