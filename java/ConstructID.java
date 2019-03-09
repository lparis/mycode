import javax.swing.JOptionPane;

public class ConstructID
{
	public static void main(String[] args)
	{
		String inputPhrase = null;
	    StringBuilder initials = new StringBuilder();
	    StringBuilder street = new StringBuilder();
		
		inputPhrase = JOptionPane.showInputDialog(null, "Enter your full name and address.", "INPUT", JOptionPane.INFORMATION_MESSAGE);
		
	    int inputPhraseLength = inputPhrase.length();

	    int first = inputPhrase.indexOf(' ');
        int second = inputPhrase.indexOf(' ', ++first);
        int third = inputPhrase.indexOf(' ', ++second);
                
        char firstInitial = inputPhrase.charAt(0);
        firstInitial = Character.toUpperCase(firstInitial);
        
        char secondInitial = inputPhrase.charAt(first);
        secondInitial = Character.toUpperCase(secondInitial);
        
        char thirdInitial = inputPhrase.charAt(second);
        thirdInitial = Character.toUpperCase(thirdInitial);
        
        initials.insert(0, firstInitial);
        initials.insert(1, secondInitial);
        initials.insert(2, thirdInitial);

        for (int i = 0; i > inputPhraseLength; i++)
        {
        	if (Character.isDigit(i) == true)
        	{
        		street.insert(i, thirdInitial);
        	}
        	i++;
        }
        JOptionPane.showMessageDialog(null, "Your ID is " + initials + street);
	}
}
