/*
 * Java Project
 * CIS163_AA_Phillips
 * lparis Lesson 8.2 
 * ConvertDate.java
 */

import java.util.*;
import javax.swing.*;

public class ConvertDateWorking3 
{
	static String enteredDate;
	static String mm, dd, yyyy;
	static int monthInt, dayInt, yearInt;
	
	static int[] monthNumber = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
	static String[] monthName = {"January ", "February ", "March ", "April ", "May ", "June ", "July ", "August ", "September ", "October ", "November ", "December "};
	static int[] maxDaysInMonth = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	
	static String month = null;
	static boolean validMonth;
	static boolean validDay;
	
	static int x;
	
	public static void main(String[] args) 
	{
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
		// Allows for the fact that the user might not precede a month or day number with a zero
		monthInt = Integer.parseInt(mm);
		dayInt = Integer.parseInt(dd);
		yearInt = Integer.parseInt(yyyy);
		
		validateMonth();
		validateDay();
		
		if (validMonth == true && validDay == true)
		{
			getDate();
		}
		else
			if (validMonth == false)
			{
				JOptionPane.showMessageDialog(null, "The month (MM) you entered is invalid.", "INVALID MM", JOptionPane.PLAIN_MESSAGE);
			}
			else
				JOptionPane.showMessageDialog(null, "The day (DD) you entered is invalid.", "INVALID DD", JOptionPane.PLAIN_MESSAGE);
	}
		
	private static void validateMonth() 
	{
		if (monthInt > 0 && monthInt < 13)
		{
			validMonth = true;
		}
		else
			validMonth = false;
	}
	
	private static void validateDay() 
	{
		for (x = 0; x < monthNumber.length; ++x)
		{
			if (dayInt <= maxDaysInMonth[x] && dayInt >= 1)
			{
				validDay = true;
			}
			else
				validDay = false;
		}
	}

	private static void getDate()
	{
		for (x = 0; x < monthNumber.length; ++x)
		{
			month = monthName[x];
			JOptionPane.showMessageDialog(null, "The date is " + month + dayInt + ", " + yearInt, "DATE", JOptionPane.PLAIN_MESSAGE);
			x = monthNumber.length;
		}
	}
}
		
