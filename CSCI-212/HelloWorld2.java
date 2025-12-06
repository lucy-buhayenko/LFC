/*
 * Name: HelloWorld2
 * Author: Lucy Buhayenko
 * data: 1.17.2025
 * version: v 1.1
 * description: write personalized message
 */
import java.util.Scanner;

public class HelloWorld2 {

	public static void main(String[] args) {
		//declare and instantiate an instance of the Scanner class
		Scanner kbd = new Scanner(System.in);
		
		//declare a variable to store the name of the end user
		String name;
		
		System.out.print("Please enter your name: ");
		
		name = kbd.next();
		
		
		// output the personalized message to the console
		System.out.println("Hello " + name + "!" + " \nThis is a great day.");

	}

}
