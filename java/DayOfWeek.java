/*
 * Java Project
 * CIS163_AA_Phillips
 * lparis Lesson 9.3 
 * DayOfWeek.java
 */

package lparis_Lesson_9;
import java.util.*;

public class DayOfWeek 
{
	enum Day {MON, TUES, WED, THURS, FRI, SAT, SUN}
	
	public static void main(String[] args) 
	{
		final String wkdHrs = "9 am to 9 pm";
		final String sunHrs = "11 am to 5 pm";
		final String satHrs = "9 am to 6 pm";
		String userEntry;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Here are the days we are open: ");
		
		for (Day day : Day.values()) // for enum enum id enum.values
		{
			System.out.println(day + " ");
		}
		
		System.out.println("Enter the day to get the hours we are open that day >> ");
		userEntry = input.nextLine();
		
		Day dayOfWeek = Day.valueOf(userEntry.toUpperCase());
		switch(dayOfWeek)
		{
		case MON:
			System.out.println(Day.MON + " hours are " + wkdHrs);
			break;
		case TUES:
			System.out.println(Day.TUES + " hours are " + wkdHrs);
			break;
		case WED:
			System.out.println(Day.WED + " hours are " + wkdHrs);
			break;
		case THURS:
			System.out.println(Day.THURS + " hours are " + wkdHrs);
			break;
		case FRI:
			System.out.println(Day.FRI + " hours are " + wkdHrs);
			break;
		case SAT:
			System.out.println(Day.SAT + " hours are " + satHrs);
			break;
		case SUN:
			System.out.println(Day.SUN + " hours are " + sunHrs);
			break;
		}
	input.close();
	}
}