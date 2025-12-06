/*
 * Name: initials.java
 * Author: Lucy Buhayenko
 * data: 2.14.2025
 * version: v 1.1
 * description: ask user to write first, middle and last name and output their initials
		
 */
//import scanner
import java.util.Scanner;

public class initials {

	public static void main(String[] args) {
		//declare scanner class
		Scanner cs = new Scanner(System.in);
		
		
		
		//for comparing strings use the str1.equals(str2) and str1.compareTo(str2) > 0;
		
		//to concatenate use s1.concat(s2);
		
		//index is like the position; last one is -1
		
		//charAt() - accessing specific character at specified index
		
		
		
		
		//each of the primitive data types we have a class that is built inside
		//in specific case of Characters: 
		//isLetter(c);
		//toUpperCase(c);
		//toLowerCase(c);
		//isDigit(c);
		//isWhiteSpace(c);
		
		//it/ll stop when you type -1 or something
		//you can differentiate the user data
		//also validate what the user input is
		
		//to identify the specific substring in text to find what it's looking for
		//s1.lastIndexOf(textToFind); tries to find the text in s1
		
		
		//declare string values
		String name, initials1 = "";
		System.out.println("What is your full name: ");
		name = cs.nextLine();//it only captures the first name if it is cs.next(), but if it's cs.nextLine() it captures the whole name
		
		
		
		
		int first_space_index = name.indexOf(' ');
		
		//test if it works
		System.out.println(first_space_index);
		System.out.println(name); 
		
		
		//start building the string containing the initials 
		//first initial 
		initials1 += name.charAt(0); 
		
		
		
		//next initial
		initials1 +=name.charAt(first_space_index + 1);
		System.out.println(initials1);
		
		
		
		
		

		
		
		
		
		
	}

}
