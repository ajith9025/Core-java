package com.chainsys.day10;

public class GroceryApp {
	
	public static void purchase(String userName) {
		System.out.println();
		if (userName.matches("^[A-Za-z]+[#@$%^]+[0-9]+$")) {
			System.out.println("valid ");
		} else
			System.out.println("Invalid");

	}

	public static void purchase(double items, int qty, int price)

	{   System.out.println();
		System.out.println("How many items: " + items + "  TotalQty: " + qty + " Price of Rs: " + price);
	}

	public static void purchase(int productId, String productName) {
		System.out.println("Product id: " + productId + " Product name: " + productName);
	}

	public static void purchase(int price, int qty, int totalPrice) {
		totalPrice = qty * price;
		System.out.println("totalPrice:" + totalPrice);
		if (totalPrice > price) {
			System.out.println("valid");
		} else
			System.out.println("Invalid");

	}

}
