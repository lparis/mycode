
import javax.swing.JOptionPane;

public class CreatePurchaseGUI {

	public static void main(String[] args) {
			
		Purchase newPurchaseOrder = new Purchase(); // Create new Purchase object named newPurchaseOrder
		String invNmb = null;
		String saleAmt = null;
		final String salesTax = "5% sales tax";
			
			
		// String invoiceNumberString;
		int inputInvoice;
		invNmb = JOptionPane.showInputDialog(null, "What is the invoice number? ", JOptionPane.QUESTION_MESSAGE);
		inputInvoice = Integer.parseInt(invNmb);
		newPurchaseOrder.setInvoiceNumber(inputInvoice);
			
		double inputSale;
		invNmb = JOptionPane.showInputDialog(null, "What is the sale amount? ", JOptionPane.QUESTION_MESSAGE);
		inputSale = Double.parseDouble(saleAmt);
		newPurchaseOrder.setSaleAmt(inputSale);
			
		Purchase MyPurchase = new Purchase();
		}		
	}
