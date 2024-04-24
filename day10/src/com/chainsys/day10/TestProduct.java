 package com.chainsys.day10;

import java.util.Scanner;

public class TestProduct {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		GroceryApp groceryapp = new GroceryApp();

		System.out.println("Welcome to all the user of  this GroceryApp");
		System.out.println();
		System.out.println("1) Login page\n2) Signup page");
		int n = sc.nextInt();
		if (n == 1) {
			System.out.println();
			System.out.println("Enter the user name:");
			String userName = sc.next();
			while(true) {
			if (userName.equals("ajith@123")) {
				System.out.println("valid");
				System.out.println("Enter the  password:");
				String password = sc.next();
				double items = 2;
//				while (items > 2) {
//					System.out.println("we only have 2 items ");
//					items = sc.nextDouble();
//				}
				System.out.println("list of items");
				System.out.println("1.snackes");
				System.out.println("2.vegetable");
				System.out.println("3.fruits");
				System.out.println("choice the items");
				int choice = sc.nextInt();
				System.out.println("1.biscuits");
				System.out.println("2.cholates");
				System.out.println("Enter the total qty:");
				int qty = sc.nextInt();
				System.out.println("Enter the price Rs:");
				int price = sc.nextInt();
				System.out.println("Enter the productId:");
				int productId = sc.nextInt();
				System.out.println("Enter the productName:");
				String productName = sc.next();
				System.out.println("add to card :" + productName);
				
				
				
				System.out.println("Enter the Review");
				String review = sc.next();
				


				groceryapp.purchase(items, qty, price);
				groceryapp.purchase(productId,review);
				int totalPrice = 0;
				groceryapp.purchase(price, qty, totalPrice);
				break;

			} else {
				System.out.println("Invaid(add the special character and numbers)");
				
				 userName = sc.next();

			}
			}

		}
		System.out.println();
		System.out.println("Thanks for visiting  the GroceryApp");

		sc.close();
	}
}




		
		
		
		
		
		
	




























		
//		System.out.println("Enter the How many items:");
//      double items = 2;
//		while (items > 2) {
//			System.out.println("we only have 2 items ");
//			items = sc.nextDouble();
//		}
		/*
		 * System.out.println("list of items"); System.out.println("1.snackes");
		 * System.out.println("2.vegetable"); System.out.println("3.fruits");
		 * System.out.println("choice the items"); int choice=sc.nextInt();
		 * System.out.println("Enter the total qty:"); int qty = sc.nextInt();
		 * System.out.println("Enter the price Rs:"); int price = sc.nextInt();
		 * System.out.println("Enter the productId:"); int productId = sc.nextInt();
		 * System.out.println("Enter the productName:"); String productName = sc.next();
		 * System.out.println("add to card :" + productName);
		 * 
		 * groceryapp.purchase(items, qty, price); groceryapp.purchase(productId,
		 * productName); int totalPrice = 0; groceryapp.purchase(price, qty,
		 * totalPrice);
		 * 
		 * 
		 * 
		 * 
		 * System.out.println();
		 * System.out.println("Thanks for visiting  the GroceryApp");
		 */

	






























































































/*
 * Scanner sc=new Scanner(System.in);
 * System.out.println("Enter the user name:"); String username=sc.next();
 * System.out.println("Enter the Password:"); double password=sc.nextDouble();
 * System.out.println("Enter the items:"); double items=sc.nextDouble();
 * System.out.println("Enter the product id:"); int productId=sc.nextInt();
 * System.out.println("Enter the product name:"); String productName=sc.next();
 * System.out.println("Enter the qty:"); int qty=sc.nextInt();
 * System.out.println("Enter the price:"); int price=sc.nextInt();
 * System.out.println("Enter the total price:"); int tolalprice=sc.nextInt();
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * }
 */