package semana02;

import javax.swing.JOptionPane;

public class While01 {

	public static void main(String[] args) {
		
		double total = 0;
		while(true) {
			double v = Double.parseDouble(
					JOptionPane.showInputDialog("Valor?"));
			if(v==0)break;
			total += v;
		}
		JOptionPane.showMessageDialog(null, "Total: "+ total);
	}

}
