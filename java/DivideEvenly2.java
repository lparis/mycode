public class DivideEvenly2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int number;
		final int LIMIT = 100;
		int var;
			
		for(number = 1; number <= LIMIT; ++number) // outer for loop: initialize, test, update
		{
			System.out.print(number + " is evenly divisible by ");
			for(var = 1; var <= number; ++var) 
				if(number % var == 0)
					System.out.print(var + " ");
			System.out.println();
		}

	}

}