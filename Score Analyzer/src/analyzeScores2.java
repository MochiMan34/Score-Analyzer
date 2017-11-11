import java.util.*; 
public class analyzeScores2 {

	
	public static void main(String [] nums)
	{
		Scanner scan1 = new Scanner(System.in); 
		double sum = 0; 
		double average = 0; 
		int counter = 0; 
		int aboveAverage = 0; 
		int belowAverage = 0; 
		
		System.out.println("Enter score: ");
		for(int i = 0; i < nums.length; i++)
		{
			
			if(Double.parseDouble(nums[i]) < 0)
			{
				System.out.println("Negative number has been entered. Program has ended.");
				
			}
			else 
			{
				sum += Double.parseDouble(nums[i]); 
				counter += 1; 
				average = sum / counter; 
				
				
			}
		}
	
		
		System.out.println("Sum : " + sum);
		System.out.println("Average: " + average);
		System.out.println("Above average: " + aboveAverage);
		System.out.println("Below average: " + belowAverage);
		
	}
	
}
