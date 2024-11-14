package com.simplilearn.oops;

// by default all the methods in the interface are public and abstract in nature
interface GooglePays{
	
	// non-abstract method
	default void payFromGoogle(int amount) {
		System.out.println("[GooglePay] Amount Paid: " + amount);
	}
	
	// abstract methods
	public abstract void onSuccess(int code, String message);
	void onFailure(int code, String message);
	
}


interface ApplePay{
	
	// non-abstract method
	default void payFromApple(int amount) {
		System.out.println("[ApplePay] Amount Paid: " + amount);
	}
	
	// abstract methods
	void onSuccess(String message);
	void onFailure(String message);
	
}


class FoodDeliveryApp implements GooglePays, ApplePay{

	@Override
	public void onSuccess(int code, String message) {
		System.out.println("[FDA] Payment recieved. We will deliver the order soon... " + code + " " + message);
		
	}

	@Override
	public void onFailure(int code, String message) {
		System.out.println("[FDA] Payment failed. Please try again... " + code + " " + message);
		
	}

	@Override
	public void onSuccess(String message) {
		System.out.println("[FDA] Payment recieved. We will deliver the order soon... " + " " + message);
		
	}

	@Override
	public void onFailure(String message) {
		System.out.println("[FDA] Payment failed. Please try again... " + " " + message);
		
	}
	
}


public class AbstractionWithInterfaces {

	public static void main(String[] args) {
		
		GooglePays googleref = new FoodDeliveryApp();
		googleref.payFromGoogle(5000);
		googleref.onSuccess(200, "Order Recieved");
		
		ApplePay appleref = new FoodDeliveryApp();
		appleref.payFromApple(3000);
		appleref.onSuccess("Order Recieved");

	}

}
