import java.util.*;
public class ChooseMgrWithValidation
{
	public static void main(String[] args) 
	{
		// Declare class variables
		int eventType;
		String chosenManager;
		final int PRIVATE_CODE = 1;
		final int CORP_CODE = 2;
		final String PRIV_MANAGER = "Bob Johnson";
		final String CORP_MANAGER = "Diba Conchita Diwali";
		
		// Get input from user
		Scanner input = new Scanner(System.in);
		System.out.println("What type of event are you scheduling?");
		System.out.print("Enter " + PRIVATE_CODE + " for private, " + CORP_CODE + " for corporate > ");
		eventType = input.nextInt();
		
		// Validate input using while loop
		while(eventType != PRIVATE_CODE && eventType != CORP_CODE)
		{
			System.out.println();
			System.out.println("--- INPUT VALIDATION ERROR ---");
			System.out.println("You entered " + eventType + " which is an invalid selection.");
			System.out.print("Enter " + PRIVATE_CODE + " for private, " + CORP_CODE + " for corporate > ");
			eventType = input.nextInt();
		}
		
		// Decide what manager to choose
		if(eventType == PRIVATE_CODE)
			chosenManager = PRIV_MANAGER;
		else
			chosenManager = CORP_MANAGER;
		
		// Output the chosen manager
		System.out.println();
		System.out.println("You entered " + eventType + ".");
		System.out.println("The manager for this event will be " + chosenManager + ".");
	}

}
