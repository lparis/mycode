/*
 * Java Project
 * CIS163_AA_Phillips
 * lparis Lesson 8.2 
 * ConvertDate.java
 */

import java.util.*;
import javax.swing.*;

public class ConvertDateClass 
{
	public static void main(String[] args) 
	{
		String enteredDate, monthString = null;
		String month, day, year;
		int mm, dd, yyyy;
		boolean validDate = false;
		
		final int NUMBER_OF_ITEMS = 12;
		int[] monthNumber = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
		String[] monthName = {"January ", "February ", "March ", "April ", "May ", "June ", "July ", "August ", "September ", "October ", "November ", "December "};
		int[] maxDaysInMonth = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
				
		do
		{
			enteredDate = JOptionPane.showInputDialog(null, "Enter a date in the format MM/DD/YYYY");
			StringTokenizer tokenizer = new StringTokenizer(enteredDate,"/");
			month = tokenizer.nextToken();
			day = tokenizer.nextToken();
			year = tokenizer.nextToken();
		}
		while (year.length() != 4);
		
		mm = Integer.parseInt(month);
		dd = Integer.parseInt(day);
		yyyy = Integer.parseInt(year);
		
		for (int x = 0; x < NUMBER_OF_ITEMS; ++x)
		{
			if (mm == monthNumber[x] && dd <= maxDaysInMonth[x] && dd > 0 && mm <= 12 && mm > 0)
			{
				validDate = true;
				monthString = monthName[x];
				x = monthNumber.length;
			}
		}
		if (validDate)
		{
			JOptionPane.showMessageDialog(null, "The date is " + monthString + dd + ", " + yyyy, "DATE", JOptionPane.PLAIN_MESSAGE);
		}
		else
			JOptionPane.showMessageDialog(null, "The date is invalid.", "INVALID DATE", JOptionPane.PLAIN_MESSAGE);
	}
}
