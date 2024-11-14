package com.simplilearn.oops.anonymous;

// all the methods present inside the interface class are by default abstract
interface Payment{
	
	// here default helps to convert the by default abstract method to a non-abstract method
	default void pay(int amount) {
	
	}
	
}

interface PaymentCallbacks{
	void onSuccess(String message);
	void onFailure(String message);
}

class Payments implements PaymentCallbacks{

	@Override
	public void onSuccess(String message) {
		System.out.println("Payment Passed: " + message);
	}

	@Override
	public void onFailure(String message) {
		System.out.println("Payment Failed: " + message);
	}
	
}


public class AnonymousClass {

	public static void main(String[] args) {
		
//		PaymentCallbacks ref = new Payments(); 
//		ref.onSuccess("Amount paid 2000.");
//		ref.onFailure("Amount 2000 not processed.");
		 
		
	
//		PaymentCallbacks ref = new PaymentCallbacks(); - not allowed because we are trying to create an object on an interface.
		
		
		// here we are directly creating an object using the PaymentCallbacks interface
		// here new PaymentCallbacks can be considered an Anonymous Class, meaning a Class with no name
		// that's implementing the PaymentCallbacks Interface
		PaymentCallbacks ref = new PaymentCallbacks() {
			
			@Override
			public void onSuccess(String message) {
				System.out.println("Payment Passed: " + message);
				
			}
			
			@Override
			public void onFailure(String message) {
				System.out.println("Payment Failed: " + message);
				
			}
		};
		
		ref.onSuccess("Amount paid 2000");
		ref.onFailure("Amount 2000 not processed.");
	}

}
