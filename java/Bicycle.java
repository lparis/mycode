
public class Bicycle {	
	// Bicycle class -- template for bike objects
	
	// Fields (state) NOUNS, also called variables
	// Initialized with values
	int cadence = 0;
	int speed = 0;
	int gear = 1;
	
	// Methods (behavior) VERBS, also called functions	
	void changeCadence(int newValue) {
		cadence = newValue;
	}
	void changeGear(int newValue) {
		gear = newValue;
	}	
	void speedUp(int increment) {
		speed = speed + increment;
	}	
	void applyBrakes(int decrement) {
		speed = speed - decrement;
	}	
	void printStates() {
		System.out.println("cadence = " + cadence + ", speed = " + speed + ", gear = " + gear + ".");
	}
}

/**
public interface Bicycle {	
	public void changeCadence(int newValue);
	public void changeGear(int newValue);
	public void speedUp(int increment);	
	public void applyBrakes(int decrement);
	// public void printStates() {
	//	System.out.println("cadence = " + cadence + ", speed = " + speed + ", gear =" + gear) + ".");
	// };
}
**/	