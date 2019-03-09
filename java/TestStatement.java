
public class TestStatement {

	public static void main(String[] args) {
		// Statement to call testStatement		
		testStatement();		
	}

	public static void testStatement() {
		
		System.out.println("Calling method from another class...");
		System.out.println();
		SetUpSite.statementOfPhilosophy(); // Method call
		System.out.println();
		System.out.println("Successfully called method SetUpSite.statementOfPhilosophy");
		System.out.println();
		System.out.println("Calling method from another class...");
		System.out.println();
		SetUpSite.calculateAge(0, 0); // Method call with method input
		System.out.println();
		System.out.println("Successfully called method SetUpSite.calculateAge");

	}
}
