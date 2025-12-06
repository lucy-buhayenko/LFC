/*
 * Name: circle.java
 * Author: Lucy Buhayenko
 * data: 1.31.2025
 * version: v 1.1
 * description:calculate the area of a circle with a random radius
 */

//import random
import java.util.Random;

//import scanner
import java.util.Scanner;

public class circle {

	public static void main(String[] args) {
		//declare scanner class
		Scanner cs = new Scanner(System.in);
		
		Random rdn = new Random();
		
		
		//randomly generate the radius from 1 to 6
		int radius_random = rdn.nextInt(1,7);
		int radius_random2 = rdn.nextInt(6);
		int radius_random3 = rdn.nextInt()%6+1;

		System.out.println(radius_random);
		System.out.println(radius_random2);
		System.out.println(radius_random3);
		
		
		
		
		//use a constant variable for consistency and avoiding mistakes
		final float PI = 3.1415f;
		
		//get input for radius of circle as a double
		System.out.print("Please enter radius of the circle: ");
		double radius = cs.nextDouble();
		
		
		
		//calculate area first version
		double area1 = radius * radius * 3.14;
		System.out.println("The area is " + area1);

		//calculate length 
		double length = radius * 2 * PI;
		System.out.println("The length of the circle with the given circle radius is " + length);


		
		//calculate area best version using Math class to access the value of pi
		double area = Math.PI * Math.pow(radius, 2);
		System.out.printf("The area is %.2f", area);
		
		//or you could do 
		System.out.printf("\nArea is %.4f", Math.PI * Math.pow(radius, 2));


	}

}
