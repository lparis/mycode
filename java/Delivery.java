package lparis_Lesson_6;
public class Delivery 
{
	private static int count = 0;
	private int deliveryYear;
	private int deliveryOrderId;
	private double deliveryWeight;
	private int deliveryLocation;
	private double deliveryFee;
	private String locationString;
	private final String orderIdString = "%04d\n";
	private boolean deliveryOvernight;
	private double overnightFee;
	private double totalDeliveryFee;
	
	public Delivery(int year, int orderId, double weight, int location, boolean night) 
	{
		deliveryYear = year;
		deliveryOrderId = orderId;
		deliveryWeight = weight;
		deliveryLocation = location;
		deliveryFee = calcDeliveryFee();
		locationString = setLocationString();
		deliveryOvernight = night;
		totalDeliveryFee = calcTotalDeliveryFee();
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
	
	public double calcTotalDeliveryFee()
	{
		if(deliveryOvernight == true)
		{
			overnightFee = 35.00;
			totalDeliveryFee = calcDeliveryFee() + overnightFee;
		}
		else if(deliveryOvernight != true)
		{
			overnightFee = 0.00;
			totalDeliveryFee = calcDeliveryFee();
		}
		return totalDeliveryFee;
	}
	
	public String setLocationString()
	{
		if(deliveryLocation == 1)
		{
			locationString = " (local destination) ";
		}
		else
			locationString = " (remote destination) ";
		
		return locationString;
	}
		
	public void showDelivery() 
	{
		System.out.println();
		System.out.println("DELIVERY " + count);
		System.out.println("Delivery year: " + deliveryYear);
		System.out.println("Delivery order ID: " + deliveryOrderId);
		System.out.printf("Delivery package weight (lbs): %.2f\n", deliveryWeight);
		System.out.println("Delivery location: " + deliveryLocation + locationString);
		System.out.println();
		System.out.println("DELIVERY " + count + " CONFIRMATION");
		System.out.print("Delivery number: " + deliveryYear);	
		System.out.printf(orderIdString, deliveryOrderId);
		System.out.printf("Base delivery fee: $%.2f\n", deliveryFee);
		System.out.printf("Overnight delivery: $%.2f\n", overnightFee);
		System.out.printf("Total delivery fee: $%.2f\n", totalDeliveryFee);
		System.out.println();
	}
}
