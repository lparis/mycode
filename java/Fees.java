
import javax.swing.*;

public class Fees {

	public static void main(String[] args) {
		
		// int creditHours;
		double creditHours;
		double bookCosts;
		double totalFees;
		// final int athleticFee = 65;
		final double athleticFee = 65.00;
		// final int creditHourFee = 85;
		final double creditHourFee = 85.00;
		
		// How could I have used different data types?
		// How do I display two decimal places?
		
		String inputHours, inputBooks;
		
		inputHours = JOptionPane.showInputDialog(null, "Enter how many credits you are taking?", "Credit Hours dialog", 
				JOptionPane.INFORMATION_MESSAGE);
		// creditHours = Integer.parseInt(inputHours);
		creditHours = Double.parseDouble(inputHours);

		
		inputBooks = JOptionPane.showInputDialog(null, "How much you spent on books", "Book Costs dialog", 
				JOptionPane.QUESTION_MESSAGE);
		bookCosts = Double.parseDouble(inputBooks);
		
		totalFees = creditHours * creditHourFee + bookCosts + athleticFee;
		
		JOptionPane.showMessageDialog(null, "Your total fees are $" + totalFees + "." + 
				"\n\nThe tolal fee is calculated as follows: " +
				"\n\nThe number of credit hours you are taking (" + creditHours + ")," +
				"\ntimes the per hour fee ($" + creditHourFee + ")," + 
				"\nplus the amount you spent on books ($" + bookCosts + ")," +
				"\nplus the athletic fee ($" + athleticFee + ").");		

	}

}
