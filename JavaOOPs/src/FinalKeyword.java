
// Final classes can't be inherited
final class PaymentGateway{
	
	// With final keyword this method is now read only
	final void pay(int amount) {
		System.out.println("Payment Gateway Transaction Successful With Amount " + amount);
	}
}

// Child class can't inherit final parent class
class MyPaymentGateway{ //extends PaymentGateway{
	
	// Since parent class has final method we can't override it in the child class
//	@Override
//	void pay(int amount) {
		
		// In my child class I manipulated the behavior of the parent method
//		System.out.println("My Payment Gateway Transaction is Successful With Amount " + amount);
//	}
}


public class FinalKeyword {

	public static void main(String[] args) {
		
		int age = 20; // Regular variable of type integer
		
		System.out.println(age);
		
		age = 40;
		
		System.out.println(age);

		final int score = 90; // Regular variable but it is a read only variable
		
		System.out.println(score);
		
//		score = 100; // Can't modify the value of a final variable
		
		String name; // Empty variable, which has no initialization yet
		name = "John"; // Initialized the empty variable
		System.out.println(name);
		
		name = "Roy"; // Reassigned value
		System.out.println(name);
		
		final String petName; // Empty final variable, which has no initialization yet
		petName = "Germ"; //Initialized the empty variable, giving it it's first and last value
		System.out.println(petName);
		
//		petName = "Bones"; // Can't modify the value of a final variable
	}

}
