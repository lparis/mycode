
public class EmployeeObjects {

	public static void main(String[] args) {
		
		Employee[] emp = new Employee[7]; 		// Reserve memory for 7 Employee objects
		
		final int START_NUM = 101;				// Staring number (0 in Java)
		final double PAYRATE = 6.35;			// Flat rate (for now)
		
		for (int x = 0; x < emp.length; ++x) 	// Loop through 7 times (0 to 6), where the length of the array is 7
		{
			emp[x] = new Employee(START_NUM + x, PAYRATE); // Create 7 Employee object, staring at emp num 101 and incrementing by 1, with flat pay rate
		}
		
		// for (int x = 0; x < emp.length; ++x) 	// For loop to iterate over each employee object // ITU > Initialize, Test, Update
		// {									 	
		//	System.out.println("Employee Number: " + emp[x].getEmpNum() + "; Employee salary: " + emp[x].getSalary());
		// }
		
		for (Employee worker : emp)				// Enhanced for loop to cycle through array of objects
		{
			System.out.println("Enhanced Employee Number: " + worker.getEmpNum() + "; Enhanced Employee Salary: " + worker.getSalary());
		}

	}

}
