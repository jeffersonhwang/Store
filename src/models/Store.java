package models;

import java.util.ArrayList;

public class Store {

	private ShoppingCart cart = new ShoppingCart();
	ArrayList<Product> products = new ArrayList<Product>();
	
	public ShoppingCart getCart() {
		return cart;
	}
	
	public ArrayList<Product> getProducts() {
		return products;
	}
	
	public void setProducts(ArrayList<Product> products) {
		this.products = products;
	}
	
//	public void addProduct()
}
