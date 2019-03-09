/*
 * Lesson 1 Hello class
 * Author lparis
 */

public class Hello2 
/* The Hello class demonstrates the use of the println() method
 * to print the message Hello, world!
 */
{ // Class body open
	public static void main(String[] args)
	/* The Hello class class calls the main() method, which takes
	 * the String object as an argument and does not return a value
	 * (is void). The main() method is called by the JVM.
	 */
	{ 
		System.out.println("Hello, world!");
		/* The syntax is as follows:
		 * Class.object.method(arg1, argN);
		 * Class = 'System' is the class name (Java identifier)
		 * object = out is the object name, defined in 'System' class
		 * method = println() is member of 'System' class (and object)
		 * arg = "Hello, world!" is the arg for the println() method;
		 * literal string, displays exactly what is in quotes)
		 */
		System.out.println("I am ready for Java!");
		// This prints a second string literal to the standard out (console).
	}

} // Class body close
