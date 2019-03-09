
public class CalculateInterest 
{	
	// Constructor instance variables
	double bal;
	double rate;
	double interest;
		
	// Custom default constructor
	/**
	public CalculateInterest() {
		bal = 1000.0;
		rate = 0.05;
		calculateInterest(bal, rate);
		System.out.println("Simple interest on $" + bal + " at " + rate + "% rate is $" + interest);
	}
	**/
	// Class variables
	private static int id;
	private static int numbOfRequests = 0;
	
	public static void calculateInterest(double bal, double rate) 
	{	
		double interest;
		interest = bal * rate;
		id = ++numbOfRequests;
		System.out.println("Simple interest on $" + bal + " at " + rate + "% rate is $" + interest);
		System.out.println("This is request #" + numbOfRequests);
	}
	
	public static void calculateInterest(double bal, int rate) 
	{		
		double interest, rateAsPercent;
		rateAsPercent= rate / 100.0;
		interest = bal * rateAsPercent;
		System.out.println("Simple interest on $" + bal + " at " + rate + "% rate is $" + interest);
	}	
}
