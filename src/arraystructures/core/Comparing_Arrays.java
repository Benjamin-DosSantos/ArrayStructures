package arraystructures.core;

import java.util.Random;

public class Comparing_Arrays {
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
		
		System.out.println("\n" + "The Max int in the Array: ");
		
		int max_numb = comp_array[0];
		int min_numb = comp_array[0];
		
		for(int i = 1; i < comp_array.length; i++){
			if(comp_array[i] > max_numb){
				max_numb = comp_array[i];
			}// End of if comp_array > 
			if(comp_array[i] < min_numb){
				min_numb = comp_array[i];
			}// End of if comp <
		}// End of for comparray
		
		System.out.println(max_numb);
		
		System.out.println("The Min int in the Array: ");

		System.out.println(min_numb);
		
		System.out.println("\n" + "The Sum of the Array: ");
		
		int sum = 0;
		for(int i = 0; i < comp_array.length; i++){
			sum += comp_array[i];
		}// End of for comparray
		
		System.out.println(sum);
		
		System.out.println("\n" + "The Average of the Array: ");
		
		System.out.println(sum / comp_array.length);
	}// End of main method
}// End of main class