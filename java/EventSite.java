
public class EventSite 
{
	private int siteNumber; // data field
	private double hourlyFee; 
	private String siteName;
	
	/**
	public EventSite() // Default constructor, sets site number to 999
	{
		siteNumber = 999;
		hourlyFee = 100;
		siteName = "Uluwatu";
	}
	**/

	public int getSiteNumber() // method
	{
		return siteNumber;		
	}
	
	public void setSiteNumber(int n) // method
	{
		siteNumber = n;
	}
	
	public double getSiteHourlyFee() // method
	{
		return hourlyFee;		
	}
	
	public void setSiteHourlyFee(double d) // method
	{
		hourlyFee = d;
	}
	
	public String getSiteName() // method
	{
		return siteName;		
	}
	
	public void setSiteName(String s) // method
	{
		siteName = s;
	}
}
