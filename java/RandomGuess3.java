/*
 * LParis
 * MEID LAR2039199
 * 
 * Java Programming: Level I
 * CIS163_AA_Phillips
 * Class # 11483
 *  
 * lparis_Lesson_10.4
 * Chapter 6, Game Zone 14 Exercise (pp. 298-299)
 * RandomGuess3.java
 * 
 * Enhance the game so the player has to pick a number between 1 and 1,000.
 * Once the player has figured out the correct number, ask if they would like to play again using the Scanner class. 
 * If yes, restart the game with a new random number. If not, use the System.out.println(); method to display a message that thanks the user for playing the game
 */


import javax.swing.*;
import java.util.*;

public class RandomGuess3 
{
	public static void main(String[] args)
	{
		playRandomNumberGame();
		playAgain();
	}

	private static void playRandomNumberGame() 
	{
		String userInput;
		int guess;
		final int MAX = 1000;
		int random = 1 + (int)(Math.random() * MAX);
		System.out.println("Shhh...the secret number is " + random);
		String tooHigh = "Your guess is too high...try again.";
		String tooLow = "Your guess is too low...try again.";
		int guessCount = 0;
		
		do
		{
			userInput = JOptionPane.showInputDialog(null, "Guess the random number 1 through 1000", 
					"GUESS", JOptionPane.QUESTION_MESSAGE);
			guess = Integer.parseInt(userInput);
			
			if (guess > random)
			{
				JOptionPane.showMessageDialog(null, tooHigh, "HGIH", JOptionPane.INFORMATION_MESSAGE);
			}
			else
			{
				if (guess < random)
				{
					JOptionPane.showMessageDialog(null, tooLow, "LOW", JOptionPane.INFORMATION_MESSAGE);
				}
			}
			++guessCount;
		}
		while(guess != random);
		
		JOptionPane.showMessageDialog(null, "You guessed correctly. "
				+ "\n - Random number = " + random + "\n - Your guess = " + guess 
				+ " \nIt took you " + guessCount + " guess(es).", "CONGRATS!", JOptionPane.INFORMATION_MESSAGE);
	}
	
	private static void playAgain() 
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Do you want to play again?");
		System.out.print("\nEnter Y or N > ");
	    String response = input.nextLine().toLowerCase();
	    char responseChar = response.charAt(0);
	    
	    if (responseChar == 'y')
	    {
	    	playRandomNumberGame();
	    }
	    
		else
		{
			System.out.println("Thanks for playing the random number game.");
		}
		input.close();
	}
}
