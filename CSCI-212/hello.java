//scanner
	
	import java.util.Scanner;
	
	//random
	import java.util.Random;
	
	//arrayList
	import java.util.ArrayList; 
	
	



public class hello{
	
	//declare scanner 
	Random r = new Random();
	
	//declare random 
	Scanner cs = new Scanner(System.in);
	
	
	
	//make random number from 1 to 11
	 

	
	//attributes
	
	
	
	//constructor
	public hello() {
			
	}
	
	
	//methods
	public static void chageArray(int[] array) {
		array[0] = 1;
	}
	
	
	//getters
	
	
	
	//setters
	
	//toString
	
	//comparing
	
	
	
	
	
	public static void main(String[] args) {
		//this is main class
		
		Random r = new Random();
		
		int random1 = r.nextInt(12) + 1;
		 System.out.print(random1);
		 int[] array = new int[10];
		 for(int i : array) {
			 System.out.println(i);
		 }
		 
		 
		 chageArray(array);
		 for(int i : array) {
			 System.out.println(i);
		 }
		 
		 
		 
		 ArrayList<Integer> vals = new ArrayList<Integer>();
	
		 //valsList is a reference variable that refers to an ArrayList object consisting of Integer objects.
		 
		 ArrayList<Integer> name = new ArrayList<Integer>();
		 
		 
		 
		// List originally empty
		 vals.add(31); // List now: 31 
		 vals.add(777);
		 vals.add(342561);
		 vals.add(673);
		 int index = 1;
		 vals.get(index);
		 
		 System.out.println(vals);
		 
		 vals.set(1,7);
		 System.out.println(vals);

		 
		 //set(index, element) 
		 //Replaces the element at the specified position in this list with the specified element.	

		 //valsList.set(1, 119);  // List now 31 119 59
		 vals.size();
		 System.out.println(vals);
		 
		 
		 
		 int x = vals.get(0);  // Assigns 31 to x
		 System.out.println(x);
		 
		 
		 final int NUM_ELEMENTS = 8;
		 ArrayList<Double> userNums = new ArrayList<Double>();
		 Scanner scnr= new Scanner(System.in);
		 
		 
		 System.out.println("Enter " + NUM_ELEMENTS + " numbers...");
	      for (int i = 0; i < NUM_ELEMENTS; ++i) {
	         System.out.print("Number " + (i + 1) + ": ");
	         userNums.add(scnr.nextDouble());
	      }
	      
	      
	      double sumVal = 0.0;
	      for (int i = 0; i < userNums.size(); ++i) {
	         sumVal = sumVal + userNums.get(i); // Calculate sum of all numbers
	      }
	      double averageVal = sumVal / userNums.size(); 
		 
	}
}