
public class Shirt 
{
	// public static final String Material = Cotton;
	double collarSize;
	double sleeveLength;
	public static String Material = "Cotton";
	int pockets;
	
	// Default constructor
	public Shirt(double c, double s, int p)
	{		
		collarSize = c;
		sleeveLength = s;
		// Material = string;
		pockets = p;
	}
	
	// Custom constructor
	public Shirt(double c, double s, String string, int p)
	{		
		collarSize = c;
		sleeveLength = s;
		Material = string;
		pockets = p;
	}
}
