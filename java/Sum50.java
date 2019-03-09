package lparis_Lesson_6;
public class Sum50 {

	public static void main(String[] args) {
		
		int number = 1;
		int limit = 50;
		int sum = 0;
		
		while(number <= limit) // while loop logic
		{
			sum += number; 	// add and assign operator; adds number to sum and assigns result to sum
							// If number = 1 and sum = 0, then sum = 1 (number + 1)
			
			if(number < limit)
				System.out.println(number + " + ");
			else
				System.out.println(number);
			
			number++; // increments number by 1
		}
		
		System.out.println(" = " + sum);
	}
}
