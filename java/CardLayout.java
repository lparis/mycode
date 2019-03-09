/*
 * Java Project
 * CIS163_AA_Phillips
 * lparis Lesson 1.3 
 * CardLayout.java
 */

import javax.swing.*;
// Import the GUI library.

public class CardLayout 
// The CardLayout class produces a business card layout with name, address, city, state, zip, phone

{ // Class body open
	public static void main(String[] args)
	/* The CardLayout class class calls the main() method, which takes
	 * the String object as an argument and does not return a value.
	 */
	{ 	
		JOptionPane.showMessageDialog(null,"Business Card\n-----------\n"
				+ "+ Name\n+ Address\n   - Street\n   - City\n   - State\n"
				+ "   - Zip Code\n+ Phone\n   - Home\n   - Work\n");
		// "/n" creates a new line for each data item
		// "+" Concatenates the string across line breaks
	}

}
