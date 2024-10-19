package test;

public class Operators {
	
	public static void main(String[] args) {
		
		// Arithmetic Operators
		// +, -, *, /, %
		
		int a = 20;
		int b = 10;
		
		System.out.println("a + b = " + (a + b));
		System.out.println("a - b = " + (a - b));
		System.out.println("a * b = " + (a * b));
		System.out.println("a / b = " + (a / b));
		System.out.println("a % b = " + (a % b));
		
		// Comparison Operators
		// >, <, >=, <=, ==, !=
		
		a = 30;
		b = 30;
		
		System.out.println("a > b = " + (a > b));
		System.out.println("a < b = " + (a < b));
		System.out.println("a >= b = " + (a >= b));
		System.out.println("a <= b = " + (a <= b));
		System.out.println("a == b = " + (a == b));
		System.out.println("a != b = " + (a != b));
	
		
		// Logical Operators
		// AND: &&, OR: ||, NOT: !
		
		a = 40;
		b = 40;
		
		System.out.println("(a == b) && (a > b) = " + ((a == b) && (a > b)));
		System.out.println("(a == b) || (a > b) = " + ((a == b) || (a > b)));
		System.out.println("!((a == b) && (a > b)) = " + !((a == b) && (a > b)));
		
		// Unary Operators
		// ++(increment: increase by 1), --(decrement: decrease by 1)
		// ~, !
		
		a = 22;
		
		System.out.println("a++ = " + a++); // post increment
		System.out.println("a = " + a); // new value is 23
		System.out.println("a++ = " + a++); // post increment
		System.out.println("a = " + a); // new value is 24
		System.out.println("a-- = " + a--); // post decrement
		System.out.println("++a = " + ++a); // pre increment
		System.out.println("--a = " + --a); // pre decrement
		
		
		a = 10;
		b = -10;
		
		// Doesn't get used much in everyday coding
		System.out.println("~a = " + ~a); // minus of total positive value starting from 0
		System.out.println("~b = " + ~b); //positive of total minus, starts from 1
		
		boolean e = false;
		boolean f = true;
		
		// Posts opposite of original value
		System.out.println("!e = " + !e);
		System.out.println("!f = " + !f);
		
	}

}
