/*
 * LParis
 * MEID LAR2039199
 * 
 * Java Programming: Level I
 * CIS163_AA_Phillips
 * Class # 11483
 *  
 * lparis_Lesson_10.1
 * Chapter 2, Game Zone 14 Exercise (p. 102)
 * MabLib.java
 * 
 * Use the JOptionPane class to acquire a minimum of six words from the user to include in the Mad Lib.
 * Ask the user if they would like to play the game again with a Confirm Dialog box using the JOptionPane.YES_NO_OPTION. 
 * If yes, ask the user for new words and redisplay the new Mad Lib using them.
 */



import javax.swing.JOptionPane;

public class MadLib 
{
	public static void main(String[] args) 
	{
		displayRhyme();
		int dialogButton = JOptionPane.YES_NO_CANCEL_OPTION;

		playMadLib();

		int dialogResult = JOptionPane.showConfirmDialog(null, "Do you want to play MadLib again?", "PLAY AGAIN?", dialogButton); // returns the index starting from 0.
		
		if(dialogResult == 0) // YES_OPTION returns 0
		{
			JOptionPane.showMessageDialog(null, "You chose YES " + JOptionPane.YES_OPTION);
			playMadLib();

		}
		else if (dialogResult == 1) // NO_OPTION returns 1
		{
			JOptionPane.showMessageDialog(null, "You chose NO (" + JOptionPane.NO_OPTION + "). \nGoodbye");

		}
		else if (dialogResult == 2) // CANCEL_OPTION returns 2
		{
			JOptionPane.showMessageDialog(null, "You chose CANCEL " + JOptionPane.CANCEL_OPTION);
		}
		
		else if (dialogResult == -1) // Close dialog
		{
			JOptionPane.showMessageDialog(null, "You chose CLOSE " + dialogButton);
		}
	}
	
	private static void displayRhyme()
	{
		String rhyme = "Who hung his hat on the moon?" +
				"\nThe owl in his bubble balloon." +
				"\nOne bright summer night" +
				"\nHe sailed out of sight," +
				"\nAnd, hooting like Lucifer, hung in delight" +
				"\nHis three-cornered hat on the moon.";
		
		JOptionPane.showMessageDialog(null, "The rhyme is \n\n" + rhyme);
	}
	
	private static void playMadLib()
	{
		String nn1, nn2, vrb1, vrb2, adj, adv, prp;  
		
		nn1 = JOptionPane.showInputDialog(null, "Enter a noun.", "NOUN", JOptionPane.INFORMATION_MESSAGE);
		adj = JOptionPane.showInputDialog(null, "Enter an adjective.", "ADJ", JOptionPane.INFORMATION_MESSAGE);
		vrb1 = JOptionPane.showInputDialog(null, "Enter a verb.", "VERB", JOptionPane.INFORMATION_MESSAGE);
		adv = JOptionPane.showInputDialog(null, "Enter an adverb.", "ADVERB", JOptionPane.INFORMATION_MESSAGE);
		nn2 = JOptionPane.showInputDialog(null, "Enter another noun.", "NOUN", JOptionPane.INFORMATION_MESSAGE);
		vrb2 = JOptionPane.showInputDialog(null, "Enter another verb.", "VERB", JOptionPane.INFORMATION_MESSAGE);
		prp = JOptionPane.showInputDialog(null, "Enter a preposition.", "PREP", JOptionPane.INFORMATION_MESSAGE);
		
		
		JOptionPane.showMessageDialog(null, "Your rhyme is..." + 
				"\nWho hung his hat on the " + nn1 + "?" +
				"\nThe " + nn2 + " in his " + adj + " balloon." +
				"\nOne " + adv + " summer night" +
				"\nHe " + vrb1 + " out of sight " + 
				"\nAnd, " + vrb2 + " like Lucifer, hung in delight" +
				"\nHis three-cornerd hat " + prp + " the moon.");
	}
}