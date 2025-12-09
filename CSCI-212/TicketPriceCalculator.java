/*
 * Name: TicketPriceCalculator.java
 * Author: Lucy Buhayenko
 * data: 2.24.2025
 * version: v 1.0
 * description: The input from the end user consists of the following: day of show (weekday/weekend), time of show (2 PM or 7 PM), customer's age, and number of tickets to be purchased together; it prints the individual ticket price for a Broadway show. The output should clearly indicate the price, along with all the show details provided as input (day, time, group size, age) in a user-friendly way.
 */
//import scanner
import java.util.Scanner;

public class TicketPriceCalculator {

	public static void main(String[] args) {
		
		
		//declare ticket
		double ticket = 0.0;
		
		
		//declare scanner class
		Scanner cs = new Scanner(System.in);
		
		
		//ask user if it's a weekday or weekend
		System.out.println("What is the day of the show? (weekday/weekend)");
		String day = cs.next();
		
		//checks for bad input
		while(!(day.equals("weekday") || day.equals("weekend"))) {
			System.out.println("Incorrect input. Enter weekend or weekday: ");
			day = cs.next();
		}
		
		// decides on price for ticket depending on day
		switch(day) {
			case "weekday":
				ticket = 80.0; //$80 for weekday
				break;
			case "weekend":
				ticket = 100.0; //$100 for weekend
				break;
				
		}
		
		
		
		//asks user time of the show
		System.out.println("At what time is the show? 2 PM or 7 PM (type 2 or 7)");
		int time = cs.nextInt();
		
		//checks for bad input
		while (!(time == 2||time == 7)) {
			System.out.println("Incorrect input. Enter 2 or 7: ");
			time = cs.nextInt();
		}
		
		
		//2 PM has discount
		if(time == 2){
			ticket *= 0.90; //discount 10% for 2 PM
		}//for 7PM no discount
			
	
		//asks user his/her age
		System.out.println("Enter your age: ");
		int age = cs.nextInt();
		
		//checks for bad input for age
		while(age <= 0) {//age can't be negative or 0
			System.out.println("Incorrect input. Enter your age: ");
			age = cs.nextInt();
		}
		
		
		//people that are 65 and higher get a discount, kids have tickets for free
		if(age >= 65) {
			ticket *= 0.80; // 20% discount for seniors
		}
		else if(age < 5) {
			ticket = 0; //free for kids under 5
		}
		
		
		
		//ask user about number of tickets
		System.out.println("Enter number of tickets to be purchased together: ");
		int num_tickets = cs.nextInt();
		
		
		//check for bad input for number of tickets
		while(num_tickets<=0) {//tickets can't be negative or 0
			System.out.println("Incorrect input. Enter your total number of tickets: ");
			num_tickets = cs.nextInt();
		}
		
		//groups get discount
		if(num_tickets >= 8) {
			ticket *= 0.85; //15% discount for groups
			
		}
		
		
		
		//print result for BroadWay tickets
		System.out.println();
		System.out.println("-Show details-");
		System.out.println();
		System.out.println("Day of show: " + day);
		System.out.println("Time: " + time + " PM");
		System.out.println("Age: " + age);
		System.out.println("Number of tickets: " + num_tickets);
		
		System.out.println("Individual Ticket Price for BroadWay show: $" + ticket);
		System.out.println("Total price: $" + (num_tickets * ticket));
		
		
		
		
		
    
	}

}
