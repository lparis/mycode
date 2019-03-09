import java.util.*;
import javax.swing.*;

public class ConvertDateNew 
{
	public static void main(String[] args) 
	{
		String enteredDate;
		String mm, dd, yyyy;
		int monthInt, dayInt, yearInt;
		
		final int NUMBER_OF_ITEMS = 12;
		int[] monthNumber = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
		String[] monthName = {"January ", "February ", "March ", "April ", "May ", "June ", "July ", "August ", "September ", "October ", "November ", "December "};
		int[] maxDaysInMonth = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		
		String month = null;
		boolean validMonth = false;
		boolean validDay = false;
		
		// Prompt for input; ensure 4 digits for the year
		do
		{
			enteredDate = JOptionPane.showInputDialog(null, "Enter a date in the format MM/DD/YYYY");
			// Break enteredDate string into tokens delimited by forward slash: mm, dd, yyyy
			StringTokenizer tokenizer = new StringTokenizer(enteredDate,"/");
			mm = tokenizer.nextToken();
			dd = tokenizer.nextToken();
			yyyy = tokenizer.nextToken();
		}
		while (yyyy.length() != 4);
		
		// Convert string tokens to integers so that 1 or 2 digits for days/months are accepted
		monthInt = Integer.parseInt(mm);
		dayInt = Integer.parseInt(dd);
		yearInt = Integer.parseInt(yyyy);
		
		if (monthInt > 0 && monthInt < 13)
		{
			validMonth = true;
		}
		else
			validMonth = false;
		
		for (int x = 0; x < NUMBER_OF_ITEMS; ++x)
		{
			if (dayInt <= maxDaysInMonth[x] && dayInt >= 1)
			{
				validDay = true;
			}
			else
				validDay = false;
		}
		
		if (validMonth == true && validDay == true)
		{
			for (int x = 0; x <= NUMBER_OF_ITEMS; ++x)
			{
				month = monthName[x + 1];
				JOptionPane.showMessageDialog(null, "The date is " + month + dayInt + ", " + yearInt, "DATE", JOptionPane.PLAIN_MESSAGE);
				x = monthNumber.length;
			}
		}

		else if (validMonth == false)
		{
			JOptionPane.showMessageDialog(null, "The month (MM) you entered is invalid.", "INVALID MM", JOptionPane.PLAIN_MESSAGE);
		}
		else if (validDay == false)
			{
				JOptionPane.showMessageDialog(null, "The day (DD) you entered is invalid.", "INVALID DD", JOptionPane.PLAIN_MESSAGE);
			}
	}
}
