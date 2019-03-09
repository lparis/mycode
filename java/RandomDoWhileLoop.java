import java.util.Scanner;

import javax.swing.JOptionPane;
public class RandomDoWhileLoop {

	public static void main(String[] args) 
	{		
		Scanner input = new Scanner(System.in);
		String userInput;
		int guess;
		int random = (1+ (int)(Math.random() * 10));
		System.out.println("The secret number is " + random);
		
		do
		{
			userInput = JOptionPane.showInputDialog(null, "Guess the random number 1 through 10");
			guess = Integer.parseInt(userInput);
			// System.out.print("Enter the secret number 1 through 10: ");
			// guess = input.nextInt();
		}
		while(guess != random);
		
		JOptionPane.showMessageDialog(null, "Congrats. The random number is " + random);
		// System.out.println("Congrats. The secret number is " + random);

	}

}
