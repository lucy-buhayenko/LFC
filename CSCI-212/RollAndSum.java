/*
 * Name: OOP_Die.java
 * Author: Lucy Buhayenko
 * data: 3.26.2025
 * version: v 1.0
 * description: a driver for the Die class
 */

//import scanner

public class RollAndSum {
   public static void main(String[] args) {
      //declare and instantiate the 2 Die1 variables
	   Die2 die1 = new Die2();
	   Die2 die2 = new Die2();
	   
	   //output the initial values
	   System.out.print("Die one: " + die1.getFaceValue());
	   System.out.print(", \t");
	   System.out.print("Die two: " + die2.getFaceValue());
	   
	   
	   
	   /*
	   //roll the dice once and print the values and the sum
	   System.out.print("\nDie one: " + die1.roll());//rolling is done through the roll method
	   System.out.print(", \t");
	   System.out.print("Die two: " + die2.roll());
	   
	   //print their sum
	   System.out.println();
	   System.out.print("\nSum: " + (die1.getFaceValue() + die2.getFaceValue()));
	   //System.out.print("\nSum: " + (die1.roll() + die2.roll())); //   this won't work because it will be re-rolled 
	   
	   
	   
	   //now roll again 
	   //roll the dice once and print the values and the sum
	   System.out.println();
	   System.out.print("\nDie one: " + die1.roll());//rolling is done through the roll method
	   System.out.print(", \t");
	   System.out.print("Die two: " + die2.roll());
	   
	   //print their sum
	   System.out.println();
	   System.out.print("\nNext SUM: " + (die1.getFaceValue() + die2.getFaceValue()));
	   
	   */
	   
	   //new line
	   System.out.println();
	   
	   //print equal dice if the dice are the same, else print different dice
	   System.out.println((die1.equals(die2)) ? "Equal dice" : "Different dice") ;
	   
	   
	   
	   //call the method
	   for  (int i = 1; i <= 2; i++) {
		   //rollPrint(die1, die2);
	   }
	   
	   
   }
   public static void rollPrint(Die1 die1, Die1 die2) {
	 //roll the dice once and print the values and the sum
     System.out.print("\nDie one: " + die1.roll());//rolling is done through the roll method
     System.out.print(", \t");
     System.out.print("Die two: " + die2.roll());
   
     //print their sum
     System.out.println();
     System.out.print("\nSum: " + (die1.getFaceValue() + die2.getFaceValue()));
   }
   
   
}
