package arraystructures.core;

public class Array_Char {
	public static void main(String[] args){	// Main method
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
	}// End of main method
}// End of class
