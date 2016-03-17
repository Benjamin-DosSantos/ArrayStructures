package arraystructures.core;

public class Array_Double {
	public static void main(String[] args){		// Main method 
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
	}// End of main method
}// End of class