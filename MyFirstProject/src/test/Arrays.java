package test;

public class Arrays {
	
	// An array is a fixed length data structure to store 
	// multiple values of the same data type
		
	// lets save some COVID related info
	int confirmedCases = 431;
	int recoveredCases = 41313;
	int deceased = 21;
	int vaccinated = 54234;
	
	// 1st way - here we have declared and initialized a single dimensional array
	int covidDetails[] = {421, 41313, 21, 54234};
	
	// lets save some football world cup info
	int numOfTeamsParticipated = 50;
	int numOfTournaments = 25;
	int numOfTeamsQualified = 20;
	int yearOfPlay = 2024;
	int totalGoalsByBestPlayer = 30;
	
	// 2nd way - another representation of an array
	int[] footballWorldCupDtls = {50, 25, 20, 2024, 30};
	
	// 3rd way - here is a new empty integer array of 5 length
	// i.e it can allow only 5 integers at a time
	int[] cricketWorldCupDtls = new int[5];
	
	public static void main(String[] args) {
		
		System.out.println("********* Single Dimensional Array *********");
		
		// lets save some COVID related info
		int confirmedCases = 431;
		int recoveredCases = 41313;
		int deceased = 21;
		int vaccinated = 54234;
		
		// 1st way - here we have declared and initialized a single dimensional array
		int covidDetails[] = {421, 41313, 21, 54234};
		
		// lets save some football world cup info
		int numOfTeamsParticipated = 50;
		int numOfTournaments = 25;
		int numOfTeamsQualified = 20;
		int yearOfPlay = 2024;
		int totalGoalsByBestPlayer = 30;
		
		// 2nd way - another representation of an array
		int[] footballWorldCupDtls = {50, 25, 20, 2024, 30};
		
		// 3rd way - here is a new empty integer array of 5 length
		// i.e it can allow only 5 integers at a time
		int[] cricketWorldCupDtls = new int[5];
		
		System.out.println("covidDetails[] = " + covidDetails);
		System.out.println("footballWorldCupDtls[] = " + footballWorldCupDtls);
		System.out.println("cricketWorldCupDtls[] = " + cricketWorldCupDtls);
		
		System.out.println("covidDetails[0] = " + covidDetails[0]);
		System.out.println("covidDetails[1] = " + covidDetails[1]);
		System.out.println("covidDetails[2] = " + covidDetails[2]);
		System.out.println("covidDetails[3] = " + covidDetails[3]);
		
		for(int i=0; i<footballWorldCupDtls.length; i++){
			System.out.println(footballWorldCupDtls[i]);
			}
		
		System.out.println("================");
		
		// enhanced for for loop or for-each loop in java
		for(int val : footballWorldCupDtls) {
			System.out.println(val);
		}
		
		// enhanced for for loop or for-each loop in java
		for(int val : cricketWorldCupDtls) {
			System.out.println(val);
		}
		
		cricketWorldCupDtls[2] = 100;
		cricketWorldCupDtls[3] = 200;
		System.out.println(cricketWorldCupDtls[3]);
		
		// enhanced for loop or for-each loop in java
		for(int val : cricketWorldCupDtls) {
			System.out.println(val);
		}
		
		// 2D array
		
		// COVID cases for three different states
		int[] covidCasesState1 = {10, 20, 30, 40, 50};
		int[] covidCasesState2 = {60, 70, 80, 90,100};
		int[] covidCasesState3 = {110, 120, 130, 140, 150};
		
		// An array of three 1 dimensional arrays
		int[][] covidCases = {
				{10, 20, 30, 40, 50},
				{60, 70, 80, 90,100},
				{110, 120, 130, 140, 150},
		};
		
		System.out.println("covidCases.length = " + covidCases.length);
		
		System.out.println("********* Row 1 *********");
		
		System.out.println("covidCases[0][0] = " + covidCases[0][0]);
		System.out.println("covidCases[0][1] = " + covidCases[0][1]);
		System.out.println("covidCases[0][2] = " + covidCases[0][2]);
		System.out.println("covidCases[0][3] = " + covidCases[0][3]);
		System.out.println("covidCases[0][4] = " + covidCases[0][4]);
		
		System.out.println("********* Row 2 *********");
		System.out.println("covidCases[1][0] = " + covidCases[1][0]);
		System.out.println("covidCases[1][1] = " + covidCases[1][1]);
		System.out.println("covidCases[1][2] = " + covidCases[1][2]);
		System.out.println("covidCases[1][3] = " + covidCases[1][3]);
		System.out.println("covidCases[1][4] = " + covidCases[1][4]);
		
		System.out.println("********* Row 3 *********");
		System.out.println("covidCases[2][0] = " + covidCases[2][0]);
		System.out.println("covidCases[2][1] = " + covidCases[2][1]);
		System.out.println("covidCases[2][3] = " + covidCases[2][2]);
		System.out.println("covidCases[2][3] = " + covidCases[2][3]);
		System.out.println("covidCases[2][4] = " + covidCases[2][4]);
		
		System.out.println("*************************");
		
		System.out.println("Iterate 2D array using for loop");
		
		// Nested loop to iterate each index in a 2D array
		
		// Iterating over outer array
		for(int i = 0; i < covidCases.length; i++) {
			System.out.println("Row: " + i);
			// Iterating over inner array
			for(int j = 0; j < covidCases[i].length; j++) {
				System.out.print(covidCases[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.println("Iterate 2D array using enhanced for loop or for-each or  loop");
		for(int[] array : covidCases) {
			for(int a : array) {
				System.out.print(a + " ");
			}
			System.out.println();
		}
		
		String[] countryName = {"USA", "India", "Brazil", "UK", "France"};
		
		System.out.println("********* For Loop *********");
		for(int i = 0; i < countryName.length; i++) {
			System.out.print(countryName[i] + " ");
		}
		
		System.out.println();
		System.out.println("********* For-Each Loop *********");
		for(String val : countryName) {
			System.out.print(val + " ");
		}
		
		Object[][] covidDiagram = {
			{"Country", "TotalCases", "Active", "Recovered"},
			{"USA", 1000, 100, 900},
			{"India", 2000, 200, 1800},
			{"Brazil", 3000, 300, 2200},
			{"UK", 4000, 400, 2700},
			{"France", 5000, 500, 3100}
		};
		
		System.out.println("COVID cases by country: ");
		for(Object[] row : covidDiagram) {
			for(Object element : row) {
				System.out.print(element + " ");
			}
			System.out.println();
		}
		
	}
}
