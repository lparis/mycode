
public class SumFifty {

	public static void main(String[] args) {
		
		int number = 1;
		int limit = 25;
		int sum = 0;
		
		while(number <= limit)
		{
			sum += number;
			
			if(number < limit)
				System.out.print(number + " + ");
			// if(number < limit && number % number == 0)
				// System.out.println(number + " + ");
			else
				System.out.print(number);
			
			number++;
		}
		
		System.out.print(" = " + sum);
	}
}
