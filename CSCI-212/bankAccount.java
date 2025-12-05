/*
 * Name: bankAccount.java
 * Author: Lucy Buhayenko
 * data: 4.2.2025
 * version: v 1.0
 * description: create class that represents bank account
 */
//import scanner

public class bankAccount {

	
		
		//attributes
		
		private String accountNumber; //ALLOWS ACCESS FROM THE ATTRIBUTE; 
		private String firstName; //the public is enforcing the encapsulation 
		private String lastName;
		private double balance;
		
		
		//methods
		
		//constructors
		public bankAccount(String firstName, String lastName) {
			//for accountNumber - need a random 8 digit
			//Math,random() * 
			String genNumber = Integer.toString((int)(Math.random() * Math.pow(10, 8)));
			while (genNumber.length() < 8) {
				genNumber = "0" + genNumber;
			}
			//another conversion of this
			//actNum = generator.nextLong(10000000, 100000000); long integer and the smallest value is = 8 digits, the highest value = 9 digits
			this.firstName = firstName;
			this.lastName = lastName;
			balance = 0;
			accountNumber = genNumber; //assigns the accountNumber with randomly generated number
			
			
			
		}
		
		
		
		//setters = access
		public void setFirstName(String name) {
			firstName = name;
		}
		public void setLastName(String name) {
			lastName = name;
		}
		public void setBalance(double b) {
			balance = b;
		}
		
		
		
		//getters = modifier
		public String getFirstName() {//get first name
			return firstName;
		}
		public String getLastName() {//get last name
			return lastName;
		}
		public double getBalance() {//get balance
			return balance;
		}
		public String getAccountNumber() {//get account number
			return accountNumber;
		}
		
		//withdrawal
		public void withdrawal(double num) {
			//check if the amount here is less then the balance
			if(num > balance) {
				System.out.println("Error. Insufficient funds.");
				return;//exits out of the method and comes back to the method that called it
										//to only use the yes branch, we need to exit
			}
			else {
				 balance -= num;

			}
		}
		
		
		//deposit
		public void deposit(double num) {
			 balance += num;
		}
		
		//compare name
		public boolean check_same_owner(bankAccount acct2) {
			boolean result = true;
			if((this.firstName.compareToIgnoreCase(acct2.firstName)) != 0 || (this.lastName.compareToIgnoreCase(acct2.lastName)) != 0 ) {
				result = false;			//for the first name of the object that i'm calling this method for,
																		 //i'm comparing the first name to acct2, 
																		//so 0 means they are the same, 
																	   //if they are different return false
			}
			return result;
			
		}
		
		
		//toString
		public String toString() {
			return ("The account number: " + accountNumber + 
					"\nName: " + firstName + " " + lastName + //toString helps us display whatever we want for the user
					"\nBalance: " + balance);
					
		}
		//let's do overloading for toString
		public String toString(int x) {
			return (x == 1) ? ("Account number is " + getAccountNumber()) : "Nothing";
		}
		
		//there is a method overload - toString; they have different parameters
		
		
		
	}


