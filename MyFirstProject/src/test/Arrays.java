package test;

import java.util.Scanner;

public class Arrays {

	// An array is a fixed length data structure in java 
	// to store multiple values of same data type	
	
	public static void main(String[] args) {
		
//		System.out.println("*************Single Dimensional Array***********");
//		// lets save some COVID related info
//		int confirmedCases = 431;
//		int recoveredCases = 41313;
//		int deceased = 21;
//		int vaccinated = 54234;
//		
//		// 1st way - here we have declared and initialized a single dimensional array.
//	 	int covidDetails[] = {431, 41313, 21, 54234};
//		
//		// lets save some football world cup info
//		int noOfTeamsParticipated = 50;
//		int noOfTournaments = 25;
//		int noOfTeamsQualified = 20;
//		int yearOfPlay = 2024;
//		int totalGoalsByBestPlayer = 30;
//		
//		// 2nd way
//		int[] footballWorldCupDtls = {50, 25, 20, 2024, 30};
//		
//		// 3rd way - here we are creating a new empty integer array of 5 length 
//		// i.e. it can allow only 5 integers at a time
//		int[] cricketWorldCupDtls = new int[5];
//		
//		System.out.println("covidDetails[] = " + covidDetails);
//		System.out.println("footballWorldCupDtls[] = " + footballWorldCupDtls);
//		System.out.println("cricketWorldCupDtls[] = " + cricketWorldCupDtls);
//		
//		System.out.println("covidDetails[0] = " + covidDetails[0]);
//		System.out.println("covidDetails[1] = " + covidDetails[1]);
//		System.out.println("covidDetails[2] = " + covidDetails[2]);
//		System.out.println("covidDetails[3] = " + covidDetails[3]);
//		
//		for(int i=0;i<footballWorldCupDtls.length;i++){
//			System.out.println(footballWorldCupDtls[i]);
//			}
//		
//		System.out.println("=============================");
//		
//		// enhanced for loop or for-each loop in java
//		for(int val : footballWorldCupDtls) {
//			System.out.println(val);
//		}
//		
//		cricketWorldCupDtls[2]= 100;
//		cricketWorldCupDtls[3]= 200;
//		// enhanced for loop or for-each loop in java
//		for(int val : cricketWorldCupDtls) {
//			System.out.println(val);
//		}
//		
//		
//		// 2D Array
//		
//		// Covid Cases for three different states
//		int[] covidCasesState1 = {10, 20, 30, 40, 50};
//		int[] covidCasesState2 = {60, 70, 80, 90, 100};
//		int[] covidCasesState3 = {110, 120, 130, 140, 150};
//		
//		// An array of three 1 dimensional arrays
//		int[][] covidCases = {
//				{10, 20, 30, 40, 50},
//				{60, 70, 80, 90, 100},
//				{110, 120, 130, 140, 150}
//		};
//		
//		System.out.println("covidCases.lenght = " + covidCases.length);
//		
//		System.out.println("*******Row 1**********");
//		System.out.println("covidCases[0][0] = " + covidCases[0][0]);
//		System.out.println("covidCases[0][1] = " + covidCases[0][1]);
//		System.out.println("covidCases[0][2] = " + covidCases[0][2]);
//		System.out.println("covidCases[0][3] = " + covidCases[0][3]);
//		System.out.println("covidCases[0][4] = " + covidCases[0][4]);
//		
//		System.out.println("*******Row 2**********");
//		System.out.println("covidCases[1][0] = " + covidCases[1][0]);
//		System.out.println("covidCases[1][1] = " + covidCases[1][1]);
//		System.out.println("covidCases[1][2] = " + covidCases[1][2]);
//		System.out.println("covidCases[1][3] = " + covidCases[1][3]);
//		System.out.println("covidCases[1][4] = " + covidCases[1][4]);
//		
//		System.out.println("*******Row 3**********");
//		System.out.println("covidCases[2][0] = " + covidCases[2][0]);
//		System.out.println("covidCases[2][1] = " + covidCases[2][1]);
//		System.out.println("covidCases[2][2] = " + covidCases[2][2]);
//		System.out.println("covidCases[2][3] = " + covidCases[2][3]);
//		System.out.println("covidCases[2][4] = " + covidCases[2][4]);
//		
//		
//		System.out.println("*****************************************");
//		
//		System.out.println("Iterate 2 dimensional array using for loop");
//		
//		// iterating over outer main array
//		for(int i = 0; i < covidCases.length; i++) {
//			System.out.println("Row: " + i);
//			// iterating over inner arrays
//			for(int j = 0; j < covidCases[i].length; j++) {
//				System.out.print(covidCases[i][j] + " ");
//			}
//			System.out.println();
//		}
//		
//		System.out.println("Iterate 2 dimensional array using for-each loop");
//		for(int[] array : covidCases) {
//			for(int a : array) {
//				System.out.print(a + " ");
//			}
//			System.out.println();
//		}
		
		String[] countryName = {"USA", "INDIA", "BRAZIL", "UK", "FRANCE"}; // Initialized the country names
		
//		System.out.println("*******For Loop*******");
//		for(int i = 0; i < countryName.length; i++) {
//			System.out.print(countryName[i] + " ");
//		}
//		System.out.println();
//		System.out.println("*******For-Each Loop*******");
//		for(String val : countryName) {
//			System.out.print(val + " ");
//		}
		
		String[] header = {"Country", "Total", "Active", "Recovered"};
		
		int[][] covidCasesArr = {  // Initialized the values of cases in countries
				{100, 20, 80},
				{200, 40, 160},
				{300, 60, 240},
				{400, 80, 320},
				{500, 100, 400}
		};
		
		for(int i = 0; i < header.length; i++) {
			System.out.print(header[i] + " ");
		}
		System.out.println();
		System.out.println("==============================");
		
//		for(int i = 0; i < countryName.length; i++) {
//			System.out.println(countryName[i]);
//		}
		
		for(int i = 0; i < covidCasesArr.length; i++) {
			System.out.print(countryName[i] + "\t");
			for(int j = 0; j < covidCasesArr[i].length; j++) {			
				System.out.print(covidCasesArr[i][j] + "\t");
			}
			System.out.println();
		}
		
		System.out.println();
		
		// Filter Covid cases based on Country Name, Total Cases, Active Cases, Recovered Cases
		
		System.out.println("Filter Covid Cases Data:");
		System.out.println("1. Country Name");
		System.out.println("2. Total Cases");
		System.out.println("3. Active Cases");
		System.out.println("4. Recovered Cases");
		System.out.println();
		
		// Initialized scanner
		Scanner scanner = new Scanner(System.in); 
		System.out.println("Enter Your Choice:");
		int choice = scanner.nextInt();
		
		switch(choice) {
			case 1:
				scanner.nextLine();
				System.out.println("Enter Name of the Country: ");
				
				String name = scanner.nextLine();
				int idx = -1;
				for(int i = 0; i < countryName.length; i++) {
					if(name.equalsIgnoreCase(countryName[i])) {
						idx = i;
						break;
					}
				}
				
				if(idx == -1) {
					System.out.println("Sorry, Country Not Found!!!");
				}
				else {
					for(int element : covidCasesArr[idx]) {
						System.out.print(element + "\t");
					}
					System.out.println();
				}
				
				break;
			
			case 2:
				getCountryName(scanner, covidCasesArr, countryName);
				
				/*
				 * scanner.nextLine(); 
				 * System.out.println("Enter Total Cases: "); 
				 * int totalCases= scanner.nextInt(); 
				 * System.out.println("total Cases: " + totalCases);
				 * 
				 * int idxCountry = -1;
				 * 
				 * for(int i = 0; i < covidCasesArr.length; i++) { 
				 * if(totalCases == covidCasesArr[i][0]) { 
				 * idxCountry = i; 
				 * } 
				 * }
				 * 
				 * System.out.println("Total Cases " + totalCases + " Belongs to " + countryName[idxCountry]);
				 * System.out.println("=============================="); 
				 * System.out.println();
				 */		
			break;
				
			case 3:
				getCountryName(scanner, covidCasesArr, countryName);
				
				/*
				 * scanner.nextLine(); System.out.println("Enter Active Cases"); int totalActive
				 * = scanner.nextInt(); System.out.println("Total Active Cases: " +
				 * totalActive);
				 * 
				 * int idxActive = -1; for(int i = 0; i < covidCasesArr.length; i++) {
				 * if(covidCasesArr[i][1] == totalActive) { idxActive = i; } }
				 * 
				 * System.out.println("Total Active Cases: " + totalActive + " Belongs to " +
				 * countryName[idxActive]);
				 * System.out.println("=============================="); System.out.println();
				 */
			break;
			
			case 4:
				getCountryName(scanner, covidCasesArr, countryName);
				
				/*
				 * scanner.nextLine(); System.out.println("Enter Recovered Cases"); int
				 * totalRecovered = scanner.nextInt();
				 * System.out.println("Total Recovered Cases: " + totalRecovered);
				 * 
				 * int idxRecovered = -1; for(int i = 0; i < covidCasesArr.length; i++) {
				 * if(covidCasesArr[i][2] == totalRecovered) { idxRecovered = i; } }
				 * 
				 * System.out.println("Total Recovered Cases: " + totalRecovered +
				 * " Belongs to " + countryName[idxRecovered]);
				 * System.out.println("=============================="); System.out.println();
				 */
			break;
		}
	}
	
	// Initialized new method(function) for case 2
	/*
	 * static void getCountryName(Scanner scanner, int[][] covidCasesArr, String[]
	 * countryName) { scanner.nextLine(); System.out.println("Enter Total Cases: ");
	 * int totalCases = scanner.nextInt(); System.out.println("total Cases: " +
	 * totalCases);
	 * 
	 * int idxCountry = -1;
	 * 
	 * for(int i = 0; i < covidCasesArr.length; i++) { if(totalCases ==
	 * covidCasesArr[i][0]) { idxCountry = i; } }
	 * 
	 * System.out.println("Total Cases " + totalCases + " Belongs to " +
	 * countryName[idxCountry]);
	 * System.out.println("=============================="); System.out.println(); }
	 */
	
	// Refined the method so that it can be used for all cases
	static void getCountryName(Scanner scanner, int[][] covidCasesArr, String[] countryName) {
		scanner.nextLine();
		System.out.println("Enter Case: ");
		int totalCases = scanner.nextInt();
		System.out.println("Entered Case: " + totalCases);
		
		scanner.nextLine();
		System.out.println("Choose Data Detail: 0(total cases), 1(active cases), or 2(recovered cases)");
		int caseIndex = scanner.nextInt();
		System.out.println("Case Index " + caseIndex);
		
		int idxCountry = -1;
		
		for(int i = 0; i < covidCasesArr.length; i++) {
			if(totalCases == covidCasesArr[i][caseIndex]) {
				idxCountry = i;
			}
		}
		
		System.out.println("Entered Case " + totalCases + " Belongs to " + countryName[idxCountry]);
		System.out.println("==============================");
		System.out.println();
	}
	
}