
public class Employee 
{
	private int empNum;			// Employee class variables
	private double empSal;
	
	Employee(int e, double s) 	// Employee constructor
	{							// Takes as input int and double
		empNum = e;				// Assigns input value to class variables
		empSal = s;
	}
	
	public int getEmpNum()		// Returns employee number
	{
		return empNum;
	}

	public double getSalary()	// Returns employee salary
	{
		return empSal;
	}
}
