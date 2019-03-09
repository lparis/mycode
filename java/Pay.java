/*
 * LParis
 * MEID LAR2039199
 * 
 * Java Programming: Level I
 * CIS163_AA_Phillips
 * Class # 11483
 *  
 * lparis_Lesson_10.3
 * Chapter 5, Exercise 12 (p. 255)
 * Pay.java
 * 
 * Use three JOptionPane Confirm Dialog Boxes (using the JOptionPane.YES_NO_OPTION) to ask the worker if they want medical insurance, 
 * dental insurance, and long-term disability insurance, as the worker can enroll in more than one insurance option.
 * Use a do...while() loop to ask the user for their skill level. Keep looping until a valid skill level is provided.
 * Use a JOptionPane to show the worker’s gross pay
 */


import javax.swing.*;

import java.text.*;

public class Pay 
{
	public static void main(String[] args) 
	{
		String skillLevel, hoursWorked;
		int sklLvl, hrsWrkd;

	    do
		{
			skillLevel = JOptionPane.showInputDialog(null, "Enter your skill level.", "SKILLS", JOptionPane.QUESTION_MESSAGE);
			sklLvl = Integer.parseInt(skillLevel);
		}
		while (sklLvl != 1 && sklLvl != 2 && sklLvl != 3);
		
		hoursWorked = JOptionPane.showInputDialog(null, "Enter the hours you worked this week.", "HOURS", JOptionPane.QUESTION_MESSAGE);
		hrsWrkd = Integer.parseInt(hoursWorked);
		
		calcPay(hrsWrkd, sklLvl);
	}

	private static void calcPay(int hrsWrkd, int sklLvl) 
	{
		int regHrs, otHrs = 0;
		final double HPR1 = 17.00;
		final double HPR2 = 20.00;
		final double HPR3 = 22.00;
	    final double OT_RATE = 1.5;
	    final int FULL_WEEK = 40;
	    final double RET_PLAN = .03;
	    double MED_INS, DENTAL_INS, LTD_INS, retire;
	    double rate = 0, regPay = 0, otPay = 0, totPay = 0, deductions = 0, netPay = 0;

	    DecimalFormat moneyFormat = new DecimalFormat("0.00");

		if (hrsWrkd > FULL_WEEK)
		{
			regHrs = FULL_WEEK;
			otHrs = hrsWrkd - FULL_WEEK;
		}
		else
		{
			regHrs = hrsWrkd;
		}

		switch (sklLvl)
		{
			case 1:
				rate = HPR1;
				regPay = regHrs * rate;
				otPay = otHrs * (rate * OT_RATE);
				totPay = regPay + otPay;
				deductions = 0;
				netPay = totPay - deductions;
				break;
			
			case 2:
				if (getMedInsChoice())
					MED_INS = 32.50;
				else
					MED_INS = 0;
				if (getDentalInsChoice())
					DENTAL_INS = 20.00;
				else
					DENTAL_INS = 0;
				if (getLtdInsChoice())
					LTD_INS = 10.00;
				else
					LTD_INS = 0;
				rate = HPR2;
				regPay = regHrs * rate;
				otPay = otHrs * (rate * OT_RATE);
				totPay = regPay + otPay;
				deductions = MED_INS + DENTAL_INS + LTD_INS;
				netPay = totPay - deductions;
				break;
			
			case 3:
				if (getMedInsChoice())
					MED_INS = 32.50;
				else
					MED_INS = 0;
				if (getDentalInsChoice())
					DENTAL_INS = 20.00;
				else
					DENTAL_INS = 0;
				if (getLtdInsChoice())
					LTD_INS = 10.00;
				else
					LTD_INS = 0;
				rate = HPR3;
				regPay = regHrs * rate;
				otPay = otHrs * (rate * OT_RATE);
				totPay = regPay + otPay;
				if (getRetirePlanChoice())
					retire = totPay * RET_PLAN;
				else
					retire = 0;
				deductions = MED_INS + DENTAL_INS + LTD_INS + retire;
				netPay = totPay - deductions;
				break;
		}
		
		JOptionPane.showMessageDialog(null, "Hours worked: " + hrsWrkd + "\nHourly rate: $" + moneyFormat.format(rate) + "\nRegular pay: $" + moneyFormat.format(regPay) + 
				"\nOvertime pay: $" + moneyFormat.format(otPay) + "\nGross pay: $" + moneyFormat.format(totPay) + "\nDeductions: $" + moneyFormat.format(deductions) + 
				"\nNet pay: $" + moneyFormat.format(netPay), "PAYROLL RESULT", JOptionPane.INFORMATION_MESSAGE);
	}
	
	private static boolean getMedInsChoice() 
	{
	    int selection = 0;
		boolean medIns = false;
		String msg = null;
	    selection = JOptionPane.showConfirmDialog(null, "Do you want medical insurance for $32.50?", "MED INS", JOptionPane.YES_NO_OPTION);
	    if (selection == 0)		// YES returns 0
	    {
	    	medIns = true;
	    	msg = "YES";
	    }
	    else 
	    	if (selection == 1)	// NO returns 1 (cancel returns -1)
	    {
	    	medIns = false;
	    	msg = "NO";
	    }
	    JOptionPane.showMessageDialog(null, "You chose " + msg + " for medical insurance.");
		return medIns;
	}
	
	private static boolean getDentalInsChoice() 
	{
	    int selection = 0;
		boolean dentalIns = false;
		String msg = null;
	    selection = JOptionPane.showConfirmDialog(null, "Do you want dental insurance for $20.00?", "DENTAL INS", JOptionPane.YES_NO_OPTION);
	    if (selection == 0)	
	    {
	    	dentalIns = true;
	    	msg = "YES";
	    }
	    else 
	    	if (selection == 1)
	    {
	    	dentalIns = false;
	    	msg = "NO";
	    }
	    JOptionPane.showMessageDialog(null, "You chose " + msg + " for dental insurance.");
		return dentalIns;
	}
	
	private static boolean getLtdInsChoice() 
	{
	    int selection = 0;
		boolean ltdIns = false;
		String msg = null;
	    selection = JOptionPane.showConfirmDialog(null, "Do you want long term disability \ninsurance for $10.00?", "LTD INS", JOptionPane.YES_NO_OPTION);
	    if (selection == 0)	
	    {
	    	ltdIns = true;
	    	msg = "YES";
	    }
	    else 
	    	if (selection == 1)
	    {
	    	ltdIns = false;
	    	msg = "NO";
	    }
	    JOptionPane.showMessageDialog(null, "You chose " + msg + " for LTD insurance.");
		return ltdIns;
	}
	
	private static boolean getRetirePlanChoice() 
	{
	    int selection = 0;
		boolean retPlan = false;
		String msg = null;
	    selection = JOptionPane.showConfirmDialog(null, "Do you want to contribute 3% of \nyour gross salary to retirement?", "RETIRE", JOptionPane.YES_NO_OPTION);
	    if (selection == 0)	
	    {
	    	retPlan = true;
	    	msg = "YES";
	    }
	    else 
	    	if (selection == 1)
	    {
	    	retPlan = false;
	    	msg = "NO";
	    }
	    JOptionPane.showMessageDialog(null, "You chose " + msg + " for \nthe retirement plan.");
		return retPlan;
	}
}