package _04_validation;
import java.util.Random;
import javax.swing.JOptionPane;
public class Validation {
	public static void main(String[] args) {
		Random randomMaker = new Random();
		int randomNumber = randomMaker.nextInt(5-1)+1;
		System.out.println(randomNumber);
		// 1. Use each value of randomNumber to give the user a random compliment.
		if (randomNumber == 1) {
			JOptionPane.showMessageDialog(null, "You look great!");
		}
		if (randomNumber == 2) {
			JOptionPane.showMessageDialog(null, "Hope you have a good day.");
		}
		if (randomNumber == 3) {
			JOptionPane.showMessageDialog(null, "Your work is amazing!");
		}
		if (randomNumber == 4) {
			JOptionPane.showMessageDialog(null, "You're very well dressed...");
		}
		if (randomNumber == 5) {
			JOptionPane.showMessageDialog(null, "You have the best advice!");
		}
		// 2. Repeat all the code above 10 times
		
		// 3. Find someone to test out your program. They will like it :)
	}
}