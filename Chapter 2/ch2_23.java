import javax.swing.JOptionPane;

//Jerry Huang
//Period 4
//Project 2.23

public class ch2_23 {
	public static void main(String[] args) {
		//This program takes an ASCII code and displays its character
		
		//Get input
		String ASCIIString = JOptionPane.showInputDialog(null, "Enter an ASCII code:", "Input", JOptionPane.QUESTION_MESSAGE);
		int ASCII = Integer.parseInt(ASCIIString);
		
		//Converts to character
		char c = (char) ASCII;
		System.out.println("The character is " + c);
	}
}