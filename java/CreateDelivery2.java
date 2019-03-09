import java.util.Scanner;

public class CreateDelivery2 {

	public static void main(String[] args) {
				
		Delivery myDelivery;
		myDelivery = getDeliveryData();
		displayDelivery(myDelivery);		
	}
	
	public static Delivery getDeliveryData()	// Method to get delivery input
	{
		int deliveryYear = 0;  		// Local variables for input
		int deliveryOrder = 0;		
		double deliveryWeight = 0;
		int deliveryDistance = 0;
		
		Delivery newDelivery = new Delivery(deliveryDistance, deliveryDistance, deliveryWeight, deliveryDistance);	// Create new input delivery
		Scanner input = new Scanner(System.in); 		// Create new scanner object named input

		do // Input 1 -- Delivery year
		{
			System.out.print("Enter four-digit year between 2001 and 2005 > "); // Prompt user
			deliveryYear = input.nextInt(); // Takes input and assigns to variable			
		}
		while(deliveryYear < 2001 || deliveryYear > 2005); // Do not proceed until year is in proper range
		newDelivery.setDeliveryYear(deliveryYear); // Pass input 1 to Delivery object
		System.out.println("You entered " + newDelivery.getDeliveryYear() + " for the year.");
		
		do // Input 2 -- Delivery order ID
		{
			System.out.print("Enter the delivery order ID between 1 and 99999 > ");
			deliveryOrder = input.nextInt();
		}
		while(deliveryOrder < 1 || deliveryOrder > 99999);
		newDelivery.setDeliveryOrder(deliveryOrder); // Pass input 2 to Delivery object
		System.out.println("You entered " + newDelivery.getDeliveryOrder() + " for the delivery order ID.");
		
		do // Input 3 -- Delivery weight in pounds
		{
			System.out.print("Enter the package weight between 0.10 pound and 100 pounds > ");
			deliveryWeight = input.nextDouble();
		}
		while(deliveryWeight < 0.10 || deliveryWeight > 100);
		newDelivery.setDeliveryWeight(deliveryWeight); // Pass input 3 to Delivery object
		System.out.println("You entered " + newDelivery.getDeliveryWeight() + " for the package weight.");
		
		do // Input 4 -- Delivery distance: 1 or 2
		{
			System.out.print("Enter the delivery distance: 1 if local or 2 if remote > ");
			deliveryDistance = input.nextInt();
		}
		while(!((deliveryDistance == 1) || (deliveryDistance == 2)));
		newDelivery.setDeliveryDistance(deliveryDistance); // Pass input 4 to Delivery object
		System.out.println("You entered " + newDelivery.getDeliveryDistance() + " for the delivery location.");

		return newDelivery;
	}
	public static void displayDelivery(Delivery aDelivery)
	{
		aDelivery.showDelivery();
	}
}