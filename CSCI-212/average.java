/*
 * Name: average.java
 * Author: Lucy Buhayenko
 * data: 1.24.2025
 * version: v 1.1
 * description: write personalized message
 */
//import scanner
import java.util.Scanner;

public class average {

	public static void main(String[] args) {
		//declare scanner class
		Scanner cs = new Scanner(System.in);

		
		
		//asking user questions and saving information
		int num1, num2;
		double avg;
		
		
		System.out.print("Please enter first integer: ");
		num1 = cs.nextInt();
		System.out.print("Please enter second integer: ");
		num2 = cs.nextInt();
		
		
		//calculating the correct avg of num1 and num2
		avg = ((num1 + num2) / 2.0);
		System.out.println("The average of " + num1 + " and " + num2 + " is " + avg);
		System.out.println("The average of " + num1 + " and " + num2 + " is " + ((num1+num2)/2.0));



	}

}
