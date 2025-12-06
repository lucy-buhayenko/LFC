/*
 * Name: RollRace.java
 * Author: Lucy Buhayenko
 * data: 04.09.2025
 * version: v 1.0
 * description:  RollRace that creates two Die objects, and keeps rolling them to 
				  see which one comes up three sixes in a row first. Continue rolling the dice 
				  until one of them wins the race, and consider the possibility that they might tie. 
				  Print the results of each roll, and at the end print the winner 
				  and total number of rolls that were required.
 */

public class RollRace {

	public static void main(String[] args) {
		
		//creating first and second die
		Die die1 = new Die();
		Die die2 = new Die();
		
		//declaring variables for counting the amount of times 6 pops up for each die
		int six1 = 0;
		int six2 = 0;
		
		int total = 0; //declaring total rolls
		
		//declaring variable winner
		String winner = "";
		
		//start race till one of dice will get three 6
		while(six1 < 3 && six2 < 3) {
			
			total++; //adds 1 to total rolls
			
			//variables for rolling dice
			int roll1 = die1.roll();
			int roll2 = die2.roll();
			
			//printing results of rolling
			System.out.println("Total rolls: " + total + 
					"\nDie 1: " + roll1 + 
					"\nDie 2: " + roll2);
			
			//new line
			System.out.println();
			
			//updating count for die 1
			six1 = (roll1 == 6) ? six1 + 1 : 0; // if the roll is 6, add 1 to the count of first die, else reset to 0
			
			//updating count for die 2
			six2 = (roll2 == 6) ? six2 + 1 : 0; // if the roll is 6, add 1 to the count of second die, else reset to 0

			
			//checking the count and picking winner
			
			//checks for tie
			if(six1 == 3 && six2 == 3) {
				winner = "it's a tie!";
				break;
			}
			//checks if die 1 wins
			else if(six1 == 3) {
				winner = "the winner is Die 1!";
				break;
			}
			//checks if die 2 wins
			else if(six2 == 3) {
				winner = "the winner is Die 2!";
				break;
			}
		
		
		}
		
		//output the result to the user, printing the winner after number of certain amount of rolls
		System.out.println("After " + total + " rolls " + winner);
		
		
		
		
	}

}
