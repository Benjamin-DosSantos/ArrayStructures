package arraystructures.core;

/** 
 * 
 *	Name: Benjamin DosSantos 
 *	Assignment: Checker Board
 *	Project Description: This program is 
 *  intended to display the contents of 
 *  multiple arrays with differing data types.
 * 
 **/


public class Array_String {
	public static void main(String[] args){		// Main method 
		String[] name_array = new String[8];	// Creates an array with a size of 8
		name_array[0] = "John";		// Sets the element of Name_Array[0] to "John"
		name_array[1] = "James";	
		name_array[2] = "Madison";	
		name_array[3] = "Michael";	
		name_array[4] = "Samantha";	
		name_array[5] = "Jameson";	
		name_array[6] = "Willow";	
		name_array[7] = "Elizabeth";
		
		for(int i = 0; i < name_array.length; i++){	// For the number of elements in the array 
			System.out.println("The element at index " + i + " is equal to: " + name_array[i]);	// Prints the value of the element at the index of i
		}// End of for loop
	}// End of main method
}// End of class
