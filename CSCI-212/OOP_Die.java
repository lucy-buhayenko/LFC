/*
 * Name: OOP_Die.java
 * Author: Lucy Buhayenko
 * data: 3.26.2025
 * version: v 1.0
 * description: a driver for the Die class
 */

//import scanner

public class OOP_Die {
   public static void main(String[] args) {
     
	   Die1 die = new Die1();
	   //output the faceValue
	   System.out.println(die.getFaceValue());

	   die.roll();
	   //print the faceValue after roll
	   System.out.println(die.getFaceValue());//call the getter; invoke the method by writing the name die
	   
	   System.out.println(die);

	   System.out.println(die.roll());

	   
	   Die2 die2 = new Die2(7);
	   System.out.println(die2);

	   System.out.println(die2.roll());//check if you have all the right code in Die2.java; don't keep many similar classes of similar name
	   
	   
	   
	   
   }
   
   
   
}
