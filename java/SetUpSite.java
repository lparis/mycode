import java.util.*;
// import javax.swing.JOptionPane;

public class SetUpSite {
	
	public static void main(String[] args) { // main method for site app
		
		final int FOUNDED_YEAR = 2006; // constant
		int currentYear; // variable holds current year
		int age; // variable holds age of org
		
		Scanner input = new Scanner(System.in); // Console input
		// JOptionPane input = new JOptionPane(System.in); // UI input
		// JOptionPane pane = new JOptionPane(System.in);
		EventSite oneSite = new EventSite();
		int siteNum;
		
		statementOfPhilosophy(); // Statement, calls statementofPhilosphy() below
		
		System.out.print("Enter the current year: ");
		currentYear = input.nextInt(); // Input statement; "input" does not work with JOptionPane
		// currentYear = showInputDialog(null, "What is the current year? ");
		
		System.out.println("Enter the event site number: ");
		siteNum = input.nextInt();
		
		oneSite.setSiteNumber(siteNum);
		
		age = calculateAge(FOUNDED_YEAR, currentYear);
		
		System.out.println("Founded in " + FOUNDED_YEAR);
		System.out.println("Serving you for " + age + " years.");
		
		System.out.println("The site nubmer is " + oneSite.getSiteNumber());
		System.out.println("The site hourly fee is " + oneSite.getSiteHourlyFee());
		System.out.println("The site name is " + oneSite.getSiteName());
	} 		
	
	public static void statementOfPhilosophy() {
		System.out.println("hey wrldsrf");
		System.out.println("Make your next surf");
		System.out.println("Your best surf");
	}
	
	// calculateAge() performs the math and returns the difference to the calling function
	public static int calculateAge(int originYear, int currDate) {
		int years;
		years = currDate - originYear;
		return years;		
	}
}
