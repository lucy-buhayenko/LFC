/*
 * Name: HelloWorld3.java
 * Author: Lucy Buhayenko
 * data: 1.22.2025
 * version: v 1.1
 * description: write personalized message
 */
import java.util.Scanner;

public class HelloWorld3 {

	public static void main(String[] args) {
		//declare and instantiate an instance of the Scanner class
		Scanner kbd = new Scanner(System.in);
		
		//declare a variable to store the name of the end user
		String name;
		
		System.out.print("Please enter your name: ");
		
		name = kbd.next();
		
		//ask for the year of birth
		System.out.print("Please enter your birth year: ");
		//save the year of birth in yearBirth variable
		int yearBirth;
		yearBirth = kbd.nextInt();
		
		//use an age variable 
		int age = 2025-yearBirth;
		// output the personalized message to the console
		System.out.println("Hello " + name + "!" + " \nThis year you'll be " + (2025-yearBirth) + ".");

		
		
		
		
		
		
	}
}
