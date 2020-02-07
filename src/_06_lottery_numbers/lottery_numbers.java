package _06_lottery_numbers;

import javax.swing.JOptionPane;

public class lottery_numbers {
public static void main(String[] args){
	int[] lottery = new int[6];
	int randomNum;
	for (int i = 0; i < 6; i++){
		randomNum = (int) (Math.random() * 50);
	    for (int x = 0; x < i; x++){
	    	if (lottery[i] == randomNum){
	    		randomNum = (int) (Math.random() * 50);
	        }
	    }
	        lottery[i] = randomNum;
	}
	String num = " ";
	for (int i = 0; i < lottery.length; i++) {
		num += lottery[i] + " ";
	}
	JOptionPane.showMessageDialog(null, num);
}
}