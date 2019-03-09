
/*
 * Java Project
 * CIS163_AA_Phillips
 * lparis Lesson 8.2 
 * ConvertDate.java
 */

import java.text.*;
import java.util.*;
import javax.swing.*;

public class ConvertDateDev 
{
	public static void main(String[] args) 
	{
		String inputDialogMsg = "Enter a date in the format MM/DD/YYYY";
		String msgDialog1 = "Date is ";
		// String msgDialog2 = "Day in the year is ";
				
		String enteredDate = JOptionPane.showInputDialog(null, inputDialogMsg);
		
		// Break enteredDate string into tokens: mm, dd, yyyy
		String mm, dd, yyyy;
		StringTokenizer tokenizer = new StringTokenizer(enteredDate,"/");
		mm = tokenizer.nextToken();
		dd = tokenizer.nextToken();
		yyyy = tokenizer.nextToken();
		// Test tokenization
		// System.out.println(mm);
		// System.out.println(dd);
		// System.out.println(yyyy);
		
		// Convert string tokens to ints so that 1 or two digits can be accepted
		int monthInt, dayInt, yearInt;
		monthInt = Integer.parseInt(mm);
		dayInt = Integer.parseInt(dd);
		yearInt = Integer.parseInt(yyyy);
		
		int[] validMonth = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
		String[] monthName = {"January ", "February ", "March ", "April ", "May ", "June ", "July ", "August ", "September ", "October ", "November ", "December "};
		int[] maxDaysInMonth = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		
		String month = null;
		
		int x = 0;
		if (dayInt > maxDaysInMonth[x])
		{
			JOptionPane.showMessageDialog(null, "You entered an invalid date", "ERROR", JOptionPane.ERROR_MESSAGE);
		}
		else
		{
			for (x = 0; x < validMonth.length; ++x)
			{
				
				if (monthInt == validMonth[x] || dayInt <= maxDaysInMonth[x])
				{
					month = monthName[x];
				}
			}
		}
		JOptionPane.showMessageDialog(null, msgDialog1 + month + dayInt + ", " + yearInt, "DATE", JOptionPane.NO_OPTION);
	}
}
		
/**		
		JOptionPane.showMessageDialog(null, outputMsg1 + convertDate.MONTH + convertDate.DAY_OF_MONTH + convertDate.YEAR);
		GregorianCalendar convertDate = new GregorianCalendar(month, day, year);

		
		System.out.println("The target date is " + getTargetDate.get(Calendar.YEAR) + "-" + (getTargetDate.get(Calendar.MONTH) + 1) + "-" + getTargetDate.get(Calendar.DATE) + ".");
		targetDayOfYear = getTargetDate.get(Calendar.DAY_OF_YEAR);
		System.out.println("The target day of the year is day " + getTargetDate.get(Calendar.DAY_OF_YEAR) + " of " + daysInYear + " days this year.");
		System.out.println();
		
		// Prints target date and day to message dialog
		JOptionPane.showMessageDialog(null, "The target date is " + getTargetDate.get(Calendar.YEAR) + "-" + (getTargetDate.get(Calendar.MONTH) + 1) + "-" + getTargetDate.get(Calendar.DATE) + ".");
		JOptionPane.showMessageDialog(null, "The target day is day " + getTargetDate.get(Calendar.DAY_OF_YEAR) + " of " + daysInYear + " days this year.");
		
		// Performs the math
		daysToTargetDate = targetDayOfYear - currentDayOfYear;
		monthsToTargetDate = daysToTargetDate / 30;
		remDays = daysToTargetDate - (monthsToTargetDate * 30);
		
		// Prints the result to console
		System.out.println("There are " + daysToTargetDate + " days until summer, approximately " + monthsToTargetDate + " months and " + (remDays) + " days.");
		
		// Prints the result to a message dialog
		JOptionPane.showMessageDialog(null, "There are " + daysToTargetDate + " days until summer, approximately " + monthsToTargetDate + " months and " + (remDays) + " days.");
	}	
}
**/

