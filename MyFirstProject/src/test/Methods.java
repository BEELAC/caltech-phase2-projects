package test;

public class Methods {
	
	public static void main(String[] args) {
		
		int[] productPrices = {1200, 2300, 3300, 1600, 1900};
		int[] footballScores = {10, 20, 30, 40, 50};
		int[] cricketScores = {100, 200, 300, 400, 500};
		
		// This works but it's redundant. How can I improve this code?
		/*
		 * for(int i = 1; i < productPrices.length; i++) { if(productPrices[i] > max) {
		 * max = productPrices[i]; } }
		 * 
		 * System.out.println("Maximum Product Price: " + max);
		 * 
		 * 
		 * int max2 = cricketScores[0];
		 * 
		 * for(int i = 1; i < cricketScores.length; i++) { if(cricketScores[i] > max) {
		 * max = cricketScores[i]; } }
		 * 
		 * System.out.println("Maximum Cricket Scores: " + max);
		 * 
		 * 
		 * int max3 = footballScores[0];
		 * 
		 * for(int i = 1; i < footballScores.length; i++) { if(footballScores[i] > max)
		 * { max = footballScores[i]; } }
		 * 
		 * System.out.println("Maximum Football Scores: " + max);
		 */
		
		// This is better, I only used one for-loop this time. 
		// But, I think it can be even more efficient.
		/*
		 * int max = productPrices[0]; int maxF = footballScores[0]; int maxC =
		 * cricketScores[0];
		 * 
		 * for(int i = 1; i < productPrices.length; i++) { 
		 * if(productPrices[i] > max) {
		 * max = productPrices[i]; } 
		 * if(footballScores[i] > maxF) { 
		 * maxF = footballScores[i]; 
		 * } 
		 * if(cricketScores[i] > maxC) { 
		 * maxC = cricketScores[i]; }
		 * }
		 */
		
		System.out.println("Maximum Product Price: " + getMax(productPrices));
		System.out.println("Maximum Football Scores: " + getMax(footballScores));
		System.out.println("Maximum Cricket Scores: " + getMax(cricketScores));
	}
	
	// This is perfect! I created a separate static method(function) that takes any 
	// kind of integer arr and returns it's max value!
	static int getMax(int[] arr) {
		
		int max = arr[0];
		
		for(int i = 1; i < arr.length; i++) {
			if(arr[i] > max) {
				max = arr[i];
			}
		}
		
		return max;
	}
	
}
