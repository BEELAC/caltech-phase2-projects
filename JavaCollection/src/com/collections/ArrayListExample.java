package com.collections;

import java.util.ArrayList;

class Product{	
	String name;
	int pid;
	int price;
	int quantity;
	
	public Product() {
		
	}

	public Product(String name, int pid, int price, int quantity) {
		this.name = name;
		this.pid = pid;
		this.price = price;
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return "Product [name=" + name + ", pid=" + pid + ", price=" + price + ", quantity=" + quantity + "]";
	}
}

class User{
	String name;
	String email;
	
	ArrayList<Product> shoppingCart;
	
	public User() {
		
	}

	public User(String name, String email) {
		this.name = name;
		this.email = email;
		shoppingCart = new ArrayList<Product>();
	}
	
	void addProductToCart(Product product){
		product.quantity++;
		shoppingCart.add(product);
	}
	
	void increment(Product product) {
		int idx = shoppingCart.indexOf(product);
		
		shoppingCart.get(idx).quantity++;
	}
	
	void decrement(Product product) {
		int idx = shoppingCart.indexOf(product);
		
		if(idx > 0) {
			shoppingCart.get(idx).quantity--;
		}
	}
	
	void removeProductFromCart(Product product) {
		int idx = shoppingCart.indexOf(product);
		shoppingCart.remove(idx);
	}
	
	void showProductsInCart() {
		System.out.println("Listing products for " + name);
		
		for(Product product : shoppingCart) {
			System.out.println((product));
		}
		System.out.println();
	}
	
	void checkoutFromCart() {
		System.out.println("Checking out for " + name);
		
		int total = 0;
		
		for(Product product : shoppingCart) {
			System.out.println(product);
			total += (product.price * product.quantity);	
		}
		
		System.out.println("Dear, " + name + " Please pay: " + total);
		System.out.println();
	}
}

public class ArrayListExample {

	public static void main(String[] args) {
		
		Product p1 = new Product("Adidas AlphaBounce Shoe", 101, 2000, 0);
		Product p2 = new Product("iPhone 11", 201, 60000, 0);
		Product p3 = new Product("Samsung LED TV", 301, 5000, 0);
		Product p4 = new Product("HITACHI Fridge", 401, 80000, 0);
		Product p5 = new Product("Coffee Mug", 501, 200, 0);
		
		User user1 = new User("John", "john123@gmail.com");
		User user2 = new User("Sam", "sam123@gmail.com");
		
		user1.addProductToCart(p1);
		user1.addProductToCart(p2);
		user1.addProductToCart(p3);
		
		user2.addProductToCart(p4);
		user2.addProductToCart(p5);
		
		user1.showProductsInCart();
		user2.showProductsInCart();
		
		user1.increment(p1);
		user1.increment(p3);
		
		user1.showProductsInCart();
		
		user1.decrement(p3);
		user1.showProductsInCart();
		
		user1.removeProductFromCart(p2);
		user1.showProductsInCart();
		
		user1.checkoutFromCart();
		user2.checkoutFromCart();
	}

}
