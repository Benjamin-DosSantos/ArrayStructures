package arraystructures.core;

public class Array_Boolean {
	public static void main(String[] args){	// Main method
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
