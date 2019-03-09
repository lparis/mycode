// Application contains a starting list of three products for sale
// User prompted for additional items
// After each new entry, the alphabetically sorted list is displayed
// ArrayList can be use to store any type of object reference
// You cannot use ArrayList to store primitive types (int, double, char) because they are not references (objects)

import java.util.*;
public class DebugNine3
{
	public static void main(String[] args)
	{
		ArrayList<String>products = new ArrayList<String>();	// creates an ArrayList of type String <String> does a cast; this calls the ArrayList constructor
      															// When you store ArrayList elements, you must cast the type; you can do this is the declaration <String>
		products.add("shampoo");		// adds item to products ArrayList
		products.add("moisturizer");	// ArrayList starts with three products for sale
		products.add("conditioner");
      
		Collections.sort(products);		// Method Collections.sort(arg) sorts the array list with the ArrayList as the arg
		display(products);				// Method call with the ArrayList as arg
		final String QUIT = "Quit";
		String entry;
		Scanner input = new Scanner(System.in);
      
		System.out.print("\nEnter a product to add to the list, or " + QUIT + " to quit >> ");
		entry = input.nextLine();
		
		while(!entry.equalsIgnoreCase("Quit")) // Execute the loop while the user entry is not "Quit" -- case ignored
		{
			products.add(entry);			// Adds the newly entered item to the list
			Collections.sort(products);		// Sorts the updated list
			display(products);				// Method call to display() the updated list
			System.out.print("\nEnter a product or " + QUIT + " to quit >> ");	// Prompt for another product entry
			entry = input.nextLine();
		}
	}
	public static void display(ArrayList<String> products)	// Method display() takes ArrayList products as arg
	{
		System.out.println("\nThe size of the list is " + products.size());	// Prints the size (length) of the array
		for(int x = 0; x < products.size(); ++x)
		{
			System.out.println(products.get(x));
		}
	}
}