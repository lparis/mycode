
public class TestHousehold 
{
	public static void main(String[] args) 
	{		
		testJavaHousehold();
		testDefaultHousehold();
		testCustomHousehold();
	}
	
	// Method that creates a Household() object instance
	// Calls Java default no arg constructor
	// To use, comment out default constructor
	public static void testJavaHousehold()
	{
		Household javaHousehold = new Household();
		
		System.out.println("Testing default no arg Java constructor...");
		javaHousehold.display();
		System.out.println("(NOTE: Only valid if default constructor not provided.)");
	}
	
	public static void testDefaultHousehold()
	{
		Household defaultHousehold = new Household();
		
		System.out.println();
		System.out.println("Testing user-defined default getter constructor...");
		System.out.println("Default household has " + defaultHousehold.getOccupants() + " occupant(s)" +
				" and an annual income of $" + defaultHousehold.getIncome() + ".");
		System.out.println("(Uses values provided by class variables.)");
		System.out.println();
	}
	
	public static void testCustomHousehold()
	{
		Household customHousehold = new Household();
		
		Household.setOccupants(4);
		Household.setIncome(1000000.00);
		
		System.out.println("Testing setter constructor...");
		System.out.println("Custom household has " + customHousehold.getOccupants()  + " occupant(s)" +
				" and an annual income of $" + customHousehold.getIncome()  + ".");
		System.out.println("(Uses values set by this method.)");
	}	
}


