/*
 * Name: arrays2d.java
 * Author: Lucy Buhayenko
 * data: 3.17.2025
 * version: v 1.0
 * description: create 2 lists with upper and lower case letter and also then print out 
 */

//import scanner
import java.util.Scanner;


public class arrays2d {

	public static void main(String[] args) {
		//declare scanner class
		Scanner cs = new Scanner(System.in);
		
		
		
		//ask user the sentence
		System.out.println("Please enter the sentence: ");
		String sentence = cs.nextLine();
		
		
		
		//upper array size 26
		int[] upper = new int[26];
		
		//lower array size 26
		int[] lower = new int[26];
		
		//declare character c
		char c;
		int different = 0;
		
		//you go to the array and add 1 to it if you find a letter
		for(int i = 0; i < sentence.length(); i++) {//for loop will go through each character
			c = sentence.charAt(i);//character c
			
			//we use for loop because we know the number of iterations
			//the number of iterations will be .length method
			
			//for the upper case characters
			if(c >= 'A' && c <= 'Z') {
				upper[c-'A']++;			//it go to upper array, then you see what is the element
										//capital A is considered to be 1, so the index is 0, the last index will be 25
										//so you take the character and minus A; then you find the letter and you increment it(++)
			}
			
			else {//for the lower case character
				if(c>='a' && c<='z'){
					lower[c-'a']++;
				}
				else {//if it's not upper or lower case then add 1
					different += 1;
				}
			}
		}
		
		//results
		System.out.println("");
		for(int i = 0; i < upper.length; i++) {  //i is an index //for upper 
			System.out.print((char) (i + 'A'));
			System.out.print(": " + upper[i]);
			System.out.print("\t\t" + (char) (i + 'a')); //for lower
			System.out.println(": " + lower[i]);
		}
		
		System.out.println("");
		System.out.println("Non alphabetic ones: " + different);
		
		
		
		
		
		
		
		//initials code
		
		
		//ask name
		System.out.println("What is your full name: ");
		String name = cs.nextLine();
		
		
		
		int size = name.split(" ").length;
		String[] initial = new String[size];
		
		initial = name.split(" ");
		
		for(String word : initial) {
			System.out.println(Character.toUpperCase(word.charAt(0)));
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
}
