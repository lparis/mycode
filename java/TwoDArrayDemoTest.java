import java.util.Scanner;

public class TwoDArrayDemoTest 
{
	public static void main(String[] args) 
	{
		// int[] count = new int[3];
		Scanner input = new Scanner(System.in);
		int row; // , column;
		final int QUIT = 9;
		
		System.out.print("Enter a row or " + QUIT + " to quit > ");
		row = input.nextInt();
		
		while(row != QUIT);
		{
			System.out.print("You entered " + row);
			row++;
			// column = input.nextInt();
		}
		input.close();
	}
}