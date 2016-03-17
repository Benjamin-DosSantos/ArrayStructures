package arraystructures.core;

import java.util.Random;
import java.util.Scanner;

/** 
 * 
 *	Name: Benjamin DosSantos 
 *	Assignment: This program 
 *  is intended to display the 
 *  contents of arrays. 
 *  It also teaches how to set 
 *  the size to arrays and also 
 *  how to use for each loops. 
 * 
 **/

public class DisplayValues {
	public static void main(String[] args){
		Random ran = new Random();	// Main Random Call
		int range = ran.nextInt(5) + 5;  // Generates a random number from 5 to 10	
		Scanner input = new Scanner(System.in);		// Sets up a input for the application	
		System.out.println("Please Enter " + range + " numbers.");	// Prints to console the number of numbers to enter
		
		int[] NumbersEntered = new int[range];	// Creates an array with the size of range
		
		for(int i = 0; i <= range; i++){	// for the size of the array
			if(i != range){		// If i is not equal to the final index 
				NumbersEntered[i] = input.nextInt();	// Continue to get the input from the user
			}else{	// if i is at the max size
				System.out.println("You Entered The Numbers: ");		// Print a greeting
				for(int num : NumbersEntered){	// For the size of the array
					System.out.println(num);	// cycle through all of the elements and print the value of that element 
				}// End of for NumbersEntered
			}// End of else
		}// End of for range
	}// End of main method
}// End of class
