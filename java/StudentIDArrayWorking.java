/*
 * Java Project
 * CIS163_AA_Phillips
 * lparis Lesson 8.3 
 * StudentIDArray.java
 */

import javax.swing.*;

public class StudentIDArrayWorking 
{
	public static void main(String[] args) 
	{
		final int NUM_RANGES = 10;
		int[] studentID = {1234, 1235, 1236, 1237, 1238, 1239, 1240, 1241, 1242, 1243};
		String[] firstName = {"Jones", "Smith", "Abdullah", "Banres", "Xiou", "Kowalski", "Sanpiper", "Garcia", "Ubumake", "Uluwatu"};
		double[] gpa = {2.5, 2.95, 3.4, 4.0, 1.9, 2.0, 3.33, 3.0, 3.75, 1.0};
		
		int idInt = getInputID(); // Method call to get student ID input which returns input as int

		JOptionPane.showConfirmDialog(null, "You entered student ID " + idInt, "CONFIRM ID", JOptionPane.YES_NO_OPTION);
		
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
			JOptionPane.showConfirmDialog(null, "Student ID: " + idInt + "\nStudent Name: " + getFName + "\nStudent GPA: " + getGpa, "NAME and GPA", JOptionPane.PLAIN_MESSAGE);
		}
		else
		{
			JOptionPane.showInputDialog(null, "That ID is not valid. Try again.");
		}
	}

	private static int getInputID() 
	{
		String inputID;
		int idInt;
		do
		{
			inputID = JOptionPane.showInputDialog(null, "Enter a four digit student ID");
		}
		while (inputID.length() != 4);
		idInt = Integer.parseInt(inputID);
		return idInt;
		
	}
}
