
public class TestShirt 
{
	public static void main(String[] args) 
	{		
		// Create myShirtDefault Shirt object
		Shirt myShirtDefault = new Shirt(16.5, 34, 1);
		System.out.println("My default shirt fit: " + 
				"Collar = " + myShirtDefault.collarSize + " inches. Sleeves = " + myShirtDefault.sleeveLength +	
				" inches. Material = " + myShirtDefault.Material + ". Pockets = " + myShirtDefault.pockets + ".");
		
		// Create myShirtSmall Shirt object
		Shirt myShirtSmall = new Shirt(16, 33, 2);
		System.out.println("My small shirt: " + 
				"Collar = " + myShirtSmall.collarSize + " inches. Sleeves = " + myShirtSmall.sleeveLength +	
				" inches. Material = " + myShirtSmall.Material + ". Pockets = " + myShirtSmall.pockets + ".");
		
		// Create myShirtLarge		
		Shirt myShirtLarge = new Shirt(17, 36, "Polyester", 3);
		System.out.println("My large shirt: " + 
				"Collar = " + myShirtLarge.collarSize + " inches. Sleeves = " + myShirtLarge.sleeveLength +	
				" inches. Material = " + myShirtLarge.Material + ". Pockets = " + myShirtLarge.pockets + ".");
	}
}
