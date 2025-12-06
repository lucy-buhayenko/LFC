/*
 * Name: Die1.java
 * Author: Lucy Buhayenko
 * data: 3.26.2025
 * version: v 1.0
 * description: this is the class that defines an object die
 */

public class Die1 {
    //attributes
	
	private int faceValue;
	
	//methods
	//constructor
	public Die1() {
		//faceValue = 1;
		//would like a random value to be generate the face when an instance of die is created
		roll(); //we are changing the constructor
	}
	
	
	
	//setters 
	public void setFaceValue(int setValue) {
		faceValue = setValue;
	}
	
	//getters
	public int getFaceValue() {
		return faceValue;
	}
	
	
	//roll method
	//one of the methods would "roll" the die by setting 
	//faceValue to a random number between 1 to 6(setting the faceValue)
	
	
	public int roll() {
		faceValue = (int)(Math.random() * 6 + 1);
		
		//another option is to call the setter for the faceValue
		
		setFaceValue((int)(Math.random() * 6 + 1));
		return faceValue;
		
		
	
	}
	
	//toString method
    public String toString() {
    	return "The face value of this is die is " + faceValue;
    }
    //it doesn't have the main method 
    
    
    
   
   
   
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
   
   
}
