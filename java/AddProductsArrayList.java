// Source = DebugNine3.java

import java.util.*;

import javax.swing.JOptionPane;
public class AddProductsArrayList
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
		final String QUIT = "QUIT";
		String entry;
		Scanner input = new Scanner(System.in);
		
		do
		{
			// entry = JOptionPane.showInputDialog(null, "Enter a product to add to the list. \nEnter " + QUIT 
					// + " when you are done.", "Enter Product", JOptionPane.PLAIN_MESSAGE);
			System.out.print("Enter a product to add to the list. \nEnter " + QUIT + " when you are done.");
			entry = input.nextLine();
			products.add(entry);
			Collections.sort(products);
		}
		while(!entry.equalsIgnoreCase("QUIT")); // Execute the loop while the user entry is not "Quit" -- case ignored
		
		if (entry.equalsIgnoreCase("QUIT"))
		{
			display(products);
		}
	}
	public static void display(ArrayList<String> products)	// Method display() takes ArrayList products as arg
	{
		// JOptionPane.showMessageDialog(null, "The size of the list is " + products.size(), "ArrayList Size", JOptionPane.PLAIN_MESSAGE);
		System.out.println("\nThe size of the list is " + products.size());	// Prints the size (length) of the array
		for(int x = 0; x < products.size(); ++x)
		{
			// JOptionPane.showMessageDialog(null, products.get(x), "Product List", JOptionPane.INFORMATION_MESSAGE);
			System.out.println(products.get(x));
		}
	}
}