import javax.swing.JOptionPane;

public class ThreeLetterAcronymWorking
{
	public static void main(String[] args)
	{
		String inputString;
		char a1 = 0;
		char a2 = 0;
		char a3 = 0;
		int x = 0;
		
		inputString = JOptionPane.showInputDialog(null, "Enter three words to generate a three letter acronym (TLA)...");
		
		while(x < inputString.length()) // while x is less than the length of the input string
		{
			if (inputString.charAt(x) == ' ')
			{
				a1 = inputString.charAt(0);
				a1 = Character.toUpperCase(a1);
				
				a2 = inputString.charAt(x + 1);
				a2 = Character.toUpperCase(a2);
				
				// a3 = inputString.charAt(x + (x + 1));
				a3 = inputString.charAt(x + x + x);
				a3 = Character.toUpperCase(a3);
				
				x = inputString.length();
			}
			++x;
		}
		JOptionPane.showMessageDialog(null, "The 3 letter acronym for '" + inputString + "' is \n" + a1 + a2 + a3);
	}
}