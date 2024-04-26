package com.chainsys.day10;

import java.util.Scanner;

public class GroceryApp {


	public static void purchase(String userName) {
		System.out.println();
		if (userName.matches("^[A-Za-z]+[@#$%!]+[0-9]+$")) {
			System.out.println("valid ");
		} else
			System.out.println("Invalid");

	}

	public static void purchase(double items, int qty, int price)

	{
		System.out.println();
		System.out.println("How many items: " + items + "  TotalQty: " + qty + " Price of Rs: " + price);
	}

	public static void purchase(int productId, String review){
		
		System.out.println("Product id: " + productId + " Review: " + review );

	}

	public static void purchase(int price, int qty, int totalPrice) {
		totalPrice = qty * price;
		System.out.println("totalPrice:" + totalPrice);
		if (totalPrice > price) {
			System.out.println("valid");
		} else
			System.out.println("Invalid");

	}
	public static void option()
	{
		Scanner sc = new Scanner(System.in);
		char option= sc.next().toLowerCase().charAt(0);

		switch (option) {
		case 'a':
			System.out.println("Home");
			break;
		case 'b':
			System.out.println("About us");
			break;
		case 'c':
			System.out.println("Contacts");
			break;
		case 'd':
			System.out.println("Products");
			break;
		}
	}

	public static void snacks() {
		Scanner sc = new Scanner(System.in);
		System.out.println("a.bingo");
		System.out.println("b.biscuits");
		System.out.println("c.cholates");
		char choice = sc.next().toLowerCase().charAt(0);

		switch (choice) {
		case 'a':
			System.out.println("bingo");
			break;
		case 'b':
			System.out.println("biscuits");
			break;
		case 'c':
			System.out.println("cholates");
			break;
		}
	}

	public static void vegetable() {
		Scanner sc = new Scanner(System.in);
 		char choice = sc.next().toLowerCase().charAt(0);
		switch (choice) {
		case 'a':
			System.out.println("potato");
			break;
		case 'b':
			System.out.println("tomato");
			break;
		case 'c':
			System.out.println("carrot");
			break;
		}
	}

	public static void fruits() {
		Scanner sc = new Scanner(System.in);
		char choice = sc.next().toLowerCase().charAt(0);
		switch (choice) {
		case 'a':
			System.out.println("mango");
			break;
		case 'b':
			System.out.println("orange");
			break;
		case 'c':
			System.out.println("apple");
			break;
		}
	}

	public static void signup(String signup) {
		
			System.out.println("Signup successfully");
	}
		
	public static void login(String login)
	{
		System.out.println("Login successfully");
	}
	
}

	



