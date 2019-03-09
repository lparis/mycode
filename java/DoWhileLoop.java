// Do while loop used for validation

import java.util.Scanner;

public class DoWhileLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		int answer;
		
		do
		{
			System.out.print("Enter the secret number: ");
			answer = input.nextInt();
		}
		while(answer != 100);
		System.out.println("Congrats.");

	}

}
