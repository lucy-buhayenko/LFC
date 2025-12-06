/*
 * Name: Die2.java
 * Author: Lucy Buhayenko
 * data: 3.31.2025
 * version: v 1.0
 * description: this is the class that defines an object die
 */

public class Die2 {
    //attributes
	
	private int faceValue;
	
	//methods
	//constructor
	public Die2() {
		//faceValue = 1;
		//would like a random value to be generate the face when an instance of die is created
		roll(); //we are changing the constructor
	}
	
	
	
	
	//an example of method overload
	public Die2(int initialValue) {
		if((initialValue<1) || (initialValue > 6)) {
			System.out.println("Invalid value. Face is set to 1 instead ");
			faceValue = 1;
		}
		else {
			faceValue = initialValue;
		}
		
			
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
    
    //equals method
    public boolean equals(Die2 die2) {
    	//this is doing this: faceValue of the object you are calling for
    	return (this.faceValue == die2.getFaceValue()) ? true:false;
    }
    
   
   
   
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
   
   
}
