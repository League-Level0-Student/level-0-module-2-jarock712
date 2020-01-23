package _01_intro_to_random;
import java.util.Random;
import javax.swing.JOptionPane;
public class IntroToRandom {
	public static void main(String[] args) {	
		int num = 0;
		Random ran = new Random();
		num = ran.nextInt();
		num = ran.nextInt((100 - 0)) + 100;
		num = ran.nextInt((75 - 25)) + 25;
		num = ran.nextInt((88 - -222)) + -222;
		JOptionPane.showMessageDialog(null, num);
	}
}