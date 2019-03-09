

import javax.swing.*;

public class Furniture {
	
	public static void main(String[] args)
	{		
		String woodChoice; 			// Has to be string for showInputDialog()
		int input;
		String tableType = null; 	// Not sure why this has to be initialized but doesn't work if not
		int selection;
		boolean isYes;
		int tableAmt = 0;
		final int chairsAmt = 250;
		
		// Assigns the return value of showInputDialog to woodChoice variable
		woodChoice = JOptionPane.showInputDialog(null, "What type of wood do you want \nfor your table? Please enter:" +
		"\n1 for Pine \n2 for Oak \n3 for Mohagony", "Wood Table Choice", JOptionPane.QUESTION_MESSAGE);
		input = Integer.parseInt(woodChoice);

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
			// tableAmt = 500;
		}

		selection = JOptionPane.showConfirmDialog(null, "Do you want 4 chairs to \ngo with your new " + 
				tableType + " table \nfor only $" + chairsAmt + "?");
		isYes = (selection == JOptionPane.YES_OPTION);
		
		if (isYes == true)
		{
			JOptionPane.showMessageDialog(null, "Your total order is $" + (tableAmt + chairsAmt) + "."); 
		}				
		else 
		{
			JOptionPane.showMessageDialog(null, "Your table order is $" + tableAmt + "."); 
		}
	}	
}
