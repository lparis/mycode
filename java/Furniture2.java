

import javax.swing.*;

public class Furniture2 {
	
	public static void main(String[] args)
	{		
		String woodChoice; 			// Has to be string for showInputDialog()
		int input;
		String tableType = null; 	// Not sure why this has to be initialized but doesn't work if not
		int selection;
		boolean isYes;
		int tableAmt = 0;
		final int chairsAmt = 250;
		final int localShip = 25;
		final int outOfStateShip = 125;
		int totalAmt = 0;
		
		// Assigns the return value of showInputDialog to woodChoice variable
		woodChoice = JOptionPane.showInputDialog(null, "What type of wood do you want \nfor your table? Please enter:" +
		"\n1 for Pine \n2 for Oak \n3 for Mohagony", "Wood Table Choice", JOptionPane.QUESTION_MESSAGE);
		input = Integer.parseInt(woodChoice);
		
		// Can't figure out how to handle error for cancel selection?

		if (input == 1)
		{
			tableAmt = 100;
			tableType = "Pine";
			JOptionPane.showMessageDialog(null, tableType + " tables cost $" + tableAmt + ".");
		}
		if (input == 2)
		{
			tableAmt = 225;
			tableType = "Oak";
			JOptionPane.showMessageDialog(null, tableType + " tables cost $" + tableAmt + ".");
		}
		if (input == 3)
		{
			tableAmt = 310;
			tableType = "Mahagony";
			JOptionPane.showMessageDialog(null,  tableType + " tables cost $" + tableAmt + ".");
		}

		selection = JOptionPane.showConfirmDialog(null, "Do you want 4 chairs to \ngo with your new " + 
				tableType + " table \nfor only $" + chairsAmt + "?");
		isYes = (selection == JOptionPane.YES_OPTION);
		
		if (isYes == true)
		{
			JOptionPane.showMessageDialog(null, "Your order for a " + tableType + " table \nwith chairs is $" + (tableAmt + chairsAmt) + ".");
			totalAmt = tableAmt + chairsAmt;
		}				
		else 
		{
			JOptionPane.showMessageDialog(null, "Your order for a " + tableType + " is $" + tableAmt + ".");
			totalAmt = tableAmt;
		}
// Part B extension
		selection = JOptionPane.showConfirmDialog(null, "Local shipping is $" + localShip +"." + 
				"\nDo you need to ship out of state?" +
				"\nIf yes, the cost is $" + outOfStateShip + ".");
		isYes = (selection == JOptionPane.YES_OPTION);
		
		if (isYes == true)
		{
			JOptionPane.showMessageDialog(null, "Your total order " + 
					"\nwith out of state shipping \nis $" + (totalAmt + outOfStateShip) + "."); 
		}				
		else 
		{
			JOptionPane.showMessageDialog(null, "Your total order \nwith local shipping \nis $" + (totalAmt + localShip) + "."); 
		}
	}	
}
