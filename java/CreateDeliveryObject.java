
public class CreateDeliveryObject {

	public static void main(String[] args) {
		
		DeliveryClass aDelivery = new DeliveryClass(2001, 999, 10.0, 2); 
		aDelivery.showDelivery();
		
		DeliveryClass anotherDelivery = new DeliveryClass(2003, 1000, 15.0, 1); 
		anotherDelivery.showDelivery();
		
	}

}
