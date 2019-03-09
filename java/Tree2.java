/*
 * Java Project
 * CIS163_AA_Phillips
 * lparis Lesson 1.1 
 * Tree.java
 */

public class Tree2
/* The Tree class demonstrates the use of the println() method
 * to print a tree pattern to the standard output console.
 */
{ // Class body open
	public static void main(String[] args)
	/* The Tree class class calls the main() method, which takes
	 * the String object as an argument and does not return a value
	 * (is void). The main() method is called by the JVM.
	 */
	{ 
		System.out.println("   X   ");
		/* The syntax is as follows:
		 * Class.object.method(arg1, argN);
		 * Class = 'System' is the class name (Java identifier)
		 * object = out is the object name, defined in 'System' class
		 * method = println() is member of 'System' class (and object)
		 * arg = "X" is the arg for the println() method;
		 * literal string, displays exactly what is in quotes)
		 * Spaces are used to create the pattern on the display output.
		 */
		System.out.println("  XXX  ");
		// This prints a second string literal to the standard out (console).
		System.out.println(" XXXXX ");
		System.out.println("XXXXXXX");
		System.out.println("   X   ");
	}

} // Class body close