
public class BaseballPlayer {
	
	// Class variables, private
	
	private static int count = 0;
	private int number;
	private double battingAverage;
	
	
	// Class definition
	// BaseballPlayer accepts two inputs: id and avg and increments the count
	
	public BaseballPlayer(int id, double avg) {
		
		number = id;
		battingAverage = avg;
		count = count + 1;
	}
	
	public void showPlayer() {
		
		System.out.println("Player number " + number + ", batting average is " + battingAverage +
				". There are " + count + " players.");
	}

}
