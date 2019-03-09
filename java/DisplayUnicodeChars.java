// Display every character between Unicode 65 and 122
// Start new line after 20 characters

public class DisplayUnicodeChars {

	public static void main(String[] args) 
	{
		char letter;
	    int a;
	    // final int MIN = 65; // Original
	    // final int MAX = 122; // Original
	    final int MIN = 33;
	    final int MAX = 127;
	    // final int MIN = 0;
	    // final int MAX = 127;
	    
	    for(a = MIN; a < MAX; a++) // Initialize; Test; Update
	    {
	      letter = (char)a; // Cast a to letter/char
	      System.out.println(letter + " (Unicode " + a + ") ");
	    }
	    System.out.println("\n--- End of Unicode ---");
	}

}
