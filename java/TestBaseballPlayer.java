
public class TestBaseballPlayer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BaseballPlayer aCatcher = new BaseballPlayer(12, .218); // Creates a BaseballPlayer object named aCatcher with 12 id and .218 avg
		aCatcher.showPlayer();
		
		BaseballPlayer aShortStop = new BaseballPlayer(31, .385); // Creates a BaseballPlayer object name aShortStop with 31 id and .385 avg
		aShortStop.showPlayer();
		
		BaseballPlayer anOutfielder = new BaseballPlayer(44, .505);
		anOutfielder.showPlayer();		

	}

}
