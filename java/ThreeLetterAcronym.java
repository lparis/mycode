import javax.swing.JOptionPane;

public class ThreeLetterAcronym
{
	public static void main(String[] args)
	{
		String inputPhrase = null;
	    StringBuilder threeLetterAcronym = new StringBuilder();
	    
		inputPhrase = JOptionPane.showInputDialog(null, "Enter three words to generate a \nthree letter acronym (TLA)...", "TLA GENERATOR", JOptionPane.DEFAULT_OPTION);

	    int first = inputPhrase.indexOf(' ');
        int second = inputPhrase.indexOf(' ', ++first);
        int third = inputPhrase.indexOf(' ', ++second);
                
        char firstInitial = inputPhrase.charAt(0);
        firstInitial = Character.toUpperCase(firstInitial);
        
        char secondInitial = inputPhrase.charAt(first);
        secondInitial = Character.toUpperCase(secondInitial);
        
        char thirdInitial = inputPhrase.charAt(second);
        thirdInitial = Character.toUpperCase(thirdInitial);
        
        threeLetterAcronym.insert(0, firstInitial);
        threeLetterAcronym.insert(1, secondInitial);
        threeLetterAcronym.insert(2, thirdInitial);

        JOptionPane.showMessageDialog(null, "Success! \nThe TLA for '" + inputPhrase + "' is " + threeLetterAcronym);
	}
}
