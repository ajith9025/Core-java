package com.chainsys.day10;

import java.util.Scanner;

public class TestProduct {



	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		GroceryApp groceryapp = new GroceryApp();

		System.out.println("Welcome to all the user of  this APP");
		System.out.println("Enter the user name:");
		String username = sc.next();
		System.out.println("Enter the password:");
		String password = sc.next();
		System.out.println("Enter the How many items:");
		double items = sc.nextDouble();
		System.out.println("Enter the total qty:");
		int qty = sc.nextInt();
		System.out.println("Enter the price Rs:");
		int price = sc.nextInt();
		System.out.println("Enter the productId:");
		int productId = sc.nextInt();
		System.out.println("Enter the productName:");
		String ProductName = sc.next();
		
		System.out.println("Thanks for visiting  the GroceryApp");

		groceryapp.purchase(username);
		groceryapp.purchase(items, qty, price);
		groceryapp.purchase(productId, ProductName);
		int totalPrice = 0;
		groceryapp.purchase(price, qty, totalPrice);

		sc.close();

	}
}











































































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