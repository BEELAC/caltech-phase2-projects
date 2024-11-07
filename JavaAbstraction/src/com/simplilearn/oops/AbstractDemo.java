package com.simplilearn.oops;

// An abstract class can have both abstract/non-abstract methods
// We cannot create an object of an abstract class
// All the child classes must override the abstract methods of the parent abstract class
abstract class Cab{
	
	int baseFare;
	
	Cab(){
		baseFare= 50;
		System.out.println("Cab Object Constructed...");
	}
	
	// Abstract methods do not need a body
	abstract void bookCab(String from, String to); 
//	{
//		System.out.println("Cab booked from: " + from + " to: " + to + " with base fare: " + baseFare);
//	}
	
	// Can have a method with a body. Just can't use abstract keyword.
	void display() {
		System.out.println("I am a Cab class");
	}
}

// If using am abstract method, you must override it in the child class
class miniCab extends Cab{
	
	boolean isStreamingAvailable;
	
	miniCab(){
		baseFare += 30;
		isStreamingAvailable =  true;
		System.out.println("miniCab Object Constructed...");
	}
	
	@Override // Good to add for readability.
	void bookCab(String from, String to) {
		System.out.println("Mini Cab booked from: " + from + " to: " + to + " location, Please pay: " + baseFare);
		if(isStreamingAvailable) {
			System.out.println("On the way you can stream the videos on the tab placed in front of you.");
		}
	}
}

public class AbstractDemo {

	public static void main(String[] args) {
		
		Cab cab; //cab is not an object, it's just a reference variable
		
//		cab = new Cab(); // cannot create an object of an abstract class (Cab class is abstract)
//		cab.bookCab("Home", "Work");
		
		cab = new miniCab();
		cab.bookCab("Home", "Work");
	}

}
