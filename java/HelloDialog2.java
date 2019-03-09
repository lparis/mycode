/*
 * Lesson 1 Hello class
 * Author lparis
 */

import javax.swing.*;
/* This is the import statement for GUI output package.
 * You do not need to use the import statement with the 'System' class because it is 
 * part of the java.lang package that is automatically imported into every Java program.
 */

public class HelloDialog2 
/* The HelloDialog class demonstrates the use of the showMessageDialog() method
 * to print a message to a dialog box.
 */
{ // Class body open
	public static void main(String[] args)
	/* The HelloDialog class class calls the main() method, which takes
	 * the String object as an argument and does not return a value
	 * (is void). The main() method is called by the JVM.
	 */
	{ 
		JOptionPane.showMessageDialog(null, "Hello, world!");
		/* The syntax is as follows:
		 * Class.object.method(arg1, argN);
		 * Class = 'JOptionPane' is the class name (Java identifier)
		 * method = showMessageDialog() is member of 'JOptionPane' class (not necessary to create object it appears, why?)
		 * arg = "Hello, world!" is the arg for the println() method;
		 * literal string, displays exactly what is in quotes)
		 */
		// System.out.println("I am ready for Java!");
		// This prints a second string literal to the standard out (console).
	}

} // Class body close

