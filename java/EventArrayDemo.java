
public class EventArrayDemo 
{
	public static void main(String[] args) 
	{
		Event[] someEvents = new Event[5];
		int x;
		
		for (x = 0; x < someEvents.length; ++x)
		{
			someEvents[x] = new Event(1);
			// someEvents[x] = new Event(0);
		}
		
		for (x = 0; x < someEvents.length; ++x)
		{
			System.out.println("Event type: " + someEvents[x].getType() + " Rate schedule: " + someEvents[x].getRate() + " Event manager: " + someEvents[x].getManager());
		}
	}
}
