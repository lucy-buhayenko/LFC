/*
 * Name: ArrayReverseElem.java
 * Author: Lucy Buhayenko
 * data: 3.19.2025
 * version: v 1.0
 * description: include method for reversing
 */

//import scanner

import java.util.Scanner;

public class ArrayReverseElem {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      final int NUM_ELEMENTS = 8;             // Number of elements
      int[] userVals = new int[NUM_ELEMENTS]; // User numbers
      int i;                                  // Loop index
                          

      // Prompt user to input values
      System.out.println("Enter " + NUM_ELEMENTS
              + " integer values...");
      for (i = 0; i < userVals.length; ++i) {
         System.out.print("Value: ");
         userVals[i] = scnr.nextInt();
      }
      reverse(userVals);
      // Print numbers
      System.out.print("\nNew values: ");
      for (i = 0; i < userVals.length; ++i) {
         System.out.print(userVals[i] + " ");
      }
      
   }


   
   public static int[] reverse(int[] userVals) { //method for reverse
	// Reverse array's elements
      for (int i = 0; i < (userVals.length/2); ++i) {
         int tempVal = userVals[i];                        // Temp for swap
         userVals[i] = userVals[userVals.length - 1 - i]; // First part of swap
         userVals[userVals.length - 1 - i] = tempVal;     // Swap complete
      }
      return userVals;
   }
   
   
   
}
