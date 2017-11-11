// Sagai Taylor 
// Exercise no 3
// Exercise due date -  November 12
import java.util.Scanner;

public class analyzeScores {



	
	public static void main(String[] args)
	{
		
		
		analyzeScores(); // analyzeScores method is launched 
		
	}
	
	
	public static void analyzeScores() 
	{
		// Variables 
		double scores[]; // array that stores the user's scores that are inputted
		int counter = 0;  // counter variable that counts how many scores that a user enters 
		double testArray[] = new double[10000]; // Large test array that will eventually carries values stored in it to the 'scores' array 	
		double num = 1.0; // Number for score input prompt is previously set at 1 to kickstart the loop below 
		double sum = 0.0; // Sum of the scores 
		double avg = 0; // Average of scores 
		int aboveAvg = 0; // How many times a score in a group is above average 
		int belowAvg = 0; // How many times a score in a group is below average 
		final int MAX_SCORE = 100; 
		Scanner scan1 = new Scanner(System.in); 
		
		while(num >= 0) // Starts off loop. Since num is defined as 	1.0, the loop starts. it will run as long as the scores entered are greater than or equal to 0
		{
			System.out.println("Enter a negative number to stop the program. Otherwise, enter score: "); // System prompt for user to enter score
			num = scan1.nextDouble(); // Scanner listens for a score double 
			while(num > MAX_SCORE)
			{
				System.out.println("Max score is 100. Enter a valid score: "); 
				num = scan1.nextDouble(); 
			}
			sum += num; // Score entered is incremented to the sum value 
			
			testArray[counter] = num; // scores are stored in the testArray array 
			
			counter += 1; // Counter is incremented every time the loop runs which keeps track of how many scores are entered 
			
			avg = sum / counter; // average is  computed by dividing counter by the sum 
		}
		sum -= num;  // sum is subtracted by the negative number entered to stop the program to prevent it from being counted within the sum
		
		counter -=1; // counter variable is decremented to not count for the negative number entered to stop the program 
		
		avg = sum / counter;  // new average value is computed without taking into account the negative number entered to stop the program
		
		scores = new double[counter]; // scores array is declared as having the same length as how many scores were entered by the user
		
		for(int b = 0; b < scores.length; b++)  // 'for' loop to transfer the scores stored in testArray to this array 
		{
			scores[b] = testArray[b]; // scores array elements are given the values of the scores stored in the testArray array
			
			if(scores[b] >= avg) // if the score found in a given element is greater than or equal to the average of the scores entered
			{
				aboveAvg += 1;  // then increment the frequency of how frequent a score is above average 
			}
			
			else {
				belowAvg += 1; // else, increment the frequency of how frequent a score is below average 
			}
			
		}
		
		
		
		// Display the sum, average, and the frequency of how many scores are above or below the average of all scores 
		System.out.println("Sum of scores: " + sum);
		System.out.println("Average of scores: " + avg);
		System.out.println("Scores above average: " + aboveAvg);
		System.out.println("Scores below average: " + belowAvg);
		
		
	
		
	
	}
	 
	
	

	
	
}
