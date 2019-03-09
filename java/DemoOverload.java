
// The DemoOverload class demonstrates how to overload methods, 
// which means to use methods with the same name and do different things
// by accepting different inputs

public class DemoOverload {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int month = 6, day = 24, year = 2012;
		displayDate(month); // method 1
		displayDate(month, day); // method 2
		displayDate(month, day, year);

	}
	
	public static void displayDate(int mm) 
	{
		System.out.println("Event date " + mm + "/01/2013");
	}
	
	public static void displayDate(int mm, int dd) 
	{
		System.out.println("Event date " + mm + "/" + dd + "/2013");
	}

	public static void displayDate(int mm, int dd, int yy) 
	{
		System.out.println("Event date " + mm + "/" + dd + "/" + yy);
	}
}
