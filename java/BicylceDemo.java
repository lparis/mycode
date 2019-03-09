
// public class BicycleDemo implements Bicycle {

public class BicylceDemo {

	public static void main(String[] args) {
					
		// Create two new Bicycle objects
		Bicycle bike1 = new Bicycle();
		Bicycle bike2 = new Bicycle();
		
		// Invoke Bicycle methods to change bike1 state		
		bike1.changeCadence(50);
		bike1.speedUp(10);
		bike1.applyBrakes(5);
		bike1.changeGear(2);
		
		// Print state for bike1
		System.out.print("Bike 1: ");
		bike1.printStates();
		
		// Invoke Bicycle method to change bike2 state
		bike2.changeCadence(55);
		bike2.speedUp(20);
		bike2.changeGear(5);
		
		// Print state for bike2
		System.out.print("Bike 2: ");
		bike2.printStates();
		
		bike2.changeCadence(40);
		bike2.applyBrakes(15);
		bike2.changeGear(3);		
		
		// Print state for bike2
		System.out.print("Bike 2: ");
		bike2.printStates();
	}
}
