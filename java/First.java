
public class First {

	public static void main(String[] args) {
		
		// Method calls		
		printMsg();
		nameAndAddress();
		// First.nameAndAddress(); // Full qualified method name works too, required if in separate class.
		// System.out.println("First Java App");		
	}
	
	public static void nameAndAddress()
	{
		System.out.println("Event Handler Inc.");
		System.out.println("2715 Cabrillo");
		System.out.println("SF 94121");
	}
	
	public static void printMsg()
	{
		System.out.println("First Lava Lamp");
	}

}
