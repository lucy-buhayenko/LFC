/*
 * Name: arrow.java
 * Author: Lucy Buhayenko
 * data: 1.24.2025
 * version: v 1.1
 * description: write personalized message
 */
//need the scanner class available to get input from the user
import java.util.Scanner;

public class arrow {

	public static void main(String[] args) {
		//declare and instantiate an instance of the Scanner class
		Scanner kbd = new Scanner(System.in);
		
		//declare a variable to store the name of the end user
		String arrowBody, arrowHead;
		int bodyLength;
		
		System.out.print("Please enter the character for the arrow body: ");
		arrowBody = kbd.next();
		
		
		System.out.print("Please enter the character for the arrow head: ");
		arrowHead = kbd.next();
		
		
		System.out.println("     " + arrowHead);
		System.out.println("     " + arrowHead + arrowHead);
		System.out.println(arrowBody + arrowBody + arrowBody + arrowBody + arrowBody + arrowHead + arrowHead + arrowHead);
		System.out.println(arrowBody + arrowBody + arrowBody + arrowBody + arrowBody + arrowHead + arrowHead + arrowHead + arrowHead);
		System.out.println(arrowBody + arrowBody + arrowBody + arrowBody + arrowBody + arrowHead + arrowHead + arrowHead);
		System.out.println("     " + arrowHead + arrowHead);
		System.out.println("     " + arrowHead);
		
		
		
		
		System.out.println("");
		
		//other version of code using the baseSection variable
		
		//build the base of the arrow
		String baseSection = arrowBody + arrowBody + arrowBody + arrowBody + arrowBody;
		
		
		System.out.println("     " + arrowHead);
		System.out.println("     " + arrowHead + arrowHead);
		System.out.println( baseSection+ arrowHead + arrowHead + arrowHead);
		System.out.println(baseSection + arrowHead + arrowHead + arrowHead + arrowHead);
		System.out.println(baseSection + arrowHead + arrowHead + arrowHead);
		System.out.println("     " + arrowHead + arrowHead);
		System.out.println("     " + arrowHead);
		
		
		
		System.out.println();
		// another version more flexible
		
		
		// ask user about length
		System.out.println("Please enter the length for the arrow body as an integer: ");
		bodyLength = kbd.nextInt();
		
				
		System.out.println(" ".repeat(bodyLength) + arrowHead);
		System.out.println(" ".repeat(bodyLength) + arrowHead.repeat(2) );
		System.out.println(arrowBody.repeat(bodyLength)+ arrowHead.repeat(3));
		System.out.println(arrowBody.repeat(bodyLength) + arrowHead.repeat(4));
		System.out.println(arrowBody.repeat(bodyLength) + arrowHead.repeat(3));
		System.out.println(" ".repeat(bodyLength) + arrowHead.repeat(2));
		System.out.println(" ".repeat(bodyLength) + arrowHead);
		
		
		
		
		
	}
}
