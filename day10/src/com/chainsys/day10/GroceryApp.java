package com.chainsys.day10;

public class GroceryApp {
	public void purchase(String userName) {
		System.out.println("Enter the username:" + userName);
	}

	public static void purchase(double items, int qty, int price)

	{
		System.out.println("How many items: " + items + "  TotalQty: " + qty + " Price of Rs: " + price);
	}

	public static void purchase(int productId, String productName) {
		System.out.println("Enter the product id: " + productId + " Enter the product name: " + productName);
	}

	public static void purchase(int price, int qty, int totalPrice) {
		totalPrice = qty * price;
		System.out.println("totalPrice:" + totalPrice);
		if (totalPrice < price) {
			System.out.println("valid");
		} else
			System.out.println("Invalid");

	}

}
