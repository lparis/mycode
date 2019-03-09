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
 * Service.java
 * 
 * Enhance the program by displaying a menu that asks the user how they want to sort the services menu. 
 * 1) Sort by Service Description, 2) Sort by Price, 3) Sort by Time (Minutes), or 0) to Exit. 
 * Add a do...while() loop that keeps prompting the user for the next preferred sort order until the user finally chooses “0” to exit
 */

public class Service 
{
	String serviceDesc;
	double price;
	int time;
	
	public Service(String dsc, double prc, int tm)
	{
		serviceDesc = dsc;
		price = prc;
		time = tm;
	}
	
	public void setServiceDesc(String sdc)
	{
		this.serviceDesc = sdc;
	}
	
	public String getServiceDesc()
	{
		return serviceDesc;
	}
	
	public void setPrice(double prc)
	{
		this.price = prc;
	}
	
	public double getPrice()
	{
		return price;
	}
	
	public void setTime(int tm)
	{
		this.time = tm;
	}
	
	public int getTime()
	{
		return time;
	}
}
