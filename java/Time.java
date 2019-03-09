
// lparis Lesson 2 Time.java

public class Time {

	public static void main(String[] args) {
		
		// int minutes = 482;
		// int hours = minutes / 60;
		// int modulus = minutes % hours;
		// int finalMinutes = minutes - modulus;
		
		// Does not return right remainder.
		
		int time = 555; // Initialized value.
		int hours = time / 60;
		int minutes = time % 60;
		
		// Returns right remainder.
		
		System.out.println("Congratulations, you worked " + hours + " hours and " 
		+ minutes + " minute(s) today.");

	}

}
