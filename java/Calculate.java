

import java.util.Scanner;

public class Calculate {
	
	static int number01;
	static int number02;
	static int mathChoice;
	static String error = "Error message: ";
	static int result;
	static boolean validChoice = true;
	// static boolean invalidDemoninator = false;

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter two whole numbers separated by a space: ");
		number01 = input.nextInt();
		number02 = input.nextInt();		
		System.out.println("You entered numbers " + number01 + " and " + number02 + ".");
		System.out.println();
		System.out.println("Enter: \n1 to add the numbers \n2 to subtract the second number from the first" 
				+ "\n3 to multiply the numbers \n4 to divide the first number by the second");
		mathChoice = input.nextInt();
		performCalculation(mathChoice);
	}
	
	public static void performCalculation(int i)
	{
		if (mathChoice == 1)
		{
			validChoice = true;
			System.out.println("You chose to add the numbers.");
			result = number01 + number02;
			System.out.println(number01 + " plus " + number02 + " equals " + result + ".");
			System.out.println(number01 + " + " + number02 + " = " + result);
		}
		else if (mathChoice == 2)
		{
			validChoice = true;
			System.out.println("You chose to subtract the second number from the first.");
			result = number01 - number02;
			System.out.println(number01 + " minus " + number02 + " equals " + result + ".");
			System.out.println(number01 + " - " + number02 + " = " + result);
		}
		else if (mathChoice == 3)
		{
			validChoice = true;
			System.out.println("You chose to multiply the numbers.");
			result = number01 * number02;
			System.out.println(number01 + " multiplied by " + number02 + " equals " + result + ".");
			System.out.println(number01 + " x " + number02 + " = " + result);
		}
		else if (mathChoice == 4)
		{
			if (number02 == 0)
			{
				System.out.println(error + "Cannot divide by zero.");
			}
			else
			{
				validChoice = true;
				System.out.println("You chose to divide the first number by the second.");
				result = number01 / number02;
				System.out.println(number01 + " divided by " + number02 + " equals " + result + ".");
				System.out.println(number01 + " / " + number02 + " = " + result);
			}			
		}
		else
		{
			validChoice = false;
			System.out.println(error + "Invalid selection. \nEnter 1 to add, 2 to subtract, 3 to mutliply, 4 to divide");
		}			
	}
}
