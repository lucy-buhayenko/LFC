/*
 * Name: area.java
 * Author: Lucy Buhayenko
 * data: 1.27.2025
 * version: v 1.1
 * description: calculate area when you know the radius
 */
//import scanner
import java.util.Scanner;

public class area {

	public static void main(String[] args) {
		//declare scanner class
		Scanner cs = new Scanner(System.in);
		
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
