import java.util.Arrays;

// Single Level Inheritance - one parent and one child
class Parent {
	String firstName;
	String lastName;
	private int wealth;
	
	Parent(){
		firstName = "John";
		lastName = "Watson";
		wealth = 1000000;
		System.out.println("Parent - Object Constructed using Default Constructor");
	}
	
	void showDetails() {
		System.out.println("Parent Details: " + firstName + " " + lastName + " " + wealth);
	}
}

// Inheritance using extends keyword
class Child extends Parent{
	
	String firstName;
	int wealth;
	String companyName;
	
	Child(){
		firstName = "Sam";
		wealth = 50000;
		companyName = "ABC Venture";
		System.out.println("Child - Object Constructed using Default Constructor");
	}
	
	void showDetails() {
		super.showDetails();
		System.out.println("Child Details: " + firstName + " " + lastName + " " + wealth + " " + companyName);
	}
}

class Product{
	int id;
	String name;
	String description;
	int price;
	String brand;
	
	Product(){
		
	}
	
	
	public Product(int id, String name, String description, int price, String brand) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.price = price;
		this.brand = brand;
	}


	void showProduct() {
		System.out.println("**********Product Details**********");
		System.out.println(id + " " + name);
		System.out.println(description);
		System.out.println(price + " " + brand);
		System.out.println("***********************************");
	}
}

// Hierarchal Inheritance - one parent - many children
class Shoe extends Product{
	int[] sizes;
	String[] colors;
	
	Shoe(){
		
	}

	public Shoe(int id, String name, String description, int price, String brand, int[] sizes, String[] colors) {
		super(id, name, description, price, brand);
		this.sizes = sizes;
		this.colors = colors;
	}
	
	void showShoe(){
		showProduct();
		for(int size : sizes) {
			System.out.print(size + " ");
		}
		System.out.println();
		for(String color : colors) {
			System.out.print(color + " ");
		}
	}
	
}

class TV extends Product{
	int screensize;
	String color;
	String ledTechnology;
	
	TV(){
		
	}

	public TV(int id, String name, String description, int price, String brand, int screensize, String color, String ledTechnology) {
		super(id, name, description, price, brand);
		this.screensize = screensize;
		this.color = color;
		this.ledTechnology = ledTechnology;
	}

}

class MobilePhone extends Product{
	int ram;
	int storage;
	String os;
	
	MobilePhone(){
		
	}

	public MobilePhone(int id, String name, String description, int price, String brand, int ram, int storage, String os) {
		super(id, name, description, price, brand);
		this.ram = ram;
		this.storage = storage;
		this.os = os;
	}
	
	
}

// Rule 1 - Before the object of a child object of parent is constructed in memory
// Rule 2 - As a child, it can access the attributes and methods of a parent, only if the child doesn't have it's own
// Rule 3 - If the parent has any property marked as private, it will not be accessible by the child

public class WhatIsInheritance {

	public static void main(String[] args) {
		
//		Parent parent = new Parent();
//		parent.showDetails();
		
		Child child = new Child();
		child.wealth = child.wealth - 50000;
		child.showDetails();
		
		Shoe shoe = new Shoe(1, "Adidas Samba Shoe", "Its a running shoe", 10000, "Adidas", new int[]{200, 300, 400}, new String[]{"red", "yellow", "black"});
		shoe.showShoe();
	}
}
