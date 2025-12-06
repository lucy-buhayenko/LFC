/*
 * Name: rollDice.java
 * Author: Lucy Buhayenko
 * data: 04.09.2025
 * version: v 1.0
 * description: creates two objects of the Die class (given). 
				 The application should roll the dice one by one, print their face values, 
				 and then print the sum, 
				 difference and product of those values.
 */

public class rollDice {

	public static void main(String[] args) {
		//creating 2 objects of the Die class
		Die die1 = new Die();
		Die die2 = new Die();
		
		//rolling the dice one by one, store the values
		int faceValue1 = die1.roll();
		int faceValue2 = die2.roll();
		
		//print the dice values
		System.out.println("First rolled die: " + faceValue1);
		System.out.println("Second rolled die: " + faceValue2);
		
		//calculate sum, difference and product
		int sum = faceValue1 + faceValue2;
		int difference = Math.abs(faceValue1 - faceValue2);
		int product = faceValue1 * faceValue2;
		
		
		//new line
		System.out.println();
		
		//output result
		System.out.println("Sum: " + sum);
		System.out.println("Difference: " + difference);
		System.out.println("Product: " + product);
		
	}

}
