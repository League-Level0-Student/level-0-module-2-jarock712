package _07_animal_farm;
import java.applet.AudioClip;
import javax.swing.JApplet;
import javax.swing.JOptionPane;
public class AnimalFarm {
	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {
			String animal = JOptionPane.showInputDialog("Which sort of animal sound would you like to play? (Cow, Duck, Dog, Cat, or Llama");
			if(animal.equalsIgnoreCase("Cow")) {
				playMoo();
			}
			if(animal.equalsIgnoreCase("Duck")) {
				playQuack();
			}
			if(animal.equalsIgnoreCase("Dog")) {
				playWoof();
			}
			if(animal.equalsIgnoreCase("Cat")) {
				playMeow();
			}
			if(animal.equalsIgnoreCase("Llama")) {
				playLlama();
			}
		}	 
	}
	static void playMoo() {
		playNoise(mooFile);
	}
	static void playQuack() {
		playNoise(quackFile);
	}
	static void playWoof() {
		playNoise(woofFile);
	}
	static void playMeow() {
		playNoise(meowFile);
	}
	static void playLlama() {
		playNoise(llamaFile);
	}
	static String quackFile = "quack.wav";
	static String mooFile = "moo.wav";
	static String woofFile = "woof.wav";
	static String meowFile = "meow.wav";
	static String llamaFile = "llama.wav";
	public static void playNoise(String soundFile) {
		try {
			AudioClip sound = JApplet.newAudioClip(AnimalFarm.class.getResource(soundFile));
			sound.play();
			Thread.sleep(3400);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
}