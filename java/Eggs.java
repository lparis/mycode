import java.util.Scanner; // import statement

public class Eggs { // class body

	public static void main(String[] args) { // main body
		
		int numOfEggs; // integer variable, value obtained by user input
		
		Scanner input = new Scanner(System.in); // Class Input new Scanner object for console input
		
		// Console msg prompting user for total eggs
		System.out.print("Enter the number of eggs you have: ");
		numOfEggs = input.nextInt();
		
		// System.out.println("You want " + numOfEggs + " eggs."); // Enable to test main
		
		displayEggs(numOfEggs); // Calls method displayEggs(), passes numOfEggs as parameter, must come after Input 
		
	} // main close
	
	// Method displayEggs() takes int as input arg
	// Calculates dozens and leftovers
	// Prints eggs, dozens with leftovers
	// Variable is local, variable ID/name can be any name as long as int is arg, for example:
	// public static void displayEggs(int numOfEggs) { // this works but is confusing
	public static void displayEggs(int eggs) { // method body
		
		int dozen;
		int left;
		dozen = eggs / 12;
		left = eggs % 12;
				
		System.out.println("If you have " + eggs + " eggs then you have " + dozen + " dozen with " + left + " leftover.");
	}

}
