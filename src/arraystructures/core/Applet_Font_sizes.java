package arraystructures.core;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Toolkit;
import java.util.Random;

public class Applet_Font_sizes extends Applet{
	
	/** 
	 * 
	 *	Name: Benjamin DosSantos 
	 *	Assignment: Applet Font Sizes
	 *	Project Description: This program 
	 *	is intended to display names from 
	 *	an array at random positions on the 
	 *	screen with random colors and font sizes.
	 * 
	 **/
	
	
	static Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();		// Gets the dimension of the whole screen 
	static double width = screenSize.getWidth();	// Creates a double with the value of the screen width
	static double height = screenSize.getHeight();	// Creates a double with the value of the screen height 

	
	public void paint(Graphics g){
		
		this.setSize((int)width, (int)height);
		
		Random ran = new Random();
		
		int Font_size[] = new int[10];
		Font_size[0] = 8;
		Font_size[1] = 12;
		Font_size[2] = 16;
		Font_size[3] = 20;
		Font_size[4] = 24;
		Font_size[5] = 28;
		Font_size[6] = 36;
		Font_size[7] = 48;
		Font_size[8] = 60;
		Font_size[9] = 72;
				
		
		String Name_array[] = new String[20];
		Name_array[0] = "Ben";
		Name_array[1] = "Brett";
		Name_array[2] = "John";
		Name_array[3] = "Mary";
		Name_array[4] = "Jeffery";
		Name_array[5] = "Geoff";
		Name_array[6] = "Mike";
		Name_array[7] = "Issac";
		Name_array[8] = "Jack";
		Name_array[9] = "Sean";
		Name_array[10] = "Selena";
		Name_array[11] = "Skyla";
		Name_array[12] = "Shyla";
		Name_array[13] = "Kim";
		Name_array[14] = "Sam";
		Name_array[15] = "Paul";
		Name_array[16] = "Marc";
		Name_array[17] = "Kyle";
		Name_array[18] = "Brandon";
		Name_array[19] = "Samson";
		
		for(int i = 0; i < Name_array.length; i++){
			int color_red = ran.nextInt(256);
			int color_green = ran.nextInt(256);
			int color_blue = ran.nextInt(256);
			
			Font ft = new Font("Courier", Font.BOLD, Font_size[ran.nextInt(Font_size.length - 1)]);
			g.setFont(ft);
			g.setColor(new Color(color_red, color_green, color_blue));
			g.drawString(Name_array[i], ran.nextInt((int)width), ran.nextInt((int)height));
		}
	}// End of method
}// End of class 
