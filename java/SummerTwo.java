

import java.util.Calendar;
// import javax.swing.*;
import java.util.GregorianCalendar;
import java.util.*;
	// import javax.swing.*;

	// Summer class calculates how many days it is from today until summer starts
	// Summer starts on June 21st
	// Get today's date and subtract from 6/21

	public class SummerTwo 
	{
		static int currentDayOfYear;
		static int targetDayOfYear;
		static int daysToTargetDate;
		final static int daysInYear = 365;
		// static int monthsToTargetDate = daysToTargetDate / 30; 
		
		public static void main(String[] args) 
		{			
			// Constructs GregorianCalendar object getToday with today's date
			GregorianCalendar getToday = new GregorianCalendar();
			System.out.println("The date today is " + getToday.get(Calendar.YEAR) + "-" + (getToday.get(Calendar.MONTH) + 1) + "-" + getToday.get(Calendar.DATE) + ".");
			currentDayOfYear = getToday.get(Calendar.DAY_OF_YEAR);
			System.out.println("This is day " + currentDayOfYear + " of " + daysInYear + " days this year.");
			System.out.println();
			
			// Constructs GregorianCalendar object with the given date set.
			// GregorianCalendar(int year, int month, int dayOfMonth)
			GregorianCalendar getTargetDate = new GregorianCalendar(2014, 5, 21);
			System.out.println("The target date is " + getTargetDate.get(Calendar.YEAR) + "-" + (getTargetDate.get(Calendar.MONTH) + 1) + "-" + getTargetDate.get(Calendar.DATE) + ".");
			targetDayOfYear = getTargetDate.get(Calendar.DAY_OF_YEAR);
			System.out.println("The target day is day " + getTargetDate.get(Calendar.DAY_OF_YEAR) + " of " + daysInYear + " days this year.");
			
			System.out.println();
			daysToTargetDate = targetDayOfYear - currentDayOfYear;
			System.out.println("There are " + daysToTargetDate + " days until summer.");
			// System.out.println("Approximately " + monthsToTargetDate); 
					// + " months and " + (daysToTargetDate - (monthsToTargetDate * 30)) + " days.");
		}	
	}


//}
