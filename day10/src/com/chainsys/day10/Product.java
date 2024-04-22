package com.chainsys.day10;

public class Product {
	double items;
	int productId;
	String productName;
	int qty;
	int price;
	int totalPrice;

	public double getItems() {
		return items;
	}

	public void setItems(double items) {
		this.items = items;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public int getQty() {
		return qty;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(int totalPrice) {
		this.totalPrice = totalPrice;
	}

	public Product(double items, int productId, String productName, int qty, int price, int totalPrice) {

		this.items = items;
		this.productId = productId;
		this.productName = productName;
		this.qty = qty;
		this.price = price;
		this.totalPrice = totalPrice;
	}

	@Override
	public String toString() {
		return "Product [items=" + items + ", productId=" + productId + ", productName=" + productName + ", qty=" + qty
				+ ", price=" + price + ", totalPrice=" + totalPrice + "]";
	}

}
