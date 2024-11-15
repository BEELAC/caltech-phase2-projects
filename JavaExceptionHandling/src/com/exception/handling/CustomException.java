package com.exception.handling;


// In Java, all the exceptions are the children of Exception Class
// Hierarchy:
// Throwable
// 	  Exception
//		RuntimeException - unchecked exceptions: cannot be checked during compile time. only unchecked exceptions in Java
//			- ArrayIndexOutOfBounds
//			- NullPointerException
//			- ArithmeticException
//		IOException - checked exceptions: can be checked during compile time.
//			- FileNotFoundException
//		SQLException
//	  Error

public class CustomException {

	public static void main(String[] args) throws InvalidPhoneNumberException {
		
		// here InterruptedException is also a checked exception because we can check it and apply
		// try catch accordingly during compile time
//		try {
//			Thread.sleep(3000);
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
		
		String phone = "+1-9546668877";
		String email = "abc123@gmail.com";
		
		if(phone.isEmpty()) {
			InvalidPhoneNumberException ipn = new InvalidPhoneNumberException("Phone number can't be empty");
			throw ipn;
		}
		
		if(email.isEmpty()) {
			InvalidEmailException iem = new InvalidEmailException("Email can't be empty");
			throw iem;
		}
		
	}
}

// Checked Custom Exception because it is a child of Exception
class InvalidPhoneNumberException extends Exception{

	public InvalidPhoneNumberException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}
}

// Unchecked Custom Exception because it is a child of RuntimeException
class InvalidEmailException extends RuntimeException{
	
	public InvalidEmailException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}
}

