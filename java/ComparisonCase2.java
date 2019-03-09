import java.util.*;

public class ComparisonCase2 
{
	static String aName = "bob";
	static String anotherName;
	static String caseMatch = "Case match is ";
	static String caseInsensitiveMatch = "Case insensitive match is ";
	static String colon = ": ";
	static boolean caseMatchResult;
	
	/**
	public static void main(String[] args)
	{
		getAnotherName();
		caseMatch();
		printCaseMatch();
		caseInsensitiveMatch();
		printCaseInsensitiveMatch();
	}
	
	// get input
	public static String getAnotherName()
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter your name > ");
		anotherName = input.nextLine();
		return anotherName;
	}
	**/
	
	// match case
	public static boolean caseMatch()
	{
		if (aName.equals(anotherName))
		{
			return true;
			// return caseMatchResult;
		}
		else
		{
			return false;
		}
	}
	public static void printCaseMatch()
	{
		if (caseMatch() == true)
		{
			System.out.print(caseMatch + caseMatch() + colon);
			System.out.println("'" + anotherName + "'" + " equals " + "'" + aName + "'"); 
		}
		else
		{
			System.out.print(caseMatch + caseMatch() + colon);
			System.out.println("'" + anotherName + "'" + " does not equal " + "'" + aName + "'"); 
		}
	}
	public static boolean caseInsensitiveMatch()
	{
		if (aName.equalsIgnoreCase(anotherName))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	public static void printCaseInsensitiveMatch()
	{
		if (caseInsensitiveMatch() == true)
		{
			System.out.print(caseInsensitiveMatch + caseInsensitiveMatch() + colon);
			System.out.println("'" + anotherName + "'" + " equals " + "'" + aName + "' when case is ignored."); 
		}
		else
		{
			System.out.print(caseInsensitiveMatch + caseInsensitiveMatch() + colon);
			System.out.println("'" + anotherName + "'" + " does not equal " + "'" + aName + "'"); 
		}
	}
}
