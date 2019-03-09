package lparis_Lesson_6;
import java.util.*;

public class CreatePurchase {

	public static void main(String[] args) {
		
		Purchase newPurchaseOrder = new Purchase(); // Create new Purchase object named newPurchaseOrder
		int invNmb = 0;  							// Variable for input
		float saleAmt = 0;							// Variable for user input
		Scanner input = new Scanner(System.in); 	// Create new scanner object named input
		
		do
		{
			System.out.print("Enter an invoice number between 1000 and 8000 >"); // Prompt user
			invNmb = input.nextInt(); // Takes input and assigns to variable			
		}
		while(invNmb < 1000 || invNmb > 8000); // Do not proceed until invoice number is in proper range
		
		System.out.println("You entered invoice number " + invNmb + ".");
		newPurchaseOrder.setInvoiceNumber(invNmb); // Pass input 1 to Purchase object
		
		do
		{
			System.out.print("Enter the sale amount > $");
			saleAmt = input.nextFloat();
		}
		while(saleAmt <= 0);
		
		System.out.println("You entered a sale amount of $" + saleAmt + ".");
		newPurchaseOrder.setSaleAmt(saleAmt); // Pass input 2 to Purchase object
		
		newPurchaseOrder.displayPurchase();
		
		input.close();
	}
}