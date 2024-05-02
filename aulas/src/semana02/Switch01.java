package semana02;

import javax.swing.JOptionPane;

public class Switch01 {
	public static void main(String[] args) {
		int n = Integer.parseInt(
				JOptionPane.showInputDialog("Número?"));
		switch (n) {
			case 1: System.out.println("Um");break;
			case 2: System.out.println("Dois");break;
			case 3: System.out.println("Três");break;
		default:
			System.out.println("Desconhecido!");
		}
	}
}
