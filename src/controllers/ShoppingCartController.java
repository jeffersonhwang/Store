package controllers;

import java.util.*;

import views.ShoppingCartView;
import models.Product;
import models.ShoppingCart;

public class ShoppingCartController {

	private ShoppingCart cart;
	private ShoppingCartView cartView;
	
	public ShoppingCartController(ShoppingCart cart, ShoppingCartView cartView){
		this.cart = cart;
	}
	
	public void addItemToCart(Product item) {
		this.cart.addItem(item);
	}
	
	public void removeItemFromCart(Product item){
		this.cart.removeItem(item);
	}
	
	public Map<Product, Integer> getCartItems() {
		return this.cart.getItems();
	}
	
	public int getTotalItemCount(){
		return this.cart.getTotalItemCount();
	}
	
	public double getTotalCartPrice() {
		return this.cart.getTotalPrice();
	}
	
	public void updateView(Map<Product, Integer> items) {
		for(Product p : items.keySet()) {
			this.cartView.addItem(p.getName(), (int)items.get(p), p.getPrice());
		}
	}
	
}
