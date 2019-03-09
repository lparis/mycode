import javax.swing.*;

public class UseParty {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		JOptionPane.showMessageDialog(null, "Creating a party");
		Party aParty = new Party();
		aParty.inputGuests();
		aParty.displayGuests();

		JOptionPane.showMessageDialog(null, "Creating a dinner party");
		DinnerParty aDinnerParty = new DinnerParty();
		aDinnerParty.inputGuests();
		aDinnerParty.inputDinnerChoice();
		aDinnerParty.displayGuests();
		aDinnerParty.displayDinnerChoice();
	}
}
