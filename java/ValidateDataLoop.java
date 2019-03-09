import java.util.*;
public class ValidateDataLoop {

	public static void main(String[] args) {
		
		int userEntry;
		final int LIMIT = 99;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number no more than 2 digits > ");
		userEntry = input.nextInt();
		while(userEntry > LIMIT)
		{
			System.out.println("The number you entered was too high.");
			System.out.print("Enter a number no higher than " + LIMIT + ".");
			// userEntry = userEntry + 1; // This is an infinite loop!
			userEntry = input.nextInt();
		}
		System.out.println("You correctly entered a two digit number.");
	}
}
