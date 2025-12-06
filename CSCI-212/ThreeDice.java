/*
 * Name: ThreeDice.java
 * Author: Lucy Buhayenko
 * data: 04.09.2025
 * version: v 1.1
 * description: Using the Die class from Problem 1, 
			    create an application called ThreeDice that creates three Die objects, 
			    and keeps rolling them together until the sum of the three Die faces is 12.
			    Print the outcome of each roll, and finally when the program stops, 
			    print the number of rolls that were needed. 
 */

public class ThreeDice {

	public static void main(String[] args) {
		//create 3 Die objects
		Die die1 = new Die();
		Die die2 = new Die();
		Die die3 = new Die();
		
		//declaring and instantiating sum, to add values of 3 dice to it later
		int sum = 0;
		
		//declaring and instantiating count to know number of rolls that are needed for getting a sum of 12
		int count = 0;
		
		int value1, value2, value3;
		
		while(sum != 12) { //while sum is not 12, repeat rolling
			
			
			value1 = die1.roll(); //roll first die
			
			value2 = die2.roll(); //roll second die
			
			value3 = die3.roll(); //roll third die
			
			
			//print results of rolling the 3 dice
			System.out.println("Value of first die: " + value1 + //print value of first die
			"\nValue of second die: " + value2 + //print value of second die
			"\nValue of third die: " + value3); //print value of third die
			
			//sum of the 3 rolls
			sum = value1 + value2 + value3;;
			
			// adds 1 to roll count
			count++; 
			
			
			//new line 
			System.out.println();
		}
		
		//print message about rolls
		System.out.printf("Number of rolls that were needed to get a sum of 12: %d", count);
		
		
	}

}
