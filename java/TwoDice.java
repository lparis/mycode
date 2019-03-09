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
 * TwoDice.java
 * 
 * Enhance the FiveDice class so that it stores the randomly “thrown” dice in an array of Die objects. 
 * Display the results for both the player and computer for each round.
 */



public class TwoDice 
{
	static int d1Wins = 0, d2Wins = 0, ties = 0;
	
	public static void main(String[] args) 	
	{
		int i;
		
		for (i = 1; i <= 5; i++)
		{
			throwTwoDice(i); // Method call to roll the die five times
		}
		if (d1Wins > d2Wins) // Show match winner
		{
			System.out.println("Dice 1 wins the match " + d1Wins + " to " + d2Wins + " with " + ties + " tie(s).");
		}
		if (d1Wins < d2Wins)
		{
			System.out.println("Dice 2 wins the match " + d2Wins + " to " + d1Wins + " with " + ties + " tie(s).");
		}
		if (d1Wins == d2Wins)
		{
			System.out.println("The match was a tie " + d2Wins + " to " + d1Wins + " with " + ties + " tie(s).");
		}
	}

	private static void throwTwoDice(int i) // Throw 2 dice, show winner for each roll
	{
		System.out.println("- Roll " + i + " -");
		
		Die die1 = new Die();
		die1.setRandomValue();
		System.out.println("Dice 1 = " + die1.getRandomValue());
		
		Die die2 = new Die();
		die2.setRandomValue();
		System.out.println("Dice 2 = " + die2.getRandomValue());
		
		String winner;
		
		if (die1.getRandomValue() > die2.getRandomValue())
		{
			winner = "Dice 1 wins";
			++d1Wins;
			System.out.println(winner);
		}
		if (die1.getRandomValue() < die2.getRandomValue())
		{
			winner = "Dice 2 wins";
			++d2Wins;
			System.out.println(winner);
		}
		if (die1.getRandomValue() == die2.getRandomValue())
		{
			winner = "Tie";
			++ties;
			System.out.println(winner);
		}
		System.out.println();
	}
}

