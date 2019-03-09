import java.util.*;

public class TimeInput {
	
	public static void main(String[] args) {
			
		int time; // Not initialized; value obtained from user input.
						
		Scanner inputDevice = new Scanner(System.in);
		System.out.print("Please enter the total time in minutes you worked.");
		time = inputDevice.nextInt();
		
		int hours = time / 60;
		int minutes = time % 60;
		
		System.out.print("If you worked " + time + " minutes today then you worked " + hours + " hours and " + minutes + " minute(s).");

	}

}
