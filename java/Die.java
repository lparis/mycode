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
 * Die.java
 * 
 * Enhance the FiveDice class so that it stores the randomly “thrown” dice in an array of Die objects. 
 * Display the results for both the player and computer for each round.
 */


// Die class holds integer data field value (1 to 6)
public class Die 
{
	// Class variables are integer data field values (1 to 6)
	// Method call to setRandomValue()
	private final static int HIGHEST_DIE_VALUE = 6;
	private final static int LOWEST_DIE_VALUE = 1;
	private int randomValue;
	
	// Constructor randomly assigns a value to a die object
	public void setRandomValue()
	{
		randomValue = ((int)(Math.random() * 100) % HIGHEST_DIE_VALUE + LOWEST_DIE_VALUE);
	}
	
	// Class returns the object value
	public int getRandomValue()
	{
		return randomValue;
	}
}
