package arraystructures.core;

import java.util.Random;

/** 
 * 
 *	Name: Benjamin DosSantos 
 *	Assignment: Populating Arrays
 *	Project Description: This program is 
 *	intended to create seven arrays that 
 *	will be populated and displayed to 
 *	console. These seven arrays include: 
 *	Random Number Array, Odd Number Array, 
 *	Even Number Array, Double Past Number 
 *	Array, Increment by ten, Powers of Two, 
 *	and Decrease by 5 Five. 
 * 
 **/

public class Populating_Array {
	public static void main(String[] args){
		int array_one_start_number = 0,
			array_one_number_to_gen = 20,
			array_one_range = 200,
			array_two_start_number = 1,
			array_two_number_to_gen = 7,
			array_three_start_number = 2,
			array_three_number_to_gen = 12,
			array_four_start_number = 3,
			array_four_number_to_gen = 30,
			array_five_start_number = 32,
			array_five_number_to_gen = 20,
			array_six_start_number = 2,
			array_six_number_to_gen = 20,
			array_seven_start_number = 289,
			array_seven_number_to_gen = 20;
		
		Random ran = new Random();
		
		System.out.println("Random Number Array:");
		
		int array_one[] = new int[array_one_number_to_gen];
		for(int i = array_one_start_number; i < array_one.length; i++){
			array_one[i] = ran.nextInt(array_one_range);
		}// End of for array one
		
		for(int i : array_one){
			System.out.println(i);
		}// End of print array one
		
		
		System.out.println("\n" + "Odd Number Array:");
		
		int array_two[] = new int[array_two_number_to_gen];
		int number_array_two = array_two_start_number;
		for(int i = 0; i < array_two.length; i++){
			array_two[i] = number_array_two;
			number_array_two += 2;
		}// End of for array two
		
		for(int i : array_two){
			System.out.println(i);
		}// End of for i
		
		
		System.out.println("\n" + "Even Number Array:");
		
		int array_three[] = new int[array_three_number_to_gen];
		int number_array_three = array_three_start_number;
		for(int i = 0; i < array_three.length; i++){
			array_three[i] = number_array_three;
			number_array_three += 2;
		}// End of for array two
		
		for(int i : array_three){
			System.out.println(i);
		}// End of for i
		
		
		System.out.println("\n" + "Double Past Number:");
		
		int array_four[] = new int[array_four_number_to_gen];
		int number_array_four = array_four_start_number;
		for(int i = 0; i < array_four.length; i++){
			array_four[i] = number_array_four;
			number_array_four = number_array_four * 2;
		}// End of for array two
		
		for(int i : array_four){
			System.out.println(i);
		}// End of for i
		
		
		System.out.println("\n" + "Increment By Ten:");
		
		int array_five[] = new int[array_five_number_to_gen];
		int number_array_five = array_five_start_number;
		for(int i = 0; i < array_five.length; i++){
			array_five[i] = number_array_five;
			number_array_five += 10;
		}// End of for array two
		
		for(int i : array_five){
			System.out.println(i);
		}// End of for i
		
		
		System.out.println("\n" + "Powers of 2:");
		
		int array_six[] = new int[array_six_number_to_gen];
		int number_array_six = array_six_start_number;
		double base = number_array_six;
		int exp = 1;
		for(int i = 1; i < array_six.length; i++){
			base = Math.pow(number_array_six, exp);
			exp++;
			array_six[i] = (int)base;
		}// End of for array two
		
		for(int i : array_six){
			System.out.println(i);
		}// End of for i
		
		
		System.out.println("\n" + "Decrease By 5:");
		
		int array_seven[] = new int[array_seven_number_to_gen];
		int number_array_seven = array_seven_start_number;
		for(int i = 0; i < array_seven.length; i++){
			array_seven[i] = number_array_seven;
			number_array_seven -= 5;
		}// End of for array two
		
		for(int i : array_seven){
			System.out.println(i);
		}// End of for i
	}// End of main method
}// End of class
