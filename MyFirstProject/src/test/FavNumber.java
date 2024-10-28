package test;

import java.util.Scanner;

public class FavNumber {
	
	public static void main(String[] args) {
		
		int[][] numList = {
				{8, 28, 7, 10},
				{11, 3, 43, 9},
				{15, 66, 2, 18}
		};
		
		System.out.print("What's Your Favorite Number?");
		System.out.println();
		
		for(int row = 0; row < numList.length; row++) {
			System.out.println();
			for(int num = 0; num < numList[row].length; num++) {
				System.out.print(numList[row][num] + "\t");
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.print("Choose a Row (0, 1, 2):");
		
		Scanner options = new Scanner(System.in);
		System.out.println();
		int choice = options.nextInt();
		System.out.println();
		
		if(choice >= 0 && choice < numList.length) {
			System.out.print("Row " + choice + " : " );
			for(int num : numList[choice]) {
				System.out.print(num + " ");
			}
			System.out.println();
		
		
			System.out.println("What Index From This Row (0 - " + (numList[choice].length - 1) + "): ");
			int numberChoice = options.nextInt();
		
			if(numberChoice >= 0 && numberChoice < numList[choice].length) {
				System.out.println();
				System.out.println("You Chose The Number: " + numList[choice][numberChoice]);
				System.out.println("I Love That Number!");
				
			} else {
				System.out.println("Invalid Index Choice. Please Choose a Valid Index");
			}
			
		} else {
			System.out.println("Invalid Row Choice. Please Enter 0, 1, or 2");
		}
		
		options.close();
	}
}



