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
}
	// 5. If the random number is 0

	// -- tell the user "Yes"

	// 6. If the random number is 1

	// -- tell the user "No"

	// 7. If the random number is 2

	// -- tell the user "Maybe you should ask Google?"

	// 8. If the random number is 3

	// -- write your own answer

}
