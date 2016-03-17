package arraystructures.core;

public class Array_Int {
	public static void main(String[] args){		// Main method
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
	}// End of main method
}// End of class