package models;

import java.util.HashMap;
import java.util.Map;

public class ShoppingCart {
	private Map<Product, Integer> items;
	
	public ShoppingCart() {
		items = new HashMap<Product, Integer>();
	}
	
	public void addItem(Product item) {
		// TODO
	}
	
	public void removeItem(Product item) {
		// TODO
	}
	
	public void emptyCart() {
		// TODO
	}
	
	public int getTotalItemCount(){
		// TODO
		return 0;
	}
	
	public double getTotalPrice() {
		// TODO
		return 0.0;
	}
	
	public Map<Product, Integer> getItems() {
		return items;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
}
