import java.util.ArrayList;
public class ArrayListDemo
{
   public static void main(String[] args)
   {
      ArrayList names = new ArrayList(); 	// New ArrayList object named "names", default constructor has space for 10 items
      names.add("Abigail");					// public void add(Object) method 
      display(names);
      names.add("Brian");					// adds an item
      display(names);
      names.add("Zachary");					// adds an item
      display(names);
      names.add(2, "Christy");				// public void add(int, Object) adds an item to the specified space
      display(names);
      names.remove(1);						// removes an item
      display(names);
      names.set(0, "Annette");				// replaces an item
      display(names);
   }
   public static void display(ArrayList names)
   {
      System.out.println("\nThe size of the list is " + names.size()); // Returns current array list size
      
      for(int x = 0; x < names.size(); ++x)
         
    	  System.out.println("position " + x + " Name: " + names.get(x)); // Retrieves an item from a specified location
   }
}
