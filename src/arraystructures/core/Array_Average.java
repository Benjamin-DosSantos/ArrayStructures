package arraystructures.core;

import java.util.Random;

public class Array_Average {
	
	/** 
	 * 
	 *	Name: Benjamin DosSantos 
	 *	Assignment: Array Average
	 *	Project Description: This program 
	 *  is intended to display an array 
	 *  then calculate and display the 
	 *  value of the average of the array.
	 **/
	
	public static void main(String[] args){
		int comp_array[] = new int[10];
		Random ran = new Random();
		int range = 200;
		
		for(int i = 0; i < comp_array.length; i++){
			comp_array[i] = ran.nextInt(range);
		}// End of for comp array
		
		System.out.println("The Original Array: ");
		
		for(int i = 0; i < comp_array.length; i++){
			System.out.println(i + " = " + comp_array[i]);
		}
		
		System.out.println("\n" + "The Average of the Array: ");
		
		int sum = 0;
		for(int i = 0; i < comp_array.length; i++){
			sum += comp_array[i];
		}// End of for comparray
		
		System.out.println(sum / comp_array.length);
	}// End of method
}// End of class
