public class DeliveryClass 
{	
	private static int count = 0;
	private int deliveryYear;
	private int deliveryOrderId;
	private double deliveryWeight;
	private int deliveryLocation;
	private double deliveryFee;
	private String locationString;
	
	public DeliveryClass(int year, int orderId, double weight, int location) 
	{
		deliveryYear = year;
		deliveryOrderId = orderId;
		deliveryWeight = weight;
		deliveryLocation = location;
		deliveryFee = calcDeliveryFee();
		locationString = setLocationString();
		count = count + 1;
	}
	
	public double calcDeliveryFee() 
	{
		if(deliveryLocation == 1 && deliveryWeight < 5) 
		{
			deliveryFee = 12.00;
		}
		if(deliveryLocation == 1 && (deliveryWeight >= 5 && deliveryWeight <= 20))
		{
			deliveryFee = 16.50;
		}		
		if(deliveryLocation == 1 && deliveryWeight > 20)
		{
			deliveryFee = 22.00;
		}
		if(deliveryLocation == 2 && deliveryWeight < 5)
		{
			deliveryFee = 35.00;
		}		
		if(deliveryLocation == 2 && deliveryWeight >= 5)
		{
			deliveryFee = 47.95;
		}
		return deliveryFee;
	}
	
	public String setLocationString()
	{
		if(deliveryLocation == 1)
		{
			locationString = " local delivery ";
		}
		else
			locationString = " remote delivery ";
		
		return locationString;
	}
	
	public void showDelivery() 
	{
		System.out.println();
		System.out.println("DELIVERY ORDER " + count);
		System.out.println("Delivery year: " + deliveryYear);
		System.out.println("Delivery order ID: " + deliveryOrderId);
		System.out.println("Delivery package weight: " + deliveryWeight + " lbs");
		System.out.println("Delivery location: " + deliveryLocation + locationString);
		System.out.println();
		System.out.println("DELIVERY ORDER " + count + " CONFIRMATION");
		System.out.println("Delivery number: " + deliveryYear + deliveryOrderId);
		System.out.println("Delivery fee: $" + deliveryFee);
		System.out.println();
	}
}
