import java.util.Scanner;

public class Interest {

	public static void main(String[] args) {
		
		double initialValue;									// Variable to hold return of method call
		initialValue = promptForValue();						// Calls method with no parameter
																// Stores the result in initialValue
		
		double withInterest;									// Variable to hold return of method call
		withInterest = valueWithInterest(initialValue);			// Calls method with input param
																// Stores the result in withInterest			
		
		// System.out.println("If your initial value is $" + initialValue + 		// Prints results of method calls
		// ", after 1 year at 5% interest you would have $" + withInterest + ".");
		
		// /**
		System.out.printf("With an initial investment of "); 	// Formats output for dollars (2 decimal places)
		System.out.printf("$%.2f", initialValue);  	
		System.out.print(", after 1 year at 5% interest you would have "); 
		System.out.printf("$%.2f", withInterest);
		System.out.print(".");
		// **/
	}
	 // Method obtains initial value from console user input prompt
	public static double promptForValue() {	// Method header
				
		double initialValue;	// Local variable for user input (int to calculate)
		
		Scanner input = new Scanner(System.in);	// input is object/instance of Scanner class, thus lower case
		
		System.out.println("Enter the amount of money to calculate the interest.");
		System.out.println("Amount must be whole dollars and not more than $2.147483647 billion.");	// Max size of int, yet it returns over that amount without error, how?
		System.out.print("$"); // User input prompt
		
		initialValue = input.nextInt(); 	// Scans the next token of the input as an int
											// Throws InputMismatchException if use enters decimal number
											// hence "(in whole dollars)"		
		return initialValue;				// Method returns initial value	
	}
	
	public static double valueWithInterest(double initialValue) {
		
		double withInterest;
		
		withInterest = initialValue * 1.05;
				
		return withInterest;
		
	}
}
