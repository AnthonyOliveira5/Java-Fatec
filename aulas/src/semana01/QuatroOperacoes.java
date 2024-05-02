package semana01;

import javax.swing.JOptionPane;

public class QuatroOperacoes {
	public static void main(String[] args) {
		
		String s1 = JOptionPane.showInputDialog("n1:");
		String s2 = JOptionPane.showInputDialog("n2:");
		
		double n1 = Double.parseDouble(s1);
		double n2 = Double.parseDouble(s2);
		
		JOptionPane.showMessageDialog(null, 
				"Soma: " + (n1+n2) +
				"\nSubtração: " + (n1-n2) +
				"\nMultiplicação: " + (n1*n2) +
				"\nDivisão: " + (n1/n2));
					
	}
}
