

import java.util.Scanner;

public class PetAdvice 
{
	static int resType;
	static int hrsHome;
	static int recPet;
	static String resTypeName = null;
	static String hrsHomeString = null;
	static String recPetString = null;
	static String recPet1 = "Pot-bellied pig";
	static String recPet2 = "Dog";
	static String recPet3 = "Snake";
	static String recPet4 = "Cat";
	static String recPet5 = "Hamster";
	static String recPet6 = "Fish";
	static String recPet7 = "Ant farm";
	
	public static void main(String[] args)
	{							
		// Uses Scanner class to prompt user for residence input.
		Scanner input = new Scanner(System.in); 	
		System.out.println("Where do you reside?");
		System.out.println("Enter: \n1 for Apartment \n2 for House \n3 for Dormitory"); 
		resType = input.nextInt();
		
		// Uses switch statement to determine the type of residence.
		switch(resType)
		{
		case 1:
			resTypeName = "Apartment";
			break;
		case 2:
			resTypeName = "House";
			break;
		case 3:
			resTypeName = "Dormitory";
			break;
		// Displays error message if user enters invalid residence.
		default:
			System.out.println("Error: Invalid selection.");
			System.out.close();
		}
		
		// Uses Scanner class to prompt user for residence input.
		System.out.println();	
		System.out.println("How many hours do you spend at home?");
		System.out.println("Enter: \n1 if 18 or more \n2 if 10 to 17 \n3 if 8 to 9 \n4 if 6 to 7 \n5 if 0 to 5");
		hrsHome = input.nextInt();
		
		// Uses switch statement to determine hours at home.
		switch(hrsHome)
		{
		case 1:
			hrsHomeString = "18 or more hours";
			break;
		case 2:
			hrsHomeString = "10 to 17 hours";
			break;
		case 3:
			hrsHomeString = "8 to 9 hours";
			break;
		case 4:
			hrsHomeString = "6 to 7 hours";
			break;	
		case 5:
			hrsHomeString = "0 to 5 hours";
			break;	
		default:
			System.out.println("Error: Inalid selection."); 
		}
		System.out.println("If you reside in a " + resTypeName + " (" + resType + "),");
		System.out.println("and you spend " + hrsHomeString + " at home" + " (" + hrsHome + "),");
		getRecPet(resType, hrsHome);
	}
	
	// Method getRecPet() uses if...else statements to decide recommended pet.
	public static void getRecPet(int resType, int hrsHome)
	{
		// 2 + 1 = Pig 1
		if(resType == 2 && hrsHome == 1)
		{
			recPet = 1;
			System.out.println("then your recommended pet is a " + recPet1 + " (" + recPet + ").");
		}
		// 2 + 2 = Dog 2
		if(resType == 2 && hrsHome == 2)
		{
			recPet = 2;
			System.out.print("then your recommended pet is a " + recPet2 + " (" + recPet + ").");
		}
		// 2 + 3, 4, or 5 = Snake 3 
		if(resType == 2 && hrsHome == 3 || resType == 2 && hrsHome == 4 || resType == 2 && hrsHome == 5)
		{
			recPet = 3;
			System.out.println("then your recommended pet is a " + recPet3 + " (" + recPet + ").");
		}
		// 1 + 1 or 2 = Cat 4
		if(resType == 1 && hrsHome == 1 || resType == 1 && hrsHome == 2)
			{
				recPet = 4;
				System.out.println("then your recommended pet is a " + recPet4 + " (" + recPet + ").");
			}
		// 1 + 3, 4, or 5 = Hamster 5
		if(resType == 1 && hrsHome == 3 || resType == 1 && hrsHome == 4 || resType == 1 && hrsHome == 5)
			{
				recPet = 5;
				System.out.print("then your recommended pet is a " + recPet5 + " (" + recPet + ").");
			}
		// 3 !=5 = Fish 6
		if(resType == 3 && hrsHome != 5)
			{
				recPet = 6;
				System.out.println("then your recommended pet is a " + recPet6 + " (" + recPet + ").");
			}
		// 3 = 5 = Ants 7
		if(resType == 3 && hrsHome == 5)
			{
				recPet = 7;
				System.out.print("then your recommended pet is a " + recPet7 + " (" + recPet + ").");
			}
		// Print error message // Can't get this to work
		// else 
			// if(hrsHome != 1 || hrsHome != 2 || hrsHome != 3 || hrsHome != 4 || hrsHome != 5)
			// System.out.println("Error.");
			System.out.close();
	}
}
