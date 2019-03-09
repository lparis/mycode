public class Car 
{
	// Class variable which are private (not accessible by methods outside this class)
	private int year;
	private Model model;
	private Color color;
	
	// Constructor takes int, Model, Color
	public Car(int yr, Model m, Color c)
	{
		year = yr;
		model = m;
		color = c;
	}
	// Display method
	public void display()
	{
		System.out.println("Car is a " + year + " " + color + " " + model);
	}
}
