/*
 * Java Project
 * CIS163_AA_Phillips
 * lparis Lesson 9.2 
 * Schedule.java
 */

package lparis_Lesson_9;
import java.util.Arrays;

import javax.swing.*;

class Schedule
{
	public static void main(String[] args)
	{
		String[][] classDayTime = new String[6][2];		// Creates space for a 2D array, 2 columns (0, 1) and 6 rows (5 to 0)
		classDayTime[0][0] = "CIS110";
		classDayTime[0][1] = "Thurs 3:30 pm";
		classDayTime[1][0] = "ENG210";
		classDayTime[1][1] = "Mon 8:30 am";
		classDayTime[2][0] = "GEO225";
		classDayTime[2][1] = "Tues 1:10 pm";
		classDayTime[3][0] = "CHM360";
		classDayTime[3][1] = "Wed 10:00 am";
		classDayTime[4][0] = "BIO100";
		classDayTime[4][1] = "Fri 5:00 pm";
		classDayTime[5][0] = "MTH501";
		classDayTime[5][1] = "Tues 9:15 am";

		String entry;
		int x;
		boolean courseIsFound = false;
		
		JOptionPane.showMessageDialog(null, "The course list is \n" + Arrays.deepToString(classDayTime)); // Quick way to verify 2D array population
		entry = JOptionPane.showInputDialog(null, "Enter the course code: ");
		
		for(x = 0; x < classDayTime.length; ++x)			// classDayTime.length is the length of the row (6); classDayTime[x].length is the # of columns (2)
		{													// This loops through the length of the array (all rows)
			if(classDayTime[x][0].contentEquals(entry))		// This compares the string entered against the string in the 1st col of each row in the array
			{
				courseIsFound = true;						// set the flag to true if found so you can handle the error if not found
				JOptionPane.showMessageDialog(null, classDayTime[x][0] + " is at " + classDayTime[x][1], "Course: " + classDayTime[x][0], JOptionPane.PLAIN_MESSAGE);
				x = classDayTime.length - 1; 				// Decrements the indexer
			}
		}
		if (!courseIsFound)
		{
			JOptionPane.showMessageDialog(null, "Sorry, '" + entry + "' is not in the system or offered this semester." + 
					"\nThese are the courses we offer: \n" + Arrays.deepToString(classDayTime), "Course not found", JOptionPane.ERROR_MESSAGE);
		}
	}
}