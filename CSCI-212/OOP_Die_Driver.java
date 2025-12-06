/*
 * Name: OOP_Die.java
 * Author: Lucy Buhayenko
 * data: 3.24.2025
 * version: v 1.0
 * description: this is the class that defines an object die
 */

public class OOP_Die_Driver{
    //attributes
	
	private int faceValue;
	
	//methods
	//constructor
	public OOP_Die_Driver() {
		faceValue = 1;
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
	
	
	public void roll() {
		faceValue = (int)(Math.random() * 6 + 1);
		
		//another option is to call the setter for the faceValue
		
		setFaceValue((int)(Math.random() * 6 + 1));
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
   
   
}
