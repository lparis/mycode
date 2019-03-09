import java.util.Scanner;

public class DeliveryCreateNew {

	public static void main(String[] args) {
		
		DeliveryTwo myDelivery;
		myDelivery = getDeliveryData();
		displayDelivery(myDelivery);		
	}
	
	public static DeliveryTwo getDeliveryData()	// Method to get delivery input
	{
		int year = 0;  		// Local variables for input
		int order = 0;		
		double weight = 0;
		int distance = 0;
		
		DeliveryTwo newDelivery = new DeliveryTwo(year, order, weight, distance);	// Create new input delivery
		Scanner input = new Scanner(System.in); 		// Create new scanner object named input

		do // Input 1 -- Delivery year
		{
			System.out.print("Enter four-digit year between 2001 and 2005 > "); // Prompt user
			year = input.nextInt(); // Takes input and assigns to variable			
		}
		while(year < 2001 || year > 2005); // Do not proceed until year is in proper range
		
		// newDelivery.setDeliveryYear(deliveryYear); // Pass input 1 to Delivery object
		// System.out.println("You entered " + newDelivery.getDeliveryYear() + " for the year.");
		
		do // Input 2 -- Delivery order ID
		{
			System.out.print("Enter the delivery order ID between 1 and 99999 > ");
			order = input.nextInt();
		}
		while(order < 1 || order > 99999);
		//newDelivery.setDeliveryOrder(deliveryOrder); // Pass input 2 to Delivery object
		//System.out.println("You entered " + newDelivery.getDeliveryOrder() + " for the delivery order ID.");
		
		do // Input 3 -- Delivery weight in pounds
		{
			System.out.print("Enter the package weight between 0.10 pound and 100 pounds > ");
			weight = input.nextDouble();
		}
		while(weight < 0.10 || weight > 100);
		//newDelivery.setDeliveryWeight(deliveryWeight); // Pass input 3 to Delivery object
		//System.out.println("You entered " + newDelivery.getDeliveryWeight() + " for the package weight.");
		
		do // Input 4 -- Delivery distance: 1 or 2
		{
			System.out.print("Enter the delivery distance: 1 if local or 2 if remote > ");
			distance = input.nextInt();
		}
		while(!((distance == 1) || (distance == 2)));
		//newDelivery.setDeliveryDistance(deliveryDistance); // Pass input 4 to Delivery object
		//System.out.println("You entered " + newDelivery.getDeliveryDistance() + " for the delivery location.");

		return newDelivery;
	}
	public static void displayDelivery(DeliveryTwo myDelivery)
	{
		myDelivery.showDelivery();
	}
}

