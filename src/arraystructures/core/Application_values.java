package arraystructures.core;

import java.util.Random;

public class Application_values {
	
	/** 
	 * 
	 *	Name: Benjamin DosSantos 
	 *	Assignment: Application values
	 *	Project Description: This 
	 *	program is intended to display 
	 *	the original array and subsequent 
	 *	sub arrays that include: 0-9, 
	 *	13-19, values over 100 and values 
	 *	over 200; 
	 * 
	 **/
	
	public static void main(String[] args){
		Random ran = new Random();
		
		int number_array[] = new int[ran.nextInt(10) + 20];
		
		System.out.println("Original Array Size: " + number_array.length + "\n");
		
		for(int i = 0; i < number_array.length; i++){
			number_array[i] = ran.nextInt(290) - 40;
		}// End of for number array
		
		System.out.println("Original Array");
		for(int i = 0; i < number_array.length; i++){
			System.out.println(i + ": " + number_array[i]);
		}// End of for number array
		
		System.out.println("\n" + "Values 0 - 9");
		for(int i = 0; i < number_array.length; i++){
			if(number_array[i] >= 0 && number_array[i] <= 9){
				System.out.println(i + ": " + number_array[i]);
			}
		}// End of for number array
		
		System.out.println("\n" + "Values 13 - 19");
		for(int i = 0; i < number_array.length; i++){
			if(number_array[i] >= 13 && number_array[i] <= 19){
				System.out.println(i + ": " + number_array[i]);
			}
		}// End of for number array
		
		System.out.println("\n" + "Values in the 100's");
		for(int i = 0; i < number_array.length; i++){
			if(number_array[i] >= 100 && number_array[i] <= 199){
				System.out.println(i + ": " + number_array[i]);
			}
		}// End of for number array
		
		System.out.println("\n" + "Values over 200");
		for(int i = 0; i < number_array.length; i++){
			if(number_array[i] >= 200){
				System.out.println(i + ": " + number_array[i]);
			}
		}// End of for number array
	}// End of method
}// End of class
