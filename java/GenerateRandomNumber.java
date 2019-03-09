import java.util.*;;

public class GenerateRandomNumber 
{	
	public static int generateRandomNumber() 
	{
		Random ran = new Random();
		final int LIMIT = 10;
		int randomNumber;
		randomNumber = ran.nextInt(LIMIT);
		return randomNumber;
	}
}
