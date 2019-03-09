import javax.swing.*;

public class ThreeLetterAcronymPartlyWorking
{
	public static void main(String[] args)
	{
		String inputString;
		char a1 = 0;
		char a2 = 0;
		char a3 = 0;
		int x = 0;
		
		inputString = JOptionPane.showInputDialog(null, "Enter three words to generate a three letter acronym ", "TLA GENERATOR", JOptionPane.DEFAULT_OPTION);
		a1 = inputString.charAt(0);
		a1 = Character.toUpperCase(a1);
		
		while(x < inputString.length())
		{
			if (inputString.charAt(x) == ' ')
			{
				a2 = inputString.charAt(x + 1);
				a2 = Character.toUpperCase(a2);
				
				a3 = inputString.charAt(x + x); // Does not always work
				a3 = Character.toUpperCase(a3);
				
				x = inputString.length();
			}
			++x;
		}
		JOptionPane.showMessageDialog(null, "The 3 letter acronym for '" + inputString + "' is \n" + a1 + a2 + a3);
	}
}