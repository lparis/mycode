import javax.swing.JOptionPane;

/* lparis_Lesson_2 
 * 
 * Class Dollars calculates and displays the conversion of an entered number of 
 * dollars into currency denominations -- 20s, 10s, 5s, and 1s.  
 * The program asks the user for the amount to be converted using showInputDialog().
 */

public class Dollars {

	public static void main(String[] args) {
		
		int amtToConvert;		
		String inputAmt;
		
		inputAmt = JOptionPane.showInputDialog(null, "How much money do you want to convert?", "Input dialog", 
				JOptionPane.INFORMATION_MESSAGE);
		amtToConvert = Integer.parseInt(inputAmt);
		
		int twenties = amtToConvert / 20;
		int twentiesTotal = twenties * 20;
		int remTwenties = amtToConvert - twentiesTotal;
		
		int tens = remTwenties / 10;
		int tensTotal = tens * 10;
		int remTens = remTwenties - (tens * 10);
		
		int fives = remTens / 5;
		int fivesTotal = fives * 5;
		int remFives = remTens - (fives * 5);

		int ones = remFives / 1;
		int onesTotal = ones * 1;
		int remOnes = remFives - (ones * 1);
				
		JOptionPane.showMessageDialog(null, "For $" + amtToConvert + " you have: " + 
		"\n\nTwenties = " + twenties + " ($" + twentiesTotal + ")" +
		"\nRemainder after twenties = " + remTwenties +
		"\nTens = " + tens + " ($" + tensTotal + ")" +
		"\nRemainder after tens = " + remTens + 
		"\nFives = " + fives + " ($" + fivesTotal + ")" +
		"\nRemainder after fives = " + remFives + 
		"\nOnes = " + ones + " ($" + onesTotal + ")" +
		"\nRemainder after ones = " + remOnes); 

	}

}
