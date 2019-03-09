/*
 * Java Project
 * CIS163_AA_Phillips
 * lparis Lesson 1.2 
 * BurmaShave.java
 */

import javax.swing.*;
/* This is the import statement for GUI output package.
 * You do not need to use the import statement with the 'System' class because it is 
 * part of the java.lang package that is automatically imported into every Java program.
 */

public class BurmaShav2 
/* The BurmaShave class produces a series of dialog boxes each displays one line of a 
 * Burma Shave slogan. The slogan chosen is "Train approaching / Whistle squealing / Stop / 
 * Avoid that run-down feeling / Burma-Shave" (http://en.wikipedia.org/wiki/Burma-Shave)
 */
{ // Class body open
	public static void main(String[] args)
	/* The BurmaShave class calls the main() method, which takes
	 * the String object as an argument and does not return a value
	 * (is void). The main() method is always called first by the JVM.
	 */
	{ 
		JOptionPane.showMessageDialog(null, "Train approaching");
		/* The syntax is as follows:
		 * Class.object.method(arg1, argN);
		 * Class = 'JOptionPane' is the class name (Java identifier)
		 * method = showMessageDialog() is member of 'JOptionPane' class (not necessary to create object it appears, why?)
		 * arg = "Train approaching" is the arg for the println() method; literal string, displays what is in quotes.
		 * Produces the first dialog and the first line of the Burma Shave slogan.
		 */
		JOptionPane.showMessageDialog(null, "Whistle squealing");
		// Produces second dialog with second line of the slogan.
		
		JOptionPane.showMessageDialog(null, "Stop");
		// Produces third dialog with third line of the slogan.

		JOptionPane.showMessageDialog(null, "Avoid that run-down feeling");
		// Produces fourth dialog with forth line of the slogan.

		JOptionPane.showMessageDialog(null, "Burma-Shave");
		// Produces fifth dialog with last line of the slogan.

		
	}

} // Class body close
