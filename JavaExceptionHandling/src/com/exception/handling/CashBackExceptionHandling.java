package com.exception.handling;

import java.util.Scanner;

public class CashBackExceptionHandling {

	public static void main(String[] args) {
		
		int[] cashbacks = {100, 20, 30, 80, 90, 66, 75, 45, 25};
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter your lucky number: ");
		int luckyNumber = scanner.nextInt();
		scanner.close();
		int cashbackEarned = 0;
		try {
			cashbackEarned = cashbacks[luckyNumber];
		}
		catch(ArrayIndexOutOfBoundsException ae) {
			System.out.println("The exception occured is: " + ae);
		}
		finally {
			if(cashbackEarned == 0) {
			System.out.println("The entered lucky number: " + luckyNumber + " does not exist.");
			}
		}
		
		System.out.println("Thank you for your participation. You have earned cashback of $" + cashbackEarned);
		
		System.out.println("Cashback App Finished.");

	}

}
