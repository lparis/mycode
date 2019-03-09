
import java.util.*;

public class CalendarDemo {
	
	// If you do it here it is a class variable, available to all methods in the class
	// private static int MONTH = GregorianCalendar.MONTH + 0;


	public static void main(String[] args) 
	{	
		// If you do it here it is only available to this method 
		// But, doing it here is not performing the math
		// It is adding it to the Java number
		// int MONTH = GregorianCalendar.MONTH + 0;
		
		// Create an instance of the GregorianCalendar class named "now"		
		GregorianCalendar now = new GregorianCalendar();
		System.out.println("YEAR: " + now.get(Calendar.YEAR));
		// Doing it here adds the 1 properly
		System.out.println("MONTH: " + (now.get(Calendar.MONTH) + 1));
		System.out.println("DATE: " + now.get(Calendar.DATE));
		System.out.println();
		System.out.println("WEEK_OF_YEAR: " + now.get(Calendar.WEEK_OF_YEAR));
		System.out.println("WEEK_OF_MONTH: " + now.get(Calendar.WEEK_OF_MONTH));
		System.out.println("DAY_OF_MONTH: " + now.get(Calendar.DAY_OF_MONTH));
		System.out.println("DAY_OF_YEAR: " + now.get(Calendar.DAY_OF_YEAR));
		System.out.println("DAY_OF_WEEK: " + now.get(Calendar.DAY_OF_WEEK));		
	}
}
