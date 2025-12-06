/*
 * Name: circle_methods.java
 * Author: Lucy Buhayenko
 * data: 2.26.2025
 * version: v 1.1
 * description:calculate the area of a circle with a random radius
 */

//import random
import java.util.Random;

//import scanner
import java.util.Scanner;

public class circle_method {

	public static void main(String[] args) {
		//declare scanner class
		Scanner cs = new Scanner(System.in);
		
		Random rdn = new Random(); //import random 
		
		
		//randomly generate the radius
		float radius_rdn = Math.abs(rdn.nextInt()%6 + 1);
		
		//other version to generate random radius 1 to 6
		//float radius_rdn = Math.abs(rdn.nextInt() % 6);

		
		//call method called AreaCalc
		double r_1_6 = areaCalc(radius_rdn); 

		
		//calculate area best version using Math class to access the value of pi
		System.out.print("Circle with radius " + (++radius_rdn) + " has");
		System.out.printf("\nArea: %.4f", r_1_6);
		


	}
	
	
	
	//create method called areaCalc to return the area
	public static double areaCalc(double r) { //method that takes in double and that returns double
		double area = Math.PI * Math.pow(r,2); //calculate area
		return area;
	}

}
