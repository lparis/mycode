import java.util.Scanner;

public class ComparisonCase 
{	
	public static void main(String[] args)
	{
	   String aName = "Bob";
	   String anotherName;
	   Scanner input = new Scanner(System.in);
	   System.out.print("Enter your name Bob > ");
	   anotherName = input.nextLine();
	   
	   if (aName.equals(anotherName))
	   {
		   System.out.println("TRUE: '" + anotherName + "'" + " equals " + "'" + aName + "'");
	   }
	   else
	   {
		   System.out.println("FALSE: '" + anotherName + "' does not equal " + "'" + aName + "'");
	   }
	   
	   if (aName.equalsIgnoreCase(anotherName))
	   {
		   System.out.println("TRUE: '" + anotherName + "' equals '" + aName + "' if case is ignored");
	   }
	   else
	   {
		   System.out.println("FALSE: '" + anotherName + "' does not equal '" + aName + "'");
	   }
	   input.close();
   }
}