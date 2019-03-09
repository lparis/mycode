import java.util.Scanner;

public class CreateDeliveries 
{
	public static void main(String[] args) 
	{
		DeliveryClass aDelivery = new DeliveryClass(2001, 999, 10.0, 2); 
		aDelivery.showDelivery();
			
		DeliveryClass anotherDelivery = new DeliveryClass(2003, 1000, 15.0, 1); 
		anotherDelivery.showDelivery();
		
		DeliveryClass newDelivery;
		newDelivery = getDeliveryData();
		newDelivery.showDelivery();
		
		DeliveryClass anotherNewDelivery; 
		anotherNewDelivery = getDeliveryData();
		anotherNewDelivery.showDelivery();
	}
	
	private static DeliveryClass getDeliveryData() 
	{
		int year;  	
		int orderId;		
		double weight;
		int location;		
		Scanner input = new Scanner(System.in); 	

		do // Input 1 -- Delivery year
		{
			System.out.print("Enter four-digit year between 2001 and 2005 > "); 
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
			System.out.print("Enter the package weight between 0.10 pound and 100 pounds > ");
			weight = input.nextDouble();
		}
		while(weight < 0.10 || weight > 100);
		
		do // Input 4 -- Delivery distance: 1 or 2
		{
			System.out.print("Enter the delivery distance: 1 if local or 2 if remote > ");
			location = input.nextInt();
		}
		while(!((location == 1) || (location == 2)));

		DeliveryClass aDelivery = new DeliveryClass(year, orderId, weight, location);
		return aDelivery;
	}
}