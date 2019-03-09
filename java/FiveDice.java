import java.util.Arrays;

/*
 * LParis
 * MEID LAR2039199
 * 
 * Java Programming: Level I
 * CIS163_AA_Phillips
 * Class # 11483
 * 
 * lparis_Lesson_10.2
 * Chapter 4, Game Zone 13-14 Exercises (p. 209)
 * FiveDice.java
 * 
 * Enhance the FiveDice class so that it stores the randomly “thrown” dice in an array of Die objects. 
 * Display the results for both the player and computer for each round.
 */



// FiveDice application randomly throws 5 dice and displays their values for 2 players
public class FiveDice 
{
	public static void main(String[] args)
	{
		System.out.print("Player 1 rolls:");
		rollDice();
		// System.out.println(rollDice());
		System.out.print("\nComputer rolls:");
		rollDice();
	}
	
	// Creates 5 die objects with random values and returns results
	public static void rollDice()
	{
		Die[] die = new Die[5];

		for (int i = 0; i < die.length; ++i)
		{
			die[i] = new Die();
			die[i].setRandomValue();
			System.out.print(" " + die[i].getRandomValue());
			// Arrays.fill(die, i);
		}
		// return die;
	}
}
