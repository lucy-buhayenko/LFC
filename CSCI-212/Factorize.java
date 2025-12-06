/*
 * Name: Factorize.java
 * Author: Lucy Buhayenko
 * data: 2.24.2025
 * version: v 1.0
 * description: program that that takes an integer n from the user and prints out the prime factorization of the number. e.g., if n is 72, the program should print 2*2*2*3*3, and if n is 210 then the program should print 2*3*5*7.
 */
//import scanner
import java.util.Scanner;

public class Factorize {

	public static void main(String[] args) {
		
		
		//declare scanner class
		Scanner cs = new Scanner(System.in);
	
		
		//user input
		System.out.println("Enter a positive number: ");
		int num = cs.nextInt();
		
		//make sure the input is correct
		while(num <= 0) {
			System.out.println("It's not a positive number. Enter number: ");
			num = cs.nextInt();
		}
		
		System.out.println(); //empty line 
		
		//print message
		System.out.println("The prime factorization of this number: ");
		
		
		//declare variables count and k and factor for factorization
		int count;
		int k;
		boolean factor1 = true;//it's a first factor, when it will be false, it won't be first anymore
		
		
		//factoring from 2 to the num
		for(k = 2; k <= num; k++) {
			count = 0;
	
			while(num % k == 0) {
				
				if(!factor1) {
					System.out.print("*"); //print * before next factor (when it's not the first one)
				}
				
				System.out.print(k);
				num /= k;
				factor1 = false; //after first prime factor is printed, set to false
			}
		}
		
    
	}

}
