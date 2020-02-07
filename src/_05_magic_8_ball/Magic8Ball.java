package _05_magic_8_ball;
import java.util.Random;
import javax.swing.JOptionPane;
public class Magic8Ball {
public static void main(String[] args) {
	int randomNumber = new Random().nextInt(4);
	System.out.println(randomNumber);
	JOptionPane.showInputDialog("Ask any question to the Magic 8 Ball...");
	if (randomNumber == 0) {
		JOptionPane.showMessageDialog(null, "Yes");
	}
	if (randomNumber == 1) {
		JOptionPane.showMessageDialog(null, "No");
	}
	if (randomNumber == 2) {
		JOptionPane.showMessageDialog(null, "Maybe ask Google?");
	}
	if (randomNumber == 3) {
		JOptionPane.showMessageDialog(null, "Interesting");
	}
}
}