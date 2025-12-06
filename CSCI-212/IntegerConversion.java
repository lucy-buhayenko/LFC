/*
 * Name: IntegerConversion.java
 * Author: Lucy Buhayenko
 * data: 3.29.2025
 * version: v 1.0
 * description: Write a program called IntegerConversion that performs binary to decimal conversion. The user is asked to provide  8-bit binary number (1's and 0's; leading 0 is allowed) and compute and output the decimal equivalent. 
   A binary number's digits are only 0's and 1's, with each digit's weight being an increasing power of 2 (binary110 is 1*2^2 + 1*2^1 + 0*2^0 = 1*4 + 1*2 + 0*1 = 4 + 2 + 0 = 6 in decimal)
   Ex: For input 00000110, the output is: 6.
   Use arrays to solve this problem. 
 */



//import scanner
import java.util.Scanner;

public class IntegerConversion {

	public static void main(String[] args) {
		//declare scanner class
		Scanner cs = new Scanner(System.in);
		
		//ask user input and store in variable
		System.out.println("Enter 8-bit binary number: ");
		String binary = cs.next();//stores the binary number as a String
		
		//check if it's 8-bit
		while(binary.length() != 8 ) {
			System.out.println("Incorrect input. Enter 8-bit binary number: ");
			binary = cs.next();//stores new binary number in binary variable
		}
		
		//creates an array to store converted bits from String to integer
		int[] bitInt = new int[8];
		
		
		//declare and initialize decimal
		int decimal = 0;
		
		//loop through characters in input
		for(int i = 0; i < 8; i++) {
			//get each character
			char bit  = binary.charAt(i);
			
			//convert from character to integer
		    int x = (int)(bit) - 48; //it will be either 1 or 0
			
			// or also could do like this: Character.getNumericValue(bit);
			
		    
		    //store in bitInt array
		    bitInt[i] = x;
		    
			//calculates the result
		    int p = bitInt.length - 1 - i; // calculate power 8 - 1 - i
		    decimal += bitInt[i] * Math.pow(2, p);
		    
			
			
			
		}
		System.out.println("The decimal is: " + decimal);
		
	}	

}
