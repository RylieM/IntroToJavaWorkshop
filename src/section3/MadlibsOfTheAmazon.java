package section3;

import javax.swing.JOptionPane;

public class MadlibsOfTheAmazon {
	
	public static void main(String[] args) {
		// Put this sentence in a pop up:
		// If you find yourself having to cross a piranha-infested river, here's how to do it...
		String name= JOptionPane.showInputDialog("If you find yourself having to cross a \npiranha-infested river, here's how to do it...");
		// Get the user to enter an adjective
String lame = JOptionPane.showInputDialog(" Enter adjetive here");
		// Get the user to enter a type of liquid
String fame= JOptionPane.showInputDialog("enter a type of liquid here");
		// Get the user to enter a body part
String came= JOptionPane.showInputDialog("Enter a body part here");
		// Get the user to enter a verb
String bee= JOptionPane.showInputDialog("Enter verb here");
		// Get the user to enter a place
String goat= JOptionPane.showInputDialog("Enter a place.");



		// Fit the user's words into this sentence, and save it in a String:
		
		JOptionPane.showMessageDialog(null," Piranhas are more "+lame+" during the day, so cross the river at\n" + 
				"		 night. Piranhas are attracted to fresh "+fame+" and will most\n" + 
				"		 likely take a bite out of your "+came+" if you "+bee+". Whatever\n" + 
				"		 you do, if you have an open wound, try to find another way to get\n" + 
				"		 back to the "+goat+". Good luck!");
		// Make a pop-up for the final story. You can use \n to go to the next line
		

	}
}

