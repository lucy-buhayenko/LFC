/*
 * Name: int10.java
 * Author: Lucy Buhayenko
 * data: 3.29.2025
 * version: v 1.0
 * description:  Given 10 input integers (negative numbers allowed), output the minimum, maximum, and average of those integers. Use an array for the input.  [30 points]
   	Hints:
   Use a single for loop and update variables minVal, maxVal, and sumVals on each iteration. (You could use three loops instead).
   Initialize variables minVal and maxVal each to the first integer, NOT to 0. 0 is wrong because integers could be negative. Then update those values if a smaller or larger integer is seen (respectively).
   Don't forget to use floating-point division, not integer division, when computing the average (use / 10.0, not / 10).  
 */
//import scanner
import java.util.Scanner;

public class int10 {

	public static void main(String[] args) {
		
		
		//declare scanner class
		Scanner cs = new Scanner(System.in);
		
		//write message to user
		System.out.println("You need to enter 10 integer values");
		
		//create array with size 10
		int[] input = new int[10];
		
		//get user input and store in input array
		for(int i= 0; i < input.length; i++) {//create for loop
			System.out.print("Enter value " + (i + 1) + ": ");
			input[i] = cs.nextInt();//stores input to array
		}
		
		//declare and initialize variables
		int minVal = input[0];//initialize to first integer
		int maxVal = input[0];//initialize to first integer
		int sumVal = 0;
		
		for(int i = 0; i < input.length; i++) {//creates for loop to update the variables minVal, maxVal and sumVal
			//updating minVal
			if(minVal > input[i]) { //if smaller number is found, update the minVal
				minVal = input[i];
			}
			
			
			//updating maxVal
			if(maxVal < input[i]) {//if larger number is found, update the maxVal
				maxVal = input[i];
			}
			
			//find sumVal 
			sumVal += input[i]; //adds current value to sumVal
			
			
			
		}
		//find average
		double avg = sumVal / 10.0;
		
		//output the results to user
		System.out.println("Minimum value: " + minVal);
		System.out.println("Maximum value: " + maxVal);
		System.out.println("Average of all values: " + avg);
		
		
		}
		
}
