/*
 * LParis
 * MEID LAR2039199
 * 
 * Java Programming: Level I
 * CIS163_AA_Phillips
 * Class # 11483
 *  
 * lparis_Lesson_10.5
 * Chapter 9, Exercise 5 (pp. 420-421)
 * SalonReport.java
 * 
 * Enhance the program by displaying a menu that asks the user how they want to sort the services menu. 
 * 1) Sort by Service Description, 2) Sort by Price, 3) Sort by Time (Minutes), or 0) to Exit. 
 * Add a do...while() loop that keeps prompting the user for the next preferred sort order until the user finally chooses “0” to exit
 */


import javax.swing.*;

import java.text.*;

public class SalonReport 
{
	public static void main(String[] args) 
	{		
		Service[] SalonService = new Service[6];
		int i = 0;
		String message = null, entry;
		SalonService[0] = new Service("Cut", 8.00, 15);
		SalonService[1] = new Service("Shampoo", 4.00, 10);
		SalonService[2] = new Service("Manicure", 18.00, 30);
		SalonService[3] = new Service("Style", 48.00, 55);
		SalonService[4] = new Service("Perm", 18.00, 35);
		SalonService[5] = new Service("Trim", 6.00, 5);
		
		do
		{
			entry = JOptionPane.showInputDialog(null, "Sort salon services by \n(D)escription [alphabetical]"
					+ "\n(P)rice [low to high] \n(T)ime [in minutes] \nOr enter '0' to exit.");
			
			if (entry.charAt(i) == 'D' || entry.charAt(i) == 'd')
			{
				descSort(SalonService, i);
				message = "----- Salon services sorted by DESCRIPTION -----";
				display(SalonService, SalonService.length - 1, message);
			}
			
			if (entry.charAt(i) == 'P' || entry.charAt(i) == 'p')
			{
				 priceSort(SalonService, i);
				message = "----- Salon serivces sorted by PRICE -----";
				display(SalonService, SalonService.length - 1, message);
			}
				
			if (entry.charAt(i) == 'T' || entry.charAt(i) == 't')
			{
				timeSort(SalonService, i);
				message = "----- Salon services sorted by TIME -----";
				display(SalonService, SalonService.length - 1, message);
			}
			if (entry.charAt(i) == '0')
			{
				JOptionPane.showMessageDialog(null, "You chose to exit the program.", "EXIT", JOptionPane.PLAIN_MESSAGE);
			}
		}
		while (entry.charAt(i) != '0');
	}
	
	public static void descSort(Service[] salonService, int len) 
	{
		int a, b;
		Service temp;
		
		for (a = 0; a < salonService.length - 1; a++)
		{
			for(b = a + 1; b < salonService.length; b++)
			{
				if(salonService[a].getServiceDesc().compareToIgnoreCase(salonService[b].getServiceDesc()) > 0)
				{
					temp = salonService[a];
					salonService[a] = salonService[b];
					salonService[b] = temp;
				}
			}
		}
	}

	public static void priceSort(Service[] salonService, int len) 
	{
		int a, b;
		Service temp;
		int highSub = salonService.length - 1;
		
		for (a = 0; a < highSub; ++a)
		{
			for (b = 0; b < highSub; ++b)
			{
				if (salonService[b].getPrice() > salonService[b + 1].getPrice())
				{
					temp = salonService[b];
					salonService[b] = salonService[b + 1];
					salonService[b + 1] = temp;
				}
			}
		}
	}

	public static void timeSort(Service[] salonService, int len) 
	{
		int a, b;
		Service temp;
		int highSub = salonService.length - 1;
		
		for (a = 0; a < highSub; ++a)
		{
			for (b = 0; b < highSub; ++b)
			{
				if (salonService[b].getTime() > salonService[b + 1].getTime())
				{
					temp = salonService[b];
					salonService[b] = salonService[b + 1];
					salonService[b + 1] = temp;
				}
			}
		}
	}

	public static void display(Service[] s, int len,  String msg) 
	{
		DecimalFormat moneyFormat = new DecimalFormat("##.00");
		for(int i = 0; i <= len; i++)
		{
			int x = i + 1;
			msg = msg + "\nService " + x + ": " + s[i].getServiceDesc() 
					+ " | Price: $" + moneyFormat.format(s[i].getPrice()) 
					+ " | Time: " + s[i].getTime() + " mins";
		}
		JOptionPane.showMessageDialog(null, msg);
	}
}