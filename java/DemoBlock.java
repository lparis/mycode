
public class DemoBlock {

	public static void main(String[] args) 
	{
		// Statement displays purpose of the program	
		System.out.println("Demonstrating block scope");
		
		// Statement displays first block value of x
		int x = 1111; // initialized variable x
		System.out.println();
		System.out.println("x = " + x + " in the first block.");
		
		// Block 2 -- New int y and display value of x and y
		{
			int y = 2222;
			System.out.println();
			System.out.println("x = " + x + " in the second block.");
			System.out.println("y = " + y + " in the second block.");			
		}
		
		// Block 3 -- Net int and display value of x and y
		{
			int y = 3333;
			System.out.println();
			System.out.println("x = " + x + " in the third block.");
			System.out.println("y = " + y + " in the third block.");
			
			// Method call to demoMethod within block 3
			demoMethod();
			System.out.println();
			System.out.println("x = " + x + " after demoMethod() call.");
			System.out.println("y = " + y + " after demoMethod() call.");
		}
		
		// Displays value of x (still 1111)
		System.out.println("x = " + x + " at the end.");
		
		} // closes main() method
	
	// demoMethod() creates its own x and y variables and assigns different values
	public static void demoMethod()
	{
		int x = 8888;
		int y = 9999;
		System.out.println();
		System.out.println("x = " + x + " in demoMethod().");
		System.out.println("y = " + y + " in demoMethod().");
	}
}
