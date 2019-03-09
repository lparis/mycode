import javax.swing.JOptionPane;

public class TLA 
{
	public static void main(String[] args) 
	{
		String input, saveOriginalInput;
		int stringLength;
		int i;
		char c;
		input = JOptionPane.showInputDialog(null, "Please enter three words...");
				
		saveOriginalInput = input;
		stringLength = input.length();
		
		char a1 = 0, a2 = 0, a3 = 0;
		
		for (i = 0; i < stringLength; i++)
		{
			c = input.charAt(i);
			if (i == 0)
			{
				c = Character.toUpperCase(c);
				a1 = c; // + input.substring(1, stringLength);
			}
			else
				if (input.charAt(i) == ' ')
				{
					++i;
					c = input.charAt(i);
					c = Character.toUpperCase(c);
					a2 = c;
					input = input.substring(0, i) + c + input.substring(i + 1, stringLength);
					a3 = c;
				}
		}
		JOptionPane.showMessageDialog(null, "The three letter acronym for \n" + saveOriginalInput + "\nIs " + a1 + a2 + a3);
	}
}
