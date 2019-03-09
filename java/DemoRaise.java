
public class DemoRaise {

	public static void main(String[] args) {
		
		// Variables
		double mySalary = 130365.00;
		double moneyAmount = 300000.00;
		System.out.println("Demonstrating some raises");
		
		// Method calls 
		predictRaise(140000.00);		// Calls preditRaise() with input constant
		predictRaise(mySalary);		// Calls predictRaise() with variable mySalary
		predictRaise(moneyAmount);	// Calls with variable moneyAmount
				
	}
	// Method 			Calculates 3% raise 
	// Name				predictRaise()
	// Specifiers		public and static
	// Return type 		predictRaise()
	// Input parameter	double
	public static void predictRaise(double moneyAmount)
	{
		double newAmount;
		final double RAISE = 1.03;
		newAmount = moneyAmount * RAISE;
		System.out.println("With raise, salary is " + newAmount);
	}

}
