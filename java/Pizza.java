
public class Pizza 
{
	private static int size; // data field
	private static double price; 
	private static String toppings;
			
	// /** // Custom default constructor
	public Pizza() 
	{
		size = 12;
		price = 20.00;
		toppings = "pepperoni, anchovie, ranch";
	}
	// **/
	
	public static int getSize() // get size
	{
		return size;		
	}
	
	public static void setSize(int n) // set size
	{
		size = n;
	}
	
	public static double getPrice() // get price
	{
		return price;		
	}
	
	public static void setPrice(double d) // set price
	{
		price = d;
	}
	
	public static String getToppings() // get toppings
	{
		return toppings;		
	}
	
	public static void setToppings(String s) // set toppings
	{
		toppings = s;
	}
}
