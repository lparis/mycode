
public class CarInsurancePolicy 
{
	// Class variables
	private int policyNumber;
	private int numPayments;
	private String residentCity;
	
	// Default no arg constructor.
	// Calls the display() method.
	// Numeric fields set to zero
	// Character fields set to Unicode \u0000
	// Boolean fields false
	// Objects set to null (such as String)
	public CarInsurancePolicy()
	{
		display();
	}
	
	// Constructor 1 -- requires all 3 data fields
	public CarInsurancePolicy(int num, int payments, String city)
	{
		policyNumber = num;
		numPayments = payments;
		residentCity = city;
	}
	
	// Constructor 2 -- requires only the ints
	public CarInsurancePolicy(int num, int payments)
	{
		this(num, payments, "Mayfield");
	}

	// Constructor 3 -- only requires policy number
	public CarInsurancePolicy(int num)
	{
		this(num, 2);
	}

	// Display method --
	public void display()
	{
		System.out.println("Policy #" + policyNumber + ". " 
				+ numPayments + " payments annually. "
				+ "Driver resides in " + residentCity + ".");
	}

}
