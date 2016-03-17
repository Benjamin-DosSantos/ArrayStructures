package arraystructures.core;

public class Display_Array {
	
	/** 
	 * 
	 *	Name: Benjamin DosSantos 
	 *	Assignment: Display Arrays
	 *	Project Description: This program 
	 *	is intended to display 4 arrays: 
	 *	The Original Array, The Even Indexes 
	 *	in the original array, the odd indexes 
	 *	in the original array, and the original 
	 *	array backwards.  
	 * 
	 **/
	
	public static void main(String[] args){
		int[] numbers = {21980, 213432, 1243314, 2354, 123, 12432, 4323, 2344};
		
		System.out.println("Original Array");
		
		for(int i = 0; i < numbers.length; i++){
			System.out.println(i + ": " + numbers[i]);
		}
		
		System.out.println("\n" + "Even index");
		
		for(int i = 0; i < numbers.length; i += 2){
			System.out.println(i + ": " + numbers[i]);
		}
		
		System.out.println("\n" + "Odd index");
		
		for(int i = 1; i < numbers.length; i += 2){
			System.out.println(i + ": " + numbers[i]);
		}
		
		System.out.println("\n" + "Backwards Array");
		
		for(int i = numbers.length - 1; i > 0; i--){
			System.out.println(i + ": " + numbers[i]);
		}
		
	}// End of main method
}// End of class
