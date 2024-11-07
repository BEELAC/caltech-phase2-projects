package com.simplilearn.oops;

class Cab{
	
	int baseFare;
	
	Cab(){
		baseFare= 50;
		System.out.println("Cab Object Constructed...");
	}
	
	void bookCab(String from, String to) {
		System.out.println("Cab booked from: " + from + " to: " + to + " with base fare: " + baseFare);
	}
}

// let's define the hierarchy
class miniCab extends Cab{
	
	boolean isStreamingAvailable;
	
	miniCab(){
		baseFare += 30;
		isStreamingAvailable =  true;
		System.out.println("miniCab Object Constructed...");
	}
	
	void bookCab(String from, String to) {
		System.out.println("Mini Cab booked from: " + from + " to: " + to + " location, Please pay: " + baseFare);
		if(isStreamingAvailable) {
			System.out.println("On the way you can stream the videos on the tab placed in front of you.");
		}
	}
}

class sharedCab extends Cab{
	
	int noOfPeople;
	
	sharedCab(){
		baseFare -= 20;
		noOfPeople = 4;
		System.out.println("sharedCab Object Constructed...");
	}
	
	void bookCab(String from, String to) {
		System.out.println("Shared Cab booked from: " + from + " to: " + to + " location, Please pay: " + baseFare);
		System.out.println("On the way you will share the cab with " + noOfPeople + " passengers.");
	}
}

class luxuryCab extends Cab{
	
	int softDrinks;
	int chips;
	
	luxuryCab(){
		baseFare += 50;
		softDrinks = 5;
		chips = 5;
		System.out.println("luxuryCab Object Constructed...");
	}
	
	void bookCab(String from, String to) {
		System.out.println("Luxury Cab booked from: " + from + " to: " + to + " location, Please pay: " + baseFare);
		System.out.println("On the way you can enjoy soft drinks and chips from the given number of: " + softDrinks + " soft drinks and " + chips + " chips.");
	}
}

class carBookingApp{
	
	static Cab book(int type) {
		Cab cab = null;
		if(type == 1) {
			cab = new miniCab();
		}
		else if(type == 2) {
			cab = new sharedCab();
		}
		else if (type == 3) {
			cab = new luxuryCab();
		}
		else {
			System.out.println("Invalid selection...");
		}
		return cab;
	}
}

public class RuntimePolymorphism {

	public static void main(String[] args) {
		
//		Cab cab;
//		cab = new Cab();
//		cab.bookCab("Home", "Work");
		
//		cab = new miniCab();
//		cab.bookCab("Home", "Work");
		
//		cab = new sharedCab();
//		cab.bookCab("Home", "Work");
		
//		cab = new luxuryCab();
//		cab.bookCab("Home", "Work");
		
		Cab cab = carBookingApp.book(3);
		cab.bookCab("Home", "Work");
	}

}
