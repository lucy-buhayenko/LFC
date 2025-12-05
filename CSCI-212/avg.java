/*
 * Name: avg.java
 * Author: Lucy Buhayenko
 * data: 1.29.2025
 * version: v 1.1
 * description: calculate area when you know the radius
 */
//import scanner
import java.util.Scanner;

public class avg {

	public static void main(String[] args) {
		//declare scanner class
		Scanner cs = new Scanner(System.in);
		

		//declaring variables
		int num1, num2, num3;
		double sum = 0;
		double avg1;
		
		
		//first question
		System.out.print("Please enter first integer: ");
		num1 = cs.nextInt();
		sum += num1;
		
		
		//second question
		System.out.print("Please enter second integer: ");
		num2 = cs.nextInt();
		sum += num2;
		
		
		//second question
		System.out.print("Please enter third integer: ");
		num3 = cs.nextInt();
		sum += num3;
		
		
		//write sum
		System.out.printf("The sum is: %.1f\n", sum);
		
		//calculating the correct average of num1 and num2 and num3
		avg1 = sum/3;
		System.out.printf("The average of %d, %d, and %d is %.1f",num1, num2, num3, avg1);

		//try devision by 0
		//System.out.println("The result of the int division by 0 is: " + (num1/0));
		System.out.println("\nThe result of the float division by 0 is: " + (sum/0));
		
		//if int dividing by 0, then there is an error
		//if float dividing by 0, then the answer is infinity
		
		System.out.println();
		
		//convert minutes to everything(hours,days,weeks,years)
		int mins = 525600; 
		int hours = mins / 60;
		int days = hours/24;
		int weeks = days/7;
		int years = days/365;
		System.out.printf("Minutes: %d \nHours: %d \nDays: %d \nWeeks: %d \nYears: %d\n", mins, hours, days, weeks, years);
		
		
		System.out.println();
		
		//or if you want to ask the user for number of minutes and then convert
		System.out.println("Enter number of minutes: ");
		int mins2 = cs.nextInt(); 
		
		
		int hours2 = mins2 / 60;
		int days2 = hours2/24;
		int weeks2 = days2/7;
		int years2 = days2/365;
		System.out.printf("Minutes: %d \nHours: %d \nDays: %d \nWeeks: %d \nYears: %d", mins2, hours2, days2, weeks2, years2);
		
		
	}

}
