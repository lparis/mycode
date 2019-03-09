

public class CookiesCommission 
{	
	int cookiesSold;
	double commission = 0.0;
	double salesBonus = 0.0;
	final String worker = "Worker ";
	int workerCount;
	static int counter = 1;
	
	public CookiesCommission() 
	{
		// Default no arg constructor
		cookiesSold = 100;			// Sets cookiesSold at 100
		workerCount = counter++;	// Increments object count
		calculateCookiesCommission(cookiesSold);	// Calls for the math
		System.out.println("Worker " + workerCount + " sold " + cookiesSold + " cookies, " +
				"earned $" + commission + " commission and $" + salesBonus + " sales bonus.");		
	}	
	public CookiesCommission(int i)
	{
		// Constructor with cookiesSold int arg
		cookiesSold = i;
		workerCount = counter++;
		calculateCookiesCommission(cookiesSold);
		System.out.print("Worker " + workerCount + " sold " + cookiesSold + " cookies, " + 
				"earned $" + commission + " commission and $" + salesBonus + " sales bonus.");
		System.out.println();
	}
	
	// Method to calculate commission
	private void calculateCookiesCommission(int cookiesSold)
	{
		if (cookiesSold > 100)
		{
			commission = 35.00;
			salesBonus = (cookiesSold - 100) * 10.00;
			{
				if (cookiesSold < 25)
				{
					commission = 25.0;
					salesBonus = 0.0;
				}
			}
		}
		else
		{
			commission = 35.00;
			salesBonus = 0.0;
		}					
	}
}

	