
import java.util.Scanner;

public class getPetAdvice 
{
	static int resType;
	static int hrsHome;
	int recPet;
	String recPetString;

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in); // instance of Scanner class called "input"	
		System.out.println("Where do you reside?");
		System.out.println("Enter: \n1 for Apartment \n2 for House \n3 for Dormitory"); 
		resType = input.nextInt();
		System.out.println("You entered " + resType);
		System.out.println();
		System.out.println("How many hours do you spend at home?");
		System.out.println("Enter: \n1 if 18 or more \n2 if 10 to 17 \n3 if 8 to 9 \n4 if 6 to 7 \n5 if 0 to 5");
		resType = input.nextInt();
		System.out.println("You entered " + hrsHome);
		PetAdvice getPetAdvice = new PetAdvice();
		// System.out.println("The recommended pet is " + PetAdvice.recPet + PetAdvice.recPetString);
	}
}
