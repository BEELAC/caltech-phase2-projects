package com.simplilearn.oops;

class CA{
	void show() {
		System.out.println("This is my CA class.");
	}
}

class CB extends CA{
	void show() {
		System.out.println("This is my CB class.");
	}
	
	void hello() {
		System.out.println("Hello I am CB class.");
	}
}


public class PolymorphicFunctionality {

	public static void main(String[] args) {
		
		CA ca = new CA();
		ca.show();
		
		CB cb = new CB();
		cb.show();
		cb.hello();
		
//		CA caRef = null;
//		caRef = new CB(); // Polymorphic Statement - parent reference can point or hold the child object/hashcode.
		
//		CB cbRef = null;
//		cbRef = new CA(); // Not possible - child reference can't point or hold the parent object/hashcode.
		
		//Single-line Polymorphic Statement
		CA caRef = new CB();
		
		caRef.show(); // here method overriding comes into play with the Polymorphic Statement.
					  // here show method is overridden by the child class.
		
//		caRef.hello(); // here we can't execute the hello method using the parent's ref as this method is not
					   // overridden by the child
		
		CB cbRef = (CB)caRef; // here we are performing downcasting - we are converting the type of the parent
							  // reference to the child reference
		
		cbRef.hello();
		
	}

}
