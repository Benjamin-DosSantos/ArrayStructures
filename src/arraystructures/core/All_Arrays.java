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


public class All_Arrays {
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
		
		System.out.println("\n");
		
		int[] number_array = new int[10];	// Creates a new integer array with a size of 10
		number_array[0] = 254;	// sets the first element in the array, at index 0, to 254
		number_array[1] = 512;
		number_array[2] = 2;
		number_array[3] = 64;
		number_array[4] = 2048;
		number_array[5] = 1142;
		number_array[6] = 2251;
		number_array[7] = 48;
		number_array[8] = 36;
		number_array[9] = 21;
		
		for(int i = 0; i < number_array.length; i++){	// For the number of elements in the array
			System.out.println("The element at index " + i + " is equal to: " + number_array[i]);	// Prints the value of the element at the index of i
		}// End of for loop
		
		System.out.println("\n");
		
		double[] double_array = new double[7];	// Creates an array of type double that has a size of 7
		double_array[0] = 2.36;		// Sets the first element in the array, at index 0, to 2.36
		double_array[1] = 58.866;
		double_array[2] = 27.36;
		double_array[3] = 64.98;
		double_array[4] = 204.05;
		double_array[5] = 11.78;
		double_array[6] = 2.89;
			
		for(int i = 0; i < double_array.length; i++){	// For the elements in the array
			System.out.println("The element at index " + i + " is equal to: " + double_array[i]);	// Prints the value of the element at the index of i
		}// End of for loop
			
		System.out.println("\n");
		
		char[] char_array = new char[10];	// Creates a new char array with a size of ten 
		char_array[0] = 110;	// Sets char_array element one, at index 0, to 110 or 'n'
		char_array[1] = 122;
		char_array[2] = 107;
		char_array[3] = 119;
		char_array[4] = 107;
		char_array[5] = 116;
		char_array[6] = 113;
		char_array[7] = 112;
		char_array[8] = 114;
		char_array[9] = 122;
			
		for(int i = 0; i < char_array.length; i++){	// for the number of elements in the array
			System.out.println("The element at index " + i + " is equal to: " + char_array[i]);	// Prints the value of the element at the index of i
		}// End of for loop
			
		System.out.println("\n");
		
		boolean[] boolean_array = new boolean[9];	// Creates a new array called boolan_array with a size of 9 and a type of boolean
		boolean_array[0] = false;	// sets the first element in the array, at index 0, to true
		boolean_array[1] = false;
		boolean_array[2] = true;
		boolean_array[3] = false;
		boolean_array[4] = true;
		boolean_array[5] = false;
		boolean_array[6] = true;
		boolean_array[7] = true;
		boolean_array[8] = false;
			
		for(int i = 0; i < boolean_array.length; i++){	//for the number of elements in the array
			System.out.println("The element at index " + i + " is equal to: " + boolean_array[i]);	// Prints the value of the element at the index of i
		}// End of for loop
	}// End of main method
}// End of class