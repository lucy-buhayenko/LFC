/*
 * Name: ShuffleDeck.java
 * Author: Lucy Buhayenko
 * data: 04.09.2025
 * version: v 1.0
 * description: Create a driver class called ShuffleDeck with a main() method that does the following:
				creates an array of 52 card objects called deck
				use nested for loops to initialize all 52 cards to the four suits and 13 values, in order
				use a for:each loop to print the entire deck (one card on each line)
				use a loop with a random number generator to shuffle the deck. That means, take each card at index positions 0-51 one by one, and swap it with another randomly selected card in the deck.
				use a for:each loop to print the shuffled deck (one card on each line) 
				Hint: Use an array of 52 Card objects. 
 */

//importing Random
import java.util.Random;

public class ShuffleDeck {

	public static void main(String[] args) { //main method
		
		//declare random
		Random r = new Random();
		
		//declaring deck array
		Card[] deck = new Card[52];
		
		//arrays for suits and values
		String[] suits = {"Diamonds", "Hearts", "Clubs", "Spades"};
		int[] values = {1,2,3,4,5,6,7,8,9,10,11,12,13};
		
		//declaring and initializing integer index
		int index = 0;
		
		
		
		//initialize deck will all cards
		//nested for loop
		
		//looping through suits
		for(int i = 0; i < suits.length; i++) {
			//looping through values
			for(int j = 0; j < values.length;j++) {
				//making new Card object
				deck[index] = new Card(values[j], suits[i]);
				index++;//index goes up by 1
			}
		}
		
		
		//print message about deck cards being in order
		System.out.println("Deck cards in order: ");
		
		//loop through each element in the deck array and print
		for(Card i : deck) {
			System.out.println(i);
		}
		
		
		//new lines
		System.out.println();
		System.out.println();
		System.out.println();
		
		
		//for loop with a random number generator to shuffle the deck
		for(int i = 0; i < deck.length; i++) {
			//random index to swap
			int r_index = r.nextInt(deck.length);
			
			//swap cards
			Card swap = deck[i];
			deck[i] = deck[r_index];
			deck[r_index] = swap;
		}
		
		//print message "Swapped cards"
		System.out.println("Swapped cards: ");
		
		//for each loop to print swapped cards
		for(Card swap : deck) {
			System.out.println(swap);
		}
	}

}
