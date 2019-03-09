package lparis_Lesson_6;
import java.util.Scanner;

public class CreateDelivery {

	public static void main(String[] args) 
	{
		Delivery aDelivery = new Delivery(2001, 99999, 4.9, 1, true); 
		aDelivery.showDelivery();
			
		Delivery anotherDelivery = new Delivery(2005, 1, 5.1, 2, false); 
		anotherDelivery.showDelivery();
		
		Delivery newDelivery;
		newDelivery = getDeliveryData();
		newDelivery.showDelivery();
		
		Delivery anotherNewDelivery; 
		anotherNewDelivery = getDeliveryData();
		anotherNewDelivery.showDelivery();
	}
	private static Delivery getDeliveryData() 
	{
		int year;  	
		int orderId;		
		double weight;
		int location;
		boolean night = false;
		Scanner input = new Scanner(System.in); 	

		do // Input 1 -- Delivery year
		{
			System.out.print("Enter the four-digit year between 2001 and 2005 > "); 
			year = input.nextInt(); 			
		}
		while(year < 2001 || year > 2005); 
		
		do // Input 2 -- Delivery order ID
		{
			System.out.print("Enter the delivery order ID between 1 and 99999 > ");
			orderId = input.nextInt();
		}
		while(orderId < 1 || orderId > 99999);
		
		do // Input 3 -- Delivery weight in pounds
		{
			System.out.print("Enter the package weight between 0.10 and 100 pounds > ");
			weight = input.nextDouble();
		}
		while(weight < 0.10 || weight > 100);
		
		do // Input 4 -- Delivery distance: 1 or 2
		{
			System.out.print("Enter the delivery destination: 1 if local, 2 if remote > ");
			location = input.nextInt();
		}
		while(!((location == 1) || (location == 2)));
		
		// Input 5 -- Overnight delivery
		System.out.print("Do you want overnight delivery for an additional $35.00? > ");
		if (input.next().equals("y"))
		{
		   night = true;
		}
		else
			night = false;

		Delivery aDelivery = new Delivery(year, orderId, weight, location, night);
		return aDelivery;
	}
}
