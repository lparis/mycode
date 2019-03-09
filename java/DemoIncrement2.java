
public class DemoIncrement2 {

	public static void main(String[] args) {
		
		int v = 4;
		System.out.println();
		System.out.println("v is " + v);
		
		int plusPlusV = ++v; // Increments v by 1
		System.out.println();
		System.out.println("++v is " + plusPlusV);
		
		v = 4;
		System.out.println();
		System.out.println("v is " + v);

		int vPlusPlus = v++; // Increments
		System.out.println();
		System.out.println("v++ is " + vPlusPlus);
		
		int w = 17, x = 17, y = 18;
		boolean compare1 = (++w == y);
		boolean compare2 = (x++ == y);

		System.out.println();
		System.out.println("++17 is 18 is " + compare1);
		System.out.println("17++ is 18 is " + compare2);
	}

}
