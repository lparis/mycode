
public class Household 
{
	private static int numOccupants;
	private static double annualIncome;
	
	// Default constructor
	// Comment out to test Java-supplied constructor	
	///**
	public Household()
	{
		numOccupants = 1;
		annualIncome = 0;
	}
	//**/
	public int getOccupants() // get number of occupants
	{
		return numOccupants;		
	}
	
	public static void setOccupants(int n) // set occupants
	{
		numOccupants = n;
	}
	
	public double getIncome() // get income
	{
		return annualIncome;		
	}
	
	public static void setIncome(double d) // set income
	{
		annualIncome = d;
	}
	
	public void display()
	{
		System.out.println("Java household has " + numOccupants + " and an annual income of " + annualIncome + ".");
	}
}

