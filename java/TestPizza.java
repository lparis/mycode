public class TestPizza {

	public static void main(String[] args) {
		
			testDefaultPizza();
			testPizza();		
		}
	
	// Tests default constructor. If none then system default used, numbers = 0, chars = unicode, boolean = false, objects null.
	public static void testDefaultPizza() {
		
		Pizza customPizza = new Pizza();
		
		System.out.println("Testing default constructor pizza...");
		System.out.println("The default pizza has " + Pizza.getToppings() + 
				" for toppings, is " + Pizza.getSize() + " inches, and costs $" + Pizza.getPrice() + ".");
		System.out.println();
	}

	public static void testPizza() {
		
		System.out.println("Testing custom pizza order...");
		System.out.println("Pizza order confirmation:");
		Pizza.setSize(15);
		Pizza.setToppings("tomato, basil, garlic, suasage");
		Pizza.setPrice(25.0);
			
		System.out.println("- Size is " + Pizza.getSize() + " inches");
		System.out.println("- Toppings are " + Pizza.getToppings());
		System.out.println("- Price is $" + Pizza.getPrice());			
	}
}
