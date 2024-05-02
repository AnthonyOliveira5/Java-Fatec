package semana02;

import javax.swing.JOptionPane;

public class While03 {

	public static void main(String[] args) {
		
		double total = 0, v = 0;
		
		do{
			String s = JOptionPane.showInputDialog("Valor?");
			if(s == null) break;
			v = Double.parseDouble(s);			
			total += v;
		}
		while(v!=0);
		JOptionPane.showMessageDialog(null, "Total: "+ total);
	}

}
