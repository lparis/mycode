package lparis_Lesson_6;
public class Purchase {

	static int invoiceNumber;
	static double saleAmtBeforeTax;
	static final double salesTaxRate = 0.05;
	static String saleTaxString = "5%";
	static double salesTax;
	static double saleAmount;
	static int objectCount = 0;
	
	public void setInvoiceNumber(int invNmb) // Input
	{
		invoiceNumber = invNmb; // Assignment
		objectCount = objectCount + 1;
	}
	
	public static int getInvoiceNumber() // Return
	{
		return invoiceNumber;
	}
		
	public void setSaleAmt(double saleAmt) // Input
	{
		saleAmtBeforeTax = saleAmt;
		salesTax = saleAmtBeforeTax * salesTaxRate;
		saleAmount = saleAmtBeforeTax + salesTax; // Assignment
	}
	
	public double getSaleAmt() // Return
	{
		return saleAmount;
	}
	
	public void displayPurchase()
	{
		System.out.println();
		System.out.println("PURCHASE ORDER " + objectCount);
		System.out.println("Invoice number: " + getInvoiceNumber());
		System.out.print("Sale amount: ");
		System.out.printf("$%.2f", saleAmtBeforeTax);
		System.out.print("\nSales tax (" + saleTaxString + "): ");
		System.out.printf("$%.2f", salesTax);
		System.out.printf("\nTotal sale: ");
		System.out.printf("$%.2f", getSaleAmt());
	}
}
