import javax.swing.*;

public class Party {
	private int guests; // num of guests expected at party

	public void displayGuests() {
		JOptionPane.showMessageDialog(null, "Guests: " + guests);
	}

	public void inputGuests() {
		String guestsString = new String(" ");
		guestsString = JOptionPane.showInputDialog(null,
				"Enter the number of party guests: ");
		guests = Integer.parseInt(guestsString);
	}
}