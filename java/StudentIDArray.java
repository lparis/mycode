/*
 * Java Project
 * CIS163_AA_Phillips
 * lparis Lesson 8.3 
 * StudentIDArray.java
 */

import javax.swing.*;

public class StudentIDArray 
{
	final static int NUM_RANGES = 10;
	static int[] studentID = {1234, 1235, 1236, 1237, 1238, 1239, 1240, 1241, 1242, 1243};
	static String[] firstName = {"Beach", "Playa", "Kahakai", "Hondartza", "Pantai", "Ufukoni", "Ting", "Dalampasigan", "Plage", "Uluwatu"};
	static double[] gpa = {2.5, 2.95, 4.0, 3.4, 1.9, 2.75, 3.33, 1.0, 3.75, 3.9};
	
	public static void main(String[] args) 
	{
		getInputID();	// Method call to get student ID input which returns input as integer
	}

	private static int getInputID() 
	{
		String inputID;
		int idInt;
		do
		{
			inputID = JOptionPane.showInputDialog(null, "Enter a valid four digit student ID");
		}
		while (inputID.length() != 4);
		idInt = Integer.parseInt(inputID);
		// JOptionPane.showMessageDialog(null, "You entered student ID " + idInt, "CONFIRM ID", JOptionPane.PLAIN_MESSAGE);
		getNameAndGpa(idInt);
		return idInt;
	}
	
	private static void getNameAndGpa(int idInt) 
	{
		boolean validID = false;
		String getFName = null;
		double getGpa = 0;
		
		for (int x = 0; x < NUM_RANGES; ++x)
		{
			if (idInt == studentID[x])
			{
				validID = true;
				getFName = firstName[x];
				getGpa = gpa[x];
			}
		}

		if (validID)
		{
			JOptionPane.showConfirmDialog(null, "-Student Info- \nNAME:  " + getFName + "\nGPA:     " + getGpa, "ID #" + idInt, JOptionPane.PLAIN_MESSAGE);
		}
		else
		{
			JOptionPane.showMessageDialog(null, "The ID you entered is not valid.", "INVALID ID", JOptionPane.PLAIN_MESSAGE);
			getInputID();
		}
	}
}