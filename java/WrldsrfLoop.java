import java.util.*;

public class WrldsrfLoop 
{
	// public static void main(String[] args)
	// enterLoop() is no arg method that enters a loop
	public static void enterLoop()
	{
		int loopCount = 1; // Named control variable initialized to starting value
		while(loopCount <= 10) // Loop control variable is tested in the while statement; is boolean either true or false 
		{
			System.out.println("Hello wrldsrf loop " + loopCount); // Executes if test expression is true
			loopCount++; // Increments by 1
			// loopCount = loopCount + 1;			
		}
	}
}
