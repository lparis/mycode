
public class CarDemo 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Car firstCar = new Car(2009, Model.MINIVAN, Color.BLUE);
		Car secondCar = new Car(2011, Model.CONVERTIBLE, Color.RED);
		firstCar.display(); // Calls the display() method
		secondCar.display();

	}

}
