/**
 * @author lparis
 *
 */

import java.util.*;

public class DemoVariables {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		// An integer (int) is whole number without decimal places.
		// In Java an int can hold any whole number value from +2.1 billion to -2.1 billion.		
		// int entry = 315;
		int entry;
		int anotherEntry;
		
		// "entry" is the name of a variable of type int
		// The variable is unassigned or initialized
		
		Scanner keyBoard = new Scanner(System.in);
		
		System.out.print("Enter an integer: ");
		entry = keyBoard.nextInt();
		
		// Variable "entry" is assigned the value of the keyboard input
		// If the value entered is > 2.1 billion, throws errors
		
		System.out.print("Enter another integer: ");
		anotherEntry = keyBoard.nextInt();
		
		// Variable "anotherEntry" is assigned the value of the second keyboard input
		
		System.out.print("The entry is: ");
		System.out.println(entry);
		System.out.print("The other entry is: ");
		System.out.println(anotherEntry);
		
		System.out.println(entry + " plus " + anotherEntry + " is " + (entry + anotherEntry));
		System.out.println(anotherEntry + " minus " + entry + " is " + (anotherEntry - entry));

		
	}

}
