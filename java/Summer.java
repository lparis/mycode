import java.util.*;
import javax.swing.*;

// Summer class calculates how many days it is from today until summer starts on June 21st
// Get today's date, get today's day of year, print target date and day, subtract from 6/21

public class Summer 
{
	static int currentDayOfYear;
	static int targetDayOfYear;
	static int daysToTargetDate;
	final static int daysInYear = 365;
	static int monthsToTargetDate; 
	static int remDays;
	
	public static void main(String[] args) 
	{			
		// Constructs GregorianCalendar object getToday with today's date
		GregorianCalendar getToday = new GregorianCalendar();
		
		// Gets current day of year
		currentDayOfYear = getToday.get(Calendar.DAY_OF_YEAR);
		
		// Outputs current date to console
		System.out.println("The date today is " + getToday.get(Calendar.YEAR) + "-" + (getToday.get(Calendar.MONTH) + 1) + "-" + getToday.get(Calendar.DATE) + ".");
		System.out.println("This is day " + currentDayOfYear + " of " + daysInYear + " days this year.");
		System.out.println();
		
		// Outputs current date and day to message dialog
		JOptionPane.showMessageDialog(null, "The date today is " + getToday.get(Calendar.YEAR) + "-" + (getToday.get(Calendar.MONTH) + 1) + "-" + getToday.get(Calendar.DATE) + ".");
		JOptionPane.showMessageDialog(null, "Today is day " + currentDayOfYear + " of " + daysInYear + " days this year.");
		
		// Constructs GregorianCalendar object with the given date set.
		// GregorianCalendar(int year, int month, int dayOfMonth)
		GregorianCalendar getTargetDate = new GregorianCalendar(2014, 1, 1);
		
		// Prints target date and day to console
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

