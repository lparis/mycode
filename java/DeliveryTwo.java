
public class DeliveryTwo 
{
	private static int count = 0;
	private static int deliveryYear;
	private static int deliveryOrderId;
	private static int deliveryNumber;	
	private static double deliveryWeight; // 1 local or 2 remote
	private static int deliveryDistance; // low under 5; med1 5 to 20; med2 5 or more; high over 20 	
	private static double deliveryFee;
	
	public DeliveryTwo(int year, int orderID, double weight, int distance) 
	{
		deliveryYear = year; 
		deliveryOrderId = orderID;
		deliveryWeight = weight;
		deliveryDistance = distance;
	}
	
	public double setDeliveryFee() 
	{
		if(deliveryDistance == 1 && deliveryWeight < 5) 
		{
			deliveryFee = 12.00;
		}
		if(deliveryDistance == 1 && (deliveryWeight >= 5 && deliveryWeight <= 20))
		{
			deliveryFee = 16.50;
		}		
		if(deliveryDistance == 1 && deliveryWeight > 20)
		{
			deliveryFee = 22.00;
		}
		if(deliveryDistance == 2 && deliveryWeight < 5)
		{
			deliveryFee = 35.00;
		}		
		if(deliveryDistance == 2 && deliveryWeight >= 5)
		{
			deliveryFee = 47.95;
		}
		return deliveryFee;
	}
	
	public void showDelivery() 
	{
		System.out.println("----- DELIVERY ORDER-----");
		System.out.println("Delivery year: " + deliveryYear);
		System.out.println("Delivery order: " + deliveryOrderId);
		System.out.println("Delivery distance: " + deliveryDistance);
		System.out.println("----- DELIVERY CONFIRMATION-----");
		System.out.println("Delivery number: " + deliveryYear + deliveryOrderId);
		System.out.println("Delivery fee: " + deliveryFee);
	}


}
