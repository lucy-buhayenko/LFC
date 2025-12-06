/*
 * Name: Card.java
 * Author: Lucy Buhayenko
 * data: 4.9.2025
 * version: v 1.0
 * description: Define a class called Card that has two private data items: one int called value and one String called suit. This String takes the values "Diamonds", "Hearts", "Clubs" or "Spades". Also, do the following:

			create a default constructor that sets value to a random value in 1-13 and suit to a random suit among the four.
			create a constructor that takes 2 arguments, an int for card value and a String for card suit
			create getters and setters for the two data items
			a toString method that prints the card in this format: "5 of Hearts", "King of Spades" etc. Note that 1 should be printed as "Ace", 11 as "Jack", 12 as "Queen" and 13 as "King" 
			an equals method that returns true if two cards have the same suit and value, false otherwise. 
			Use arrays in the constructor. 
 */

//import random 
import java.util.Random;

public class Card {
	
	//declare random
	Random r = new Random();
	
	//attributes
	private int value;
	private String suit;
	
		
	//this is a default constructor
	public Card() {
		//array of words
		String[] suits = {"Diamonds", "Hearts", "Clubs", "Spades"};
		
		//random index for suits
		int r_i = r.nextInt(suits.length);
		
		//random suit selected 
		suit = suits[r_i];
		
		//array of values
		int[] values = {1,2,3,4,5,6,7,8,9,10,11,12,13};

		
		//random index selected
		int r_i2 = r.nextInt(values.length);
		
		//random value selected
		value = values[r_i2];
		
	}
	
	//this is a constructor that takes 2 arguments
	public Card(int value, String suit) {
		//sets attribute to parameter 
		this.value = value; 
		this.suit = suit;
	}
	
	
	//getters
	public String getSuit() {//getter for suit
		return suit;
	}
	
	public int getValue() {//getter for value
		return value;
	}
	
	
	//setters
	public void setSuit(String suit) {//setter for suit
		this.suit = suit;
	}
	
	public void setValue(int value) {//setter for value
		this.value = value;
	}
		
	//toString
	public String toString() {
		//declaring variable for value as a String
		String valueS; 
		
		//switch used to set the value of the card to face card
		switch(value) {
		case 1:
			valueS = "Ace"; //if 1, then "Ace"
			break;
		case 11:
			valueS = "Jack"; //if 11, then "Jack"
			break;
		case 12:
			valueS = "Queen";//if 12, then "Queen"
			break;
		case 13:
			valueS = "King";//if 13, then "King"
			break;
		default:
			valueS = "" + value; // this will set value to a number (ex: if it's 6, then it's 6)
		
		}
		//returning message
		return valueS + " of " + suit; 
	}
	
	//equals method
	public boolean equals(Card card2) {
		if(this.value == card2.value && this.suit.equals(card2.suit)) {
			return true;//if two cards have same suit and value return true
		}
		return false;//two cards have different suits and/or values, return false
	}
	
}
